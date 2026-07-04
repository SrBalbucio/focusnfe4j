package balbucio.focusnfe4j.cep;

import balbucio.focusnfe4j.FocusNfeClient;
import balbucio.focusnfe4j.cep.model.CepResponse;
import com.fasterxml.jackson.databind.JsonNode;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * API v2 - CEPs (Consulta de endereço e CEP).
 */
public class CepService {
    private final FocusNfeClient client;

    public CepService(FocusNfeClient client) {
        this.client = client;
    }

    /**
     * Consulta um CEP específico: GET /v2/ceps/{cep}
     *
     * @param cep Código CEP com 8 dígitos (apenas números).
     */
    public CepResponse consultar(String cep) {
        String path = "/v2/ceps/" + FocusNfeClient.encodePathSegment(cep);
        return client.sendJson("GET", path, null, null, CepResponse.class);
    }

    public JsonNode consultarRaw(String cep) {
        String path = "/v2/ceps/" + FocusNfeClient.encodePathSegment(cep);
        return client.sendJson("GET", path, null, null);
    }

    /**
     * Consulta CEPs por critérios: GET /v2/ceps
     * <p>
     * É necessário informar ao menos dois parâmetros. Exceção: municípios
     * com um único CEP podem ser consultados apenas com codigoIbge.
     */
    public List<CepResponse> listar(Map<String, String> parametros) {
        CepResponse[] arr = client.sendJson("GET", "/v2/ceps", parametros, null, CepResponse[].class);
        return arr != null ? Arrays.asList(arr) : List.of();
    }

    /**
     * Consulta CEPs por UF e logradouro (forma simplificada).
     */
    public List<CepResponse> listarPorUfELogradouro(String uf, String logradouro) {
        Map<String, String> params = new LinkedHashMap<>();
        params.put("uf", uf);
        params.put("logradouro", logradouro);
        return listar(params);
    }

    /**
     * Consulta CEPs por código IBGE (municípios com CEP único).
     */
    public List<CepResponse> listarPorCodigoIbge(String codigoIbge) {
        Map<String, String> params = new LinkedHashMap<>();
        params.put("codigo_ibge", codigoIbge);
        return listar(params);
    }

    /**
     * Consulta CEPs por UF e localidade.
     */
    public List<CepResponse> listarPorUfELocalidade(String uf, String localidade) {
        Map<String, String> params = new LinkedHashMap<>();
        params.put("uf", uf);
        params.put("localidade", localidade);
        return listar(params);
    }
}
