package balbucio.focusnfe4j.nfse;

import balbucio.focusnfe4j.FocusNfeClient;
import balbucio.focusnfe4j.model.CancelRequest;
import balbucio.focusnfe4j.model.EmailRequest;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * API v2 - NFSe (Documentos Fiscais / Emissao).
 */
public class NfseService {
    private final FocusNfeClient client;

    public NfseService(FocusNfeClient client) {
        this.client = client;
    }

    /**
     * Emite uma NFSe: POST /v2/nfse?ref=...
     */
    public NfseStatusResponse emitir(String referencia, Object payload) {
        Map<String, String> q = FocusNfeClient.queryOf("ref", referencia);
        return client.sendJson("POST", "/v2/nfse", q, payload, NfseStatusResponse.class);
    }

    public JsonNode emitirRaw(String referencia, Object payload) {
        Map<String, String> q = FocusNfeClient.queryOf("ref", referencia);
        return client.sendJson("POST", "/v2/nfse", q, payload);
    }

    /**
     * Consulta NFSe: GET /v2/nfse/{ref}
     *
     * @param completa se true, adiciona completa=1 (quando suportado)
     */
    public NfseStatusResponse consultar(String referencia, boolean completa) {
        Map<String, String> q = new LinkedHashMap<>();
        if (completa) q.put("completa", "1");
        String path = "/v2/nfse/" + referencia;
        return client.sendJson("GET", path, q, null, NfseStatusResponse.class);
    }

    public NfseStatusResponse consultar(String referencia) {
        return consultar(referencia, false);
    }

    /**
     * Cancela NFSe: DELETE /v2/nfse/{ref}
     */
    public NfseStatusResponse cancelar(String referencia, String justificativa) {
        String path = "/v2/nfse/" + referencia;
        return client.sendJson("DELETE", path, null, new CancelRequest(justificativa), NfseStatusResponse.class);
    }

    /**
     * Reenvio de e-mail: POST /v2/nfse/{ref}/email
     */
    public JsonNode enviarEmail(String referencia, EmailRequest request) {
        String path = "/v2/nfse/" + referencia + "/email";
        return client.sendJson("POST", path, null, request);
    }
}

