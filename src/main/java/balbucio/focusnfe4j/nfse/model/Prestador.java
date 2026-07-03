package balbucio.focusnfe4j.nfse.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Prestador {

    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("inscricao_municipal")
    private String inscricaoMunicipal;

    @JsonProperty("codigo_municipio")
    private String codigoMunicipio;

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String cnpj;
        private String inscricaoMunicipal;
        private String codigoMunicipio;

        Builder() {
        }

        public Builder cnpj(String cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public Builder inscricaoMunicipal(String inscricaoMunicipal) {
            this.inscricaoMunicipal = inscricaoMunicipal;
            return this;
        }

        public Builder codigoMunicipio(String codigoMunicipio) {
            this.codigoMunicipio = codigoMunicipio;
            return this;
        }

        public Prestador build() {
            Prestador prestador = new Prestador();
            prestador.cnpj = this.cnpj;
            prestador.inscricaoMunicipal = this.inscricaoMunicipal;
            prestador.codigoMunicipio = this.codigoMunicipio;
            return prestador;
        }
    }
}
