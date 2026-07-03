package balbucio.focusnfe4j.nfe.model;

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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String codigoBeneficioFiscal;
        private Double percentual;
        private Double valor;

        Builder() {
        }

        public Builder codigoBeneficioFiscal(String codigoBeneficioFiscal) {
            this.codigoBeneficioFiscal = codigoBeneficioFiscal;
            return this;
        }

        public Builder percentual(Double percentual) {
            this.percentual = percentual;
            return this;
        }

        public Builder valor(Double valor) {
            this.valor = valor;
            return this;
        }

        public InfoCreditoPresumido build() {
            InfoCreditoPresumido info = new InfoCreditoPresumido();
            info.codigoBeneficioFiscal = this.codigoBeneficioFiscal;
            info.percentual = this.percentual;
            info.valor = this.valor;
            return info;
        }
    }
}
