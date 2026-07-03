package balbucio.focusnfe4j.nfe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Adicao {

    @JsonProperty("numero")
    private Integer numero;

    @JsonProperty("numero_sequencial_item")
    private Integer numeroSequencialItem;

    @JsonProperty("codigo_fabricante_estrangeiro")
    private String codigoFabricanteEstrangeiro;

    @JsonProperty("valor_desconto")
    private Double valorDesconto;

    @JsonProperty("numero_drawback")
    private String numeroDrawback;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getNumeroSequencialItem() {
        return numeroSequencialItem;
    }

    public void setNumeroSequencialItem(Integer numeroSequencialItem) {
        this.numeroSequencialItem = numeroSequencialItem;
    }

    public String getCodigoFabricanteEstrangeiro() {
        return codigoFabricanteEstrangeiro;
    }

    public void setCodigoFabricanteEstrangeiro(String codigoFabricanteEstrangeiro) {
        this.codigoFabricanteEstrangeiro = codigoFabricanteEstrangeiro;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public String getNumeroDrawback() {
        return numeroDrawback;
    }

    public void setNumeroDrawback(String numeroDrawback) {
        this.numeroDrawback = numeroDrawback;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private Integer numero;
        private Integer numeroSequencialItem;
        private String codigoFabricanteEstrangeiro;
        private Double valorDesconto;
        private String numeroDrawback;

        Builder() {
        }

        public Builder numero(Integer numero) {
            this.numero = numero;
            return this;
        }

        public Builder numeroSequencialItem(Integer numeroSequencialItem) {
            this.numeroSequencialItem = numeroSequencialItem;
            return this;
        }

        public Builder codigoFabricanteEstrangeiro(String codigoFabricanteEstrangeiro) {
            this.codigoFabricanteEstrangeiro = codigoFabricanteEstrangeiro;
            return this;
        }

        public Builder valorDesconto(Double valorDesconto) {
            this.valorDesconto = valorDesconto;
            return this;
        }

        public Builder numeroDrawback(String numeroDrawback) {
            this.numeroDrawback = numeroDrawback;
            return this;
        }

        public Adicao build() {
            Adicao adicao = new Adicao();
            adicao.numero = this.numero;
            adicao.numeroSequencialItem = this.numeroSequencialItem;
            adicao.codigoFabricanteEstrangeiro = this.codigoFabricanteEstrangeiro;
            adicao.valorDesconto = this.valorDesconto;
            adicao.numeroDrawback = this.numeroDrawback;
            return adicao;
        }
    }
}
