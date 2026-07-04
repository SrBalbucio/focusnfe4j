package balbucio.focusnfe4j.cnpj.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EnderecoCnpj {
    @JsonProperty("codigo_municipio")
    private String codigoMunicipio;

    @JsonProperty("codigo_siafi")
    private String codigoSiafi;

    @JsonProperty("codigo_ibge")
    private String codigoIbge;

    @JsonProperty("nome_municipio")
    private String nomeMunicipio;

    @JsonProperty("tipo_logradouro")
    private String tipoLogradouro;

    @JsonProperty("logradouro")
    private String logradouro;

    @JsonProperty("complemento")
    private String complemento;

    @JsonProperty("numero")
    private String numero;

    @JsonProperty("bairro")
    private String bairro;

    @JsonProperty("cep")
    private String cep;

    @JsonProperty("uf")
    private String uf;

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public String getCodigoSiafi() {
        return codigoSiafi;
    }

    public String getCodigoIbge() {
        return codigoIbge;
    }

    public String getNomeMunicipio() {
        return nomeMunicipio;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public String getNumero() {
        return numero;
    }

    public String getBairro() {
        return bairro;
    }

    public String getCep() {
        return cep;
    }

    public String getUf() {
        return uf;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String codigoMunicipio;
        private String codigoSiafi;
        private String codigoIbge;
        private String nomeMunicipio;
        private String tipoLogradouro;
        private String logradouro;
        private String complemento;
        private String numero;
        private String bairro;
        private String cep;
        private String uf;

        Builder() {
        }

        public Builder codigoMunicipio(String codigoMunicipio) {
            this.codigoMunicipio = codigoMunicipio;
            return this;
        }

        public Builder codigoSiafi(String codigoSiafi) {
            this.codigoSiafi = codigoSiafi;
            return this;
        }

        public Builder codigoIbge(String codigoIbge) {
            this.codigoIbge = codigoIbge;
            return this;
        }

        public Builder nomeMunicipio(String nomeMunicipio) {
            this.nomeMunicipio = nomeMunicipio;
            return this;
        }

        public Builder tipoLogradouro(String tipoLogradouro) {
            this.tipoLogradouro = tipoLogradouro;
            return this;
        }

        public Builder logradouro(String logradouro) {
            this.logradouro = logradouro;
            return this;
        }

        public Builder complemento(String complemento) {
            this.complemento = complemento;
            return this;
        }

        public Builder numero(String numero) {
            this.numero = numero;
            return this;
        }

        public Builder bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public Builder cep(String cep) {
            this.cep = cep;
            return this;
        }

        public Builder uf(String uf) {
            this.uf = uf;
            return this;
        }

        public EnderecoCnpj build() {
            EnderecoCnpj endereco = new EnderecoCnpj();
            endereco.codigoMunicipio = this.codigoMunicipio;
            endereco.codigoSiafi = this.codigoSiafi;
            endereco.codigoIbge = this.codigoIbge;
            endereco.nomeMunicipio = this.nomeMunicipio;
            endereco.tipoLogradouro = this.tipoLogradouro;
            endereco.logradouro = this.logradouro;
            endereco.complemento = this.complemento;
            endereco.numero = this.numero;
            endereco.bairro = this.bairro;
            endereco.cep = this.cep;
            endereco.uf = this.uf;
            return endereco;
        }
    }
}
