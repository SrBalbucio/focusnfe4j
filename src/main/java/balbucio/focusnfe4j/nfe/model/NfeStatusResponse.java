package balbucio.focusnfe4j.nfe.model;

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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String cnpjEmitente;
        private String ref;
        private String status;
        private String numero;
        private String serie;
        private String chaveNfe;
        private String caminhoXml;
        private String caminhoDanfe;
        private String mensagemSefaz;
        private String protocolo;

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

        public Builder serie(String serie) {
            this.serie = serie;
            return this;
        }

        public Builder chaveNfe(String chaveNfe) {
            this.chaveNfe = chaveNfe;
            return this;
        }

        public Builder caminhoXml(String caminhoXml) {
            this.caminhoXml = caminhoXml;
            return this;
        }

        public Builder caminhoDanfe(String caminhoDanfe) {
            this.caminhoDanfe = caminhoDanfe;
            return this;
        }

        public Builder mensagemSefaz(String mensagemSefaz) {
            this.mensagemSefaz = mensagemSefaz;
            return this;
        }

        public Builder protocolo(String protocolo) {
            this.protocolo = protocolo;
            return this;
        }

        public NfeStatusResponse build() {
            NfeStatusResponse response = new NfeStatusResponse();
            response.cnpjEmitente = this.cnpjEmitente;
            response.ref = this.ref;
            response.status = this.status;
            response.numero = this.numero;
            response.serie = this.serie;
            response.chaveNfe = this.chaveNfe;
            response.caminhoXml = this.caminhoXml;
            response.caminhoDanfe = this.caminhoDanfe;
            response.mensagemSefaz = this.mensagemSefaz;
            response.protocolo = this.protocolo;
            return response;
        }
    }
}

