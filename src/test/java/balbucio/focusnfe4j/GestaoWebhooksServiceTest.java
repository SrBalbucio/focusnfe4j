package balbucio.focusnfe4j;

import balbucio.focusnfe4j.gestao.model.Webhook;
import balbucio.focusnfe4j.gestao.model.WebhookCreateRequest;
import balbucio.focusnfe4j.testutil.TestHttpServer;
import com.fasterxml.jackson.databind.JsonNode;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class GestaoWebhooksServiceTest {

    @Test
    void criarWebhookPostsToV2Hooks() throws Exception {
        try (TestHttpServer srv = TestHttpServer.start(0, ex -> {
            byte[] bytes = ("{\"id\":\"1\",\"url\":\"https://example.com/hook\",\"event\":\"nfe_autorizada\",\"cnpj\":\"123\"}")
                    .getBytes(StandardCharsets.UTF_8);
            ex.getResponseHeaders().add("Content-Type", "application/json");
            ex.sendResponseHeaders(200, bytes.length);
            ex.getResponseBody().write(bytes);
            ex.close();
        })) {
            FocusNfeClient client = FocusNfeClient.builder()
                    .baseUri(srv.baseUri())
                    .token("t")
                    .build();

            WebhookCreateRequest req = new WebhookCreateRequest()
                    .setCnpj("123")
                    .setEvent("nfe_autorizada")
                    .setUrl("https://example.com/hook")
                    .setAuthorizationHeader("Authorization")
                    .setAuthorization("Bearer x");

            Webhook created = client.gestao().webhooks().criar(req);
            assertEquals("1", created.getId());

            TestHttpServer.CapturedRequest captured = srv.awaitRequest(2000);
            assertEquals("POST", captured.method);
            assertEquals("/v2/hooks", captured.uri.getPath());

            JsonNode body = client.getObjectMapper().readTree(captured.body);
            assertEquals("123", body.get("cnpj").asText());
            assertEquals("nfe_autorizada", body.get("event").asText());
            assertEquals("https://example.com/hook", body.get("url").asText());
            assertEquals("Authorization", body.get("authorization_header").asText());
            assertEquals("Bearer x", body.get("authorization").asText());
        }
    }

    @Test
    void reenviarNotificacoesNfePostsToV2NfeRefHook() throws Exception {
        try (TestHttpServer srv = TestHttpServer.start(0, ex -> {
            byte[] bytes = ("[{\"id\":\"1\",\"event\":\"nfe_autorizada\",\"url\":\"https://example.com\"}]")
                    .getBytes(StandardCharsets.UTF_8);
            ex.getResponseHeaders().add("Content-Type", "application/json");
            ex.sendResponseHeaders(200, bytes.length);
            ex.getResponseBody().write(bytes);
            ex.close();
        })) {
            FocusNfeClient client = FocusNfeClient.builder()
                    .baseUri(srv.baseUri())
                    .token("t")
                    .build();

            assertEquals(1, client.gestao().webhooks().reenviarNotificacoesNfe("abc").size());

            TestHttpServer.CapturedRequest captured = srv.awaitRequest(2000);
            assertEquals("POST", captured.method);
            assertEquals("/v2/nfe/abc/hook", captured.uri.getPath());
            assertTrue(captured.body == null || captured.body.isBlank());
        }
    }
}

