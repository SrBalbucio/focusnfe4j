package balbucio.focusnfe4j.nfe;

import balbucio.focusnfe4j.FocusNfeClient;
import balbucio.focusnfe4j.model.CancelRequest;
import balbucio.focusnfe4j.model.EmailRequest;
import balbucio.focusnfe4j.nfe.model.NfeRequest;
import balbucio.focusnfe4j.nfe.model.NfeStatusResponse;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * API v2 - NFe (Documentos Fiscais / Emissao).
 */
public class NfeService {
    private final FocusNfeClient client;

    public NfeService(FocusNfeClient client) {
        this.client = client;
    }

    /**
     * Emite uma NFe (assíncrono): POST /v2/nfe?ref=...
     */
    public NfeStatusResponse emitir(String referencia, NfeRequest payload) {
        Map<String, String> q = FocusNfeClient.queryOf("ref", referencia);
        return client.sendJson("POST", "/v2/nfe", q, payload, NfeStatusResponse.class);
    }

    public JsonNode emitirRaw(String referencia, NfeRequest payload) {
        Map<String, String> q = FocusNfeClient.queryOf("ref", referencia);
        return client.sendJson("POST", "/v2/nfe", q, payload);
    }

    /**
     * Consulta uma NFe: GET /v2/nfe/{ref}
     *
     * @param completa se true, adiciona completa=1 (quando suportado)
     */
    public NfeStatusResponse consultar(String referencia, boolean completa) {
        Map<String, String> q = new LinkedHashMap<>();
        if (completa) q.put("completa", "1");
        String path = "/v2/nfe/" + referencia;
        return client.sendJson("GET", path, q, null, NfeStatusResponse.class);
    }

    public NfeStatusResponse consultar(String referencia) {
        return consultar(referencia, false);
    }

    /**
     * Cancela uma NFe: DELETE /v2/nfe/{ref}
     */
    public NfeStatusResponse cancelar(String referencia, String justificativa) {
        String path = "/v2/nfe/" + referencia;
        return client.sendJson("DELETE", path, null, new CancelRequest(justificativa), NfeStatusResponse.class);
    }

    /**
     * Reenvio de e-mail: POST /v2/nfe/{ref}/email
     */
    public JsonNode enviarEmail(String referencia, EmailRequest request) {
        String path = "/v2/nfe/" + referencia + "/email";
        return client.sendJson("POST", path, null, request);
    }
}

