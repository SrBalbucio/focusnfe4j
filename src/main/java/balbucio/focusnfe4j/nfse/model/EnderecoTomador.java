package balbucio.focusnfe4j.nfse.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnderecoTomador {

    @JsonProperty("logradouro")
    private String logradouro;

    @JsonProperty("tipo_logradouro")
    private String tipoLogradouro;

    @JsonProperty("numero")
    private String numero;

    @JsonProperty("complemento")
    private String complemento;

    @JsonProperty("bairro")
    private String bairro;

    @JsonProperty("codigo_municipio")
    private String codigoMunicipio;

    @JsonProperty("uf")
    private String uf;

    @JsonProperty("cep")
    private String cep;

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String logradouro;
        private String tipoLogradouro;
        private String numero;
        private String complemento;
        private String bairro;
        private String codigoMunicipio;
        private String uf;
        private String cep;

        Builder() {
        }

        public Builder logradouro(String logradouro) {
            this.logradouro = logradouro;
            return this;
        }

        public Builder tipoLogradouro(String tipoLogradouro) {
            this.tipoLogradouro = tipoLogradouro;
            return this;
        }

        public Builder numero(String numero) {
            this.numero = numero;
            return this;
        }

        public Builder complemento(String complemento) {
            this.complemento = complemento;
            return this;
        }

        public Builder bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public Builder codigoMunicipio(String codigoMunicipio) {
            this.codigoMunicipio = codigoMunicipio;
            return this;
        }

        public Builder uf(String uf) {
            this.uf = uf;
            return this;
        }

        public Builder cep(String cep) {
            this.cep = cep;
            return this;
        }

        public EnderecoTomador build() {
            EnderecoTomador enderecoTomador = new EnderecoTomador();
            enderecoTomador.logradouro = this.logradouro;
            enderecoTomador.tipoLogradouro = this.tipoLogradouro;
            enderecoTomador.numero = this.numero;
            enderecoTomador.complemento = this.complemento;
            enderecoTomador.bairro = this.bairro;
            enderecoTomador.codigoMunicipio = this.codigoMunicipio;
            enderecoTomador.uf = this.uf;
            enderecoTomador.cep = this.cep;
            return enderecoTomador;
        }
    }
}
