package balbucio.focusnfe4j.nfe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DetalheExportacao {

    @JsonProperty("numero_drawback")
    private String numeroDrawback;

    @JsonProperty("numero_re")
    private Integer numeroRe;

    @JsonProperty("chave_nfe")
    private String chaveNfe;

    @JsonProperty("quantidade_exportado")
    private Double quantidadeExportado;

    public String getNumeroDrawback() {
        return numeroDrawback;
    }

    public void setNumeroDrawback(String numeroDrawback) {
        this.numeroDrawback = numeroDrawback;
    }

    public Integer getNumeroRe() {
        return numeroRe;
    }

    public void setNumeroRe(Integer numeroRe) {
        this.numeroRe = numeroRe;
    }

    public String getChaveNfe() {
        return chaveNfe;
    }

    public void setChaveNfe(String chaveNfe) {
        this.chaveNfe = chaveNfe;
    }

    public Double getQuantidadeExportado() {
        return quantidadeExportado;
    }

    public void setQuantidadeExportado(Double quantidadeExportado) {
        this.quantidadeExportado = quantidadeExportado;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String numeroDrawback;
        private Integer numeroRe;
        private String chaveNfe;
        private Double quantidadeExportado;

        Builder() {
        }

        public Builder numeroDrawback(String numeroDrawback) {
            this.numeroDrawback = numeroDrawback;
            return this;
        }

        public Builder numeroRe(Integer numeroRe) {
            this.numeroRe = numeroRe;
            return this;
        }

        public Builder chaveNfe(String chaveNfe) {
            this.chaveNfe = chaveNfe;
            return this;
        }

        public Builder quantidadeExportado(Double quantidadeExportado) {
            this.quantidadeExportado = quantidadeExportado;
            return this;
        }

        public DetalheExportacao build() {
            DetalheExportacao det = new DetalheExportacao();
            det.numeroDrawback = this.numeroDrawback;
            det.numeroRe = this.numeroRe;
            det.chaveNfe = this.chaveNfe;
            det.quantidadeExportado = this.quantidadeExportado;
            return det;
        }
    }
}
