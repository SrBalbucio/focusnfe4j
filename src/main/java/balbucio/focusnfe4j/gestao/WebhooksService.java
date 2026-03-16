package balbucio.focusnfe4j.gestao;

import balbucio.focusnfe4j.FocusNfeClient;
import balbucio.focusnfe4j.gestao.model.Webhook;
import balbucio.focusnfe4j.gestao.model.WebhookCreateRequest;

import java.util.Arrays;
import java.util.List;

/**
 * Gatilhos (webhooks).
 */
public class WebhooksService {
    private final FocusNfeClient client;

    public WebhooksService(FocusNfeClient client) {
        this.client = client;
    }

    /**
     * POST /v2/hooks
     */
    public Webhook criar(WebhookCreateRequest request) {
        return client.sendJson("POST", "/v2/hooks", null, request, Webhook.class);
    }

    /**
     * GET /v2/hooks
     */
    public List<Webhook> listar() {
        Webhook[] arr = client.sendJson("GET", "/v2/hooks", null, null, Webhook[].class);
        return arr != null ? Arrays.asList(arr) : List.of();
    }

    /**
     * GET /v2/hooks/{id}
     */
    public Webhook consultar(String id) {
        String path = "/v2/hooks/" + FocusNfeClient.encodePathSegment(id);
        return client.sendJson("GET", path, null, null, Webhook.class);
    }

    /**
     * DELETE /v2/hooks/{id}
     */
    public Webhook deletar(String id) {
        String path = "/v2/hooks/" + FocusNfeClient.encodePathSegment(id);
        return client.sendJson("DELETE", path, null, null, Webhook.class);
    }

    /**
     * POST /v2/nfe/{ref}/hook (test/reenvio das notificacoes)
     */
    public List<Webhook> reenviarNotificacoesNfe(String referencia) {
        String path = "/v2/nfe/" + FocusNfeClient.encodePathSegment(referencia) + "/hook";
        Webhook[] arr = client.sendJson("POST", path, null, null, Webhook[].class);
        return arr != null ? Arrays.asList(arr) : List.of();
    }

    /**
     * POST /v2/nfse/{ref}/hook (test/reenvio das notificacoes)
     */
    public List<Webhook> reenviarNotificacoesNfse(String referencia) {
        String path = "/v2/nfse/" + FocusNfeClient.encodePathSegment(referencia) + "/hook";
        Webhook[] arr = client.sendJson("POST", path, null, null, Webhook[].class);
        return arr != null ? Arrays.asList(arr) : List.of();
    }
}

