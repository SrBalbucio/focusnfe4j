package balbucio.focusnfe4j.cep.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CepResponse {
    @JsonProperty("cep")
    private String cep;

    @JsonProperty("tipo")
    private String tipo;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("uf")
    private String uf;

    @JsonProperty("nome_localidade")
    private String nomeLocalidade;

    @JsonProperty("codigo_ibge")
    private String codigoIbge;

    @JsonProperty("tipo_logradouro")
    private String tipoLogradouro;

    @JsonProperty("nome_logradouro")
    private String nomeLogradouro;

    @JsonProperty("bairro")
    private String bairro;

    @JsonProperty("descricao")
    private String descricao;

    public String getCep() {
        return cep;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public String getUf() {
        return uf;
    }

    public String getNomeLocalidade() {
        return nomeLocalidade;
    }

    public String getCodigoIbge() {
        return codigoIbge;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public String getNomeLogradouro() {
        return nomeLogradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public String getDescricao() {
        return descricao;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String cep;
        private String tipo;
        private String nome;
        private String uf;
        private String nomeLocalidade;
        private String codigoIbge;
        private String tipoLogradouro;
        private String nomeLogradouro;
        private String bairro;
        private String descricao;

        Builder() {
        }

        public Builder cep(String cep) {
            this.cep = cep;
            return this;
        }

        public Builder tipo(String tipo) {
            this.tipo = tipo;
            return this;
        }

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder uf(String uf) {
            this.uf = uf;
            return this;
        }

        public Builder nomeLocalidade(String nomeLocalidade) {
            this.nomeLocalidade = nomeLocalidade;
            return this;
        }

        public Builder codigoIbge(String codigoIbge) {
            this.codigoIbge = codigoIbge;
            return this;
        }

        public Builder tipoLogradouro(String tipoLogradouro) {
            this.tipoLogradouro = tipoLogradouro;
            return this;
        }

        public Builder nomeLogradouro(String nomeLogradouro) {
            this.nomeLogradouro = nomeLogradouro;
            return this;
        }

        public Builder bairro(String bairro) {
            this.bairro = bairro;
            return this;
        }

        public Builder descricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public CepResponse build() {
            CepResponse response = new CepResponse();
            response.cep = this.cep;
            response.tipo = this.tipo;
            response.nome = this.nome;
            response.uf = this.uf;
            response.nomeLocalidade = this.nomeLocalidade;
            response.codigoIbge = this.codigoIbge;
            response.tipoLogradouro = this.tipoLogradouro;
            response.nomeLogradouro = this.nomeLogradouro;
            response.bairro = this.bairro;
            response.descricao = this.descricao;
            return response;
        }
    }
}
