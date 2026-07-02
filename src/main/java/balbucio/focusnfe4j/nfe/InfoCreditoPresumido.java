package balbucio.focusnfe4j.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class InfoCreditoPresumido {

    @JsonProperty("codigo_beneficio_fiscal")
    private String codigoBeneficioFiscal;

    @JsonProperty("percentual")
    private Double percentual;

    @JsonProperty("valor")
    private Double valor;

    public String getCodigoBeneficioFiscal() {
        return codigoBeneficioFiscal;
    }

    public void setCodigoBeneficioFiscal(String codigoBeneficioFiscal) {
        this.codigoBeneficioFiscal = codigoBeneficioFiscal;
    }

    public Double getPercentual() {
        return percentual;
    }

    public void setPercentual(Double percentual) {
        this.percentual = percentual;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}
