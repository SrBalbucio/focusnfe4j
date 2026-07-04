package balbucio.focusnfe4j.cnpj;

import balbucio.focusnfe4j.FocusNfeClient;
import balbucio.focusnfe4j.cnpj.model.CnpjResponse;
import com.fasterxml.jackson.databind.JsonNode;

/**
 * API v2 - CNPJ (Consulta de dados cadastrais de pessoa jurídica).
 */
public class CnpjService {
    private final FocusNfeClient client;

    public CnpjService(FocusNfeClient client) {
        this.client = client;
    }

    /**
     * Consulta dados cadastrais de uma empresa: GET /v2/cnpjs/{cnpj}
     *
     * @param cnpj Número de inscrição no CNPJ com 14 dígitos (apenas números).
     */
    public CnpjResponse consultar(String cnpj) {
        String path = "/v2/cnpjs/" + FocusNfeClient.encodePathSegment(cnpj);
        return client.sendJson("GET", path, null, null, CnpjResponse.class);
    }

    public JsonNode consultarRaw(String cnpj) {
        String path = "/v2/cnpjs/" + FocusNfeClient.encodePathSegment(cnpj);
        return client.sendJson("GET", path, null, null);
    }
}
