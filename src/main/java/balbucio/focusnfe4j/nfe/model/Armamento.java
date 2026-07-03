package balbucio.focusnfe4j.nfe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Armamento {

    @JsonProperty("tipo_arma")
    private Integer tipoArma;

    @JsonProperty("numero_serie")
    private String numeroSerie;

    @JsonProperty("numero_serie_cano")
    private String numeroSerieCano;

    @JsonProperty("descricao")
    private String descricao;

    public Integer getTipoArma() {
        return tipoArma;
    }

    public void setTipoArma(Integer tipoArma) {
        this.tipoArma = tipoArma;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getNumeroSerieCano() {
        return numeroSerieCano;
    }

    public void setNumeroSerieCano(String numeroSerieCano) {
        this.numeroSerieCano = numeroSerieCano;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer tipoArma;
        private String numeroSerie;
        private String numeroSerieCano;
        private String descricao;

        Builder() {
        }

        public Builder tipoArma(Integer tipoArma) {
            this.tipoArma = tipoArma;
            return this;
        }

        public Builder numeroSerie(String numeroSerie) {
            this.numeroSerie = numeroSerie;
            return this;
        }

        public Builder numeroSerieCano(String numeroSerieCano) {
            this.numeroSerieCano = numeroSerieCano;
            return this;
        }

        public Builder descricao(String descricao) {
            this.descricao = descricao;
            return this;
        }

        public Armamento build() {
            Armamento arm = new Armamento();
            arm.tipoArma = this.tipoArma;
            arm.numeroSerie = this.numeroSerie;
            arm.numeroSerieCano = this.numeroSerieCano;
            arm.descricao = this.descricao;
            return arm;
        }
    }
}
