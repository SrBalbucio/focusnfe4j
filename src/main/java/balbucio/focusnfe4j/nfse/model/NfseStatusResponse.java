package balbucio.focusnfe4j.nfse.model;

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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String cnpjEmitente;
        private String ref;
        private String status;
        private String numero;
        private String codigoVerificacao;
        private String caminhoXml;
        private String caminhoDanfse;
        private String mensagem;

        Builder() {
        }

        public Builder cnpjEmitente(String cnpjEmitente) {
            this.cnpjEmitente = cnpjEmitente;
            return this;
        }

        public Builder ref(String ref) {
            this.ref = ref;
            return this;
        }

        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public Builder numero(String numero) {
            this.numero = numero;
            return this;
        }

        public Builder codigoVerificacao(String codigoVerificacao) {
            this.codigoVerificacao = codigoVerificacao;
            return this;
        }

        public Builder caminhoXml(String caminhoXml) {
            this.caminhoXml = caminhoXml;
            return this;
        }

        public Builder caminhoDanfse(String caminhoDanfse) {
            this.caminhoDanfse = caminhoDanfse;
            return this;
        }

        public Builder mensagem(String mensagem) {
            this.mensagem = mensagem;
            return this;
        }

        public NfseStatusResponse build() {
            NfseStatusResponse response = new NfseStatusResponse();
            response.cnpjEmitente = this.cnpjEmitente;
            response.ref = this.ref;
            response.status = this.status;
            response.numero = this.numero;
            response.codigoVerificacao = this.codigoVerificacao;
            response.caminhoXml = this.caminhoXml;
            response.caminhoDanfse = this.caminhoDanfse;
            response.mensagem = this.mensagem;
            return response;
        }
    }
}

