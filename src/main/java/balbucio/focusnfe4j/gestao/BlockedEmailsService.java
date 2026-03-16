package balbucio.focusnfe4j.gestao;

import balbucio.focusnfe4j.FocusNfeClient;
import balbucio.focusnfe4j.gestao.model.BlockedEmailStatus;
import com.fasterxml.jackson.databind.JsonNode;

import java.net.URI;
import java.util.Objects;

/**
 * Consulta de e-mails bloqueados (blocked_emails).
 *
 * <p>Segundo a documentacao, estes endpoints usam sempre https://api.focusnfe.com.br,
 * inclusive em ambiente de homologacao.</p>
 */
public class BlockedEmailsService {
    private static final URI DEFAULT_API_URI = URI.create("https://api.focusnfe.com.br");

    private final FocusNfeClient client;
    private final URI apiBaseUri;

    public BlockedEmailsService(FocusNfeClient client) {
        this(client, DEFAULT_API_URI);
    }

    public BlockedEmailsService(FocusNfeClient client, URI apiBaseUri) {
        this.client = Objects.requireNonNull(client, "client");
        this.apiBaseUri = Objects.requireNonNull(apiBaseUri, "apiBaseUri");
    }

    /**
     * GET /v2/blocked_emails/{email}
     */
    public BlockedEmailStatus consultar(String email) {
        String path = "/v2/blocked_emails/" + FocusNfeClient.encodePathSegment(email);
        return client.sendJsonTo(apiBaseUri, "GET", path, null, null, BlockedEmailStatus.class);
    }

    /**
     * DELETE /v2/blocked_emails/{email}
     *
     * <p>Documentacao chama de "solicitacao de exclusao".</p>
     */
    public JsonNode solicitarExclusao(String email) {
        String path = "/v2/blocked_emails/" + FocusNfeClient.encodePathSegment(email);
        return client.sendJsonTo(apiBaseUri, "DELETE", path, null, null);
    }
}
