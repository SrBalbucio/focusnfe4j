package balbucio.focusnfe4j.nfe;

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
}
