package balbucio.focusnfe4j.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NfeStatusResponse {
    @JsonProperty("cnpj_emitente")
    private String cnpjEmitente;

    @JsonProperty("ref")
    private String ref;

    @JsonProperty("status")
    private String status;

    @JsonProperty("numero")
    private String numero;

    @JsonProperty("serie")
    private String serie;

    @JsonProperty("chave_nfe")
    private String chaveNfe;

    @JsonProperty("caminho_xml")
    private String caminhoXml;

    @JsonProperty("caminho_danfe")
    private String caminhoDanfe;

    @JsonProperty("mensagem_sefaz")
    private String mensagemSefaz;

    @JsonProperty("protocolo")
    private String protocolo;

    public String getCnpjEmitente() {
        return cnpjEmitente;
    }

    public String getRef() {
        return ref;
    }

    public String getStatus() {
        return status;
    }

    public String getNumero() {
        return numero;
    }

    public String getSerie() {
        return serie;
    }

    public String getChaveNfe() {
        return chaveNfe;
    }

    public String getCaminhoXml() {
        return caminhoXml;
    }

    public String getCaminhoDanfe() {
        return caminhoDanfe;
    }

    public String getMensagemSefaz() {
        return mensagemSefaz;
    }

    public String getProtocolo() {
        return protocolo;
    }
}

