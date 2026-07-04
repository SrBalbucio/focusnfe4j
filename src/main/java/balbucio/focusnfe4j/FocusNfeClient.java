package balbucio.focusnfe4j;

import balbucio.focusnfe4j.http.FocusNfeJson;
import balbucio.focusnfe4j.http.FocusNfeTransport;
import balbucio.focusnfe4j.http.JdkHttpTransport;
import balbucio.focusnfe4j.model.FocusNfeError;
import balbucio.focusnfe4j.cep.CepService;
import balbucio.focusnfe4j.cnpj.CnpjService;
import balbucio.focusnfe4j.nfe.NfeService;
import balbucio.focusnfe4j.nfse.NfseService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.Base64;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Minimal Java 11 SDK client for FocusNFE.
 *
 * <p>Extensibility: service classes for each "categoria" can share this transport layer.</p>
 */
public final class FocusNfeClient {
    
    private final URI baseUri;
    private final String token;
    private final Duration requestTimeout;
    private final String userAgent;
    private final ObjectMapper objectMapper;
    private final FocusNfeTransport transport;

    private final NfeService nfeService;
    private final NfseService nfseService;
    private final balbucio.focusnfe4j.gestao.GestaoService gestaoService;
    private final CepService cepService;
    private final CnpjService cnpjService;

    private FocusNfeClient(Builder b) {
        this.baseUri = Objects.requireNonNull(b.baseUri, "baseUri");
        this.token = requireNonBlank(b.token, "token");
        this.requestTimeout = b.requestTimeout != null ? b.requestTimeout : Duration.ofSeconds(30);
        this.userAgent = b.userAgent != null ? b.userAgent : defaultUserAgent();
        this.objectMapper = b.objectMapper != null ? b.objectMapper : FocusNfeJson.defaultObjectMapper();

        HttpClient httpClient = b.httpClient != null ? b.httpClient : HttpClient.newBuilder()
                .connectTimeout(Duration.ofSeconds(10))
                .build();
        this.transport = b.transport != null ? b.transport : new JdkHttpTransport(httpClient);

        this.nfeService = new NfeService(this);
        this.nfseService = new NfseService(this);
        this.gestaoService = new balbucio.focusnfe4j.gestao.GestaoService(this);
        this.cepService = new CepService(this);
        this.cnpjService = new CnpjService(this);
    }

    public static Builder builder() {
        return new Builder();
    }

    public NfeService nfe() {
        return nfeService;
    }

    public NfseService nfse() {
        return nfseService;
    }

    public balbucio.focusnfe4j.gestao.GestaoService gestao() {
        return gestaoService;
    }

    public CepService cep() {
        return cepService;
    }

    public CnpjService cnpj() {
        return cnpjService;
    }

    public URI getBaseUri() {
        return baseUri;
    }

    public ObjectMapper getObjectMapper() {
        return objectMapper;
    }

    public URI resolveFileUri(String caminho) {
        if (caminho == null || caminho.isBlank()) {
            return null;
        }
        // API returns paths like "/v2/nfe/REF.xml" - make it absolute for convenience.
        return baseUri.resolve(caminho);
    }

