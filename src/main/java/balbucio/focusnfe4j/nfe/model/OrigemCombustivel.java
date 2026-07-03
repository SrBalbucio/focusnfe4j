package balbucio.focusnfe4j.nfe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class OrigemCombustivel {

    @JsonProperty("indicador_importacao")
    private Integer indicadorImportacao;

    @JsonProperty("uf_origem")
    private Integer ufOrigem;

    @JsonProperty("percentual_originario_uf")
    private Double percentualOriginarioUf;

    public Integer getIndicadorImportacao() {
        return indicadorImportacao;
    }

    public void setIndicadorImportacao(Integer indicadorImportacao) {
        this.indicadorImportacao = indicadorImportacao;
    }

    public Integer getUfOrigem() {
        return ufOrigem;
    }

    public void setUfOrigem(Integer ufOrigem) {
        this.ufOrigem = ufOrigem;
    }

    public Double getPercentualOriginarioUf() {
        return percentualOriginarioUf;
    }

    public void setPercentualOriginarioUf(Double percentualOriginarioUf) {
        this.percentualOriginarioUf = percentualOriginarioUf;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer indicadorImportacao;
        private Integer ufOrigem;
        private Double percentualOriginarioUf;

        Builder() {
        }

        public Builder indicadorImportacao(Integer indicadorImportacao) {
            this.indicadorImportacao = indicadorImportacao;
            return this;
        }

        public Builder ufOrigem(Integer ufOrigem) {
            this.ufOrigem = ufOrigem;
            return this;
        }

        public Builder percentualOriginarioUf(Double percentualOriginarioUf) {
            this.percentualOriginarioUf = percentualOriginarioUf;
            return this;
        }

        public OrigemCombustivel build() {
            OrigemCombustivel origem = new OrigemCombustivel();
            origem.indicadorImportacao = this.indicadorImportacao;
            origem.ufOrigem = this.ufOrigem;
            origem.percentualOriginarioUf = this.percentualOriginarioUf;
            return origem;
        }
    }
}
