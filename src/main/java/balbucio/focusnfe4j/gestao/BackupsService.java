package balbucio.focusnfe4j.gestao;

import balbucio.focusnfe4j.FocusNfeClient;
import balbucio.focusnfe4j.gestao.model.BackupsResponse;

/**
 * Backups de NFe/NFCe/CTe/MDFe.
 */
public class BackupsService {
    private final FocusNfeClient client;

    public BackupsService(FocusNfeClient client) {
        this.client = client;
    }

    /**
     * GET /v2/backups/{cnpj}.json
     */
    public BackupsResponse listar(String cnpj) {
        String path = "/v2/backups/" + FocusNfeClient.encodePathSegment(cnpj) + ".json";
        return client.sendJson("GET", path, null, null, BackupsResponse.class);
    }
}

