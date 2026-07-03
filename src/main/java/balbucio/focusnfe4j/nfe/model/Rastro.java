package balbucio.focusnfe4j.nfe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rastro {

    @JsonProperty("numero_lote")
    private String numeroLote;

    @JsonProperty("quantidade_lote")
    private Double quantidadeLote;

    @JsonProperty("data_fabricacao")
    private String dataFabricacao;

    @JsonProperty("data_validade")
    private String dataValidade;

    @JsonProperty("codigo_agregacao")
    private String codigoAgregacao;

    public String getNumeroLote() {
        return numeroLote;
    }

    public void setNumeroLote(String numeroLote) {
        this.numeroLote = numeroLote;
    }

    public Double getQuantidadeLote() {
        return quantidadeLote;
    }

    public void setQuantidadeLote(Double quantidadeLote) {
        this.quantidadeLote = quantidadeLote;
    }

    public String getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(String dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public String getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(String dataValidade) {
        this.dataValidade = dataValidade;
    }

    public String getCodigoAgregacao() {
        return codigoAgregacao;
    }

    public void setCodigoAgregacao(String codigoAgregacao) {
        this.codigoAgregacao = codigoAgregacao;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String numeroLote;
        private Double quantidadeLote;
        private String dataFabricacao;
        private String dataValidade;
        private String codigoAgregacao;

        Builder() {
        }

        public Builder numeroLote(String numeroLote) {
            this.numeroLote = numeroLote;
            return this;
        }

        public Builder quantidadeLote(Double quantidadeLote) {
            this.quantidadeLote = quantidadeLote;
            return this;
        }

        public Builder dataFabricacao(String dataFabricacao) {
            this.dataFabricacao = dataFabricacao;
            return this;
        }

        public Builder dataValidade(String dataValidade) {
            this.dataValidade = dataValidade;
            return this;
        }

        public Builder codigoAgregacao(String codigoAgregacao) {
            this.codigoAgregacao = codigoAgregacao;
            return this;
        }

        public Rastro build() {
            Rastro rastro = new Rastro();
            rastro.numeroLote = this.numeroLote;
            rastro.quantidadeLote = this.quantidadeLote;
            rastro.dataFabricacao = this.dataFabricacao;
            rastro.dataValidade = this.dataValidade;
            rastro.codigoAgregacao = this.codigoAgregacao;
            return rastro;
        }
    }
}
