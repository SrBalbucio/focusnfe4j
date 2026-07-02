package balbucio.focusnfe4j.nfe;

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
}
