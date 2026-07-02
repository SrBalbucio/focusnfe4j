package balbucio.focusnfe4j.nfe;

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
}
