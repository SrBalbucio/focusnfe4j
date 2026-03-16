package balbucio.focusnfe4j.nfse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NfseStatusResponse {
    @JsonProperty("cnpj_emitente")
    private String cnpjEmitente;

    @JsonProperty("ref")
    private String ref;

    @JsonProperty("status")
    private String status;

    @JsonProperty("numero")
    private String numero;

    @JsonProperty("codigo_verificacao")
    private String codigoVerificacao;

    @JsonProperty("caminho_xml")
    private String caminhoXml;

    @JsonProperty("caminho_danfse")
    private String caminhoDanfse;

    @JsonProperty("mensagem")
    private String mensagem;

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

    public String getCodigoVerificacao() {
        return codigoVerificacao;
    }

    public String getCaminhoXml() {
        return caminhoXml;
    }

    public String getCaminhoDanfse() {
        return caminhoDanfse;
    }

    public String getMensagem() {
        return mensagem;
    }
}