    public <T> T sendJson(String method, String path, Map<String, String> query, Object body, Class<T> responseType) {
        try {
            HttpResponse<String> resp = transport.send(buildJsonRequest(baseUri, method, path, query, body));
            String respBody = resp.body();

            if (resp.statusCode() / 100 != 2) {
                FocusNfeError err = tryParse(respBody, FocusNfeError.class);
                String message = err != null && err.getMensagem() != null ? err.getMensagem() : ("HTTP " + resp.statusCode());
                throw new FocusNfeApiException(message, resp.statusCode(), respBody, err);
            }

            if (respBody == null || respBody.isBlank()) {
                if (responseType == String.class) {
                    return responseType.cast(respBody);
                }
                if (responseType == JsonNode.class) {
                    return responseType.cast(objectMapper.nullNode());
                }
                return null;
            }

            if (responseType == String.class) {
                return responseType.cast(respBody);
            }
            if (responseType == JsonNode.class) {
                return responseType.cast(objectMapper.readTree(respBody));
            }
            return objectMapper.readValue(respBody, responseType);
        } catch (IOException e) {
            throw new FocusNfeException("I/O error calling FocusNFE", e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new FocusNfeException("Interrupted calling FocusNFE", e);
        }
    }

    public JsonNode sendJson(String method, String path, Map<String, String> query, Object body) {
        return sendJson(method, path, query, body, JsonNode.class);
    }

    public <T> T sendJsonTo(URI baseUriOverride, String method, String path, Map<String, String> query, Object body, Class<T> responseType) {
        Objects.requireNonNull(baseUriOverride, "baseUriOverride");
        // Delegate by building a request to a different base URI but keep same transport/auth/json.
        try {
            HttpResponse<String> resp = transport.send(buildJsonRequest(baseUriOverride, method, path, query, body));
            String respBody = resp.body();

            if (resp.statusCode() / 100 != 2) {
                FocusNfeError err = tryParse(respBody, FocusNfeError.class);
                String message = err != null && err.getMensagem() != null ? err.getMensagem() : ("HTTP " + resp.statusCode());
                throw new FocusNfeApiException(message, resp.statusCode(), respBody, err);
            }

            if (respBody == null || respBody.isBlank()) {
                if (responseType == String.class) {
                    return responseType.cast(respBody);
                }
                if (responseType == JsonNode.class) {
                    return responseType.cast(objectMapper.nullNode());
                }
                return null;
            }

            if (responseType == String.class) {
                return responseType.cast(respBody);
            }
            if (responseType == JsonNode.class) {
                return responseType.cast(objectMapper.readTree(respBody));
            }
            return objectMapper.readValue(respBody, responseType);
        } catch (IOException e) {
            throw new FocusNfeException("I/O error calling FocusNFE", e);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new FocusNfeException("Interrupted calling FocusNFE", e);
        }
    }

    public JsonNode sendJsonTo(URI baseUriOverride, String method, String path, Map<String, String> query, Object body) {
        return sendJsonTo(baseUriOverride, method, path, query, body, JsonNode.class);
    }

    private HttpRequest buildJsonRequest(URI baseUriOverride, String method, String path, Map<String, String> query, Object body) throws JsonProcessingException {
        URI uri = buildUri(baseUriOverride, path, query);
        HttpRequest.Builder rb = HttpRequest.newBuilder(uri)
                .timeout(requestTimeout)
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .header("Authorization", basicAuthHeader(token));

        if (userAgent != null && !userAgent.isBlank()) {
            rb.header("User-Agent", userAgent);
        }

        if (body == null) {
            rb.method(method, HttpRequest.BodyPublishers.noBody());
        } else if (body instanceof String) {
            rb.method(method, HttpRequest.BodyPublishers.ofString((String) body));
        } else {
            rb.method(method, HttpRequest.BodyPublishers.ofString(objectMapper.writeValueAsString(body)));
        }
        return rb.build();
    }

    private URI buildUri(URI baseUriOverride, String path, Map<String, String> query) {
        String normalizedPath = path.startsWith("/") ? path : ("/" + path);
        URI basePlusPath = Objects.requireNonNull(baseUriOverride, "baseUriOverride").resolve(normalizedPath);
        if (query == null || query.isEmpty()) {
            return basePlusPath;
        }

        StringBuilder qs = new StringBuilder();
        for (Map.Entry<String, String> e : query.entrySet()) {
            if (e.getKey() == null || e.getKey().isBlank()) continue;
            if (qs.length() > 0) qs.append('&');
            qs.append(urlEncode(e.getKey())).append('=').append(urlEncode(e.getValue() != null ? e.getValue() : ""));
        }

        return URI.create(basePlusPath.toString() + "?" + qs);
    }

    private static String urlEncode(String value) {
        return URLEncoder.encode(value, StandardCharsets.UTF_8);
    }

    private static String basicAuthHeader(String token) {
        String raw = token + ":";
        return "Basic " + Base64.getEncoder().encodeToString(raw.getBytes(StandardCharsets.UTF_8));
    }

    private <T> T tryParse(String json, Class<T> type) {
        if (json == null || json.isBlank()) return null;
        try {
            return objectMapper.readValue(json, type);
        } catch (Exception ignored) {
            return null;
        }
    }

    private static String requireNonBlank(String value, String name) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException(name + " must not be blank");
        }
        return value;
    }

    private static String defaultUserAgent() {
        String v = FocusNfeClient.class.getPackage().getImplementationVersion();
        if (v == null || v.isBlank()) v = "dev";
        return "focusnfe4j/" + v;
    }

    public static final class Builder {
        private URI baseUri;
        private String token;
        private Duration requestTimeout;
        private String userAgent;
        private ObjectMapper objectMapper;
        private HttpClient httpClient;
        private FocusNfeTransport transport;

        public Builder environment(FocusNfeEnvironment env) {
            this.baseUri = Objects.requireNonNull(env, "env").getBaseUri();
            return this;
        }

        public Builder baseUri(URI baseUri) {
            this.baseUri = baseUri;
            return this;
        }

        public Builder token(String token) {
            this.token = token;
            return this;
        }

        public Builder requestTimeout(Duration requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }

        public Builder userAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        public Builder objectMapper(ObjectMapper objectMapper) {
            this.objectMapper = objectMapper;
            return this;
        }

        public Builder httpClient(HttpClient httpClient) {
            this.httpClient = httpClient;
            return this;
        }

        /**
         * Advanced: override transport (useful for tests).
         */
        public Builder transport(FocusNfeTransport transport) {
            this.transport = transport;
            return this;
        }

        public FocusNfeClient build() {
            if (baseUri == null) {
                baseUri = FocusNfeEnvironment.PRODUCTION.getBaseUri();
            }
            return new FocusNfeClient(this);
        }
    }

    // Small helper to keep service code terse.
    public static Map<String, String> queryOf(String k1, String v1) {
        Map<String, String> q = new LinkedHashMap<>();
        q.put(k1, v1);
        return q;
    }

    /**
     * URL-encodes a path segment (not a query param).
     */
    public static String encodePathSegment(String raw) {
        String enc = URLEncoder.encode(raw, StandardCharsets.UTF_8);
        // URLEncoder is for form encoding; in path segments we want %20, not '+'
        return enc.replace("+", "%20");
    }
}
