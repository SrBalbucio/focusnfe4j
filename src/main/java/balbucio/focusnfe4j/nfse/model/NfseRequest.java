package balbucio.focusnfe4j.nfse.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NfseRequest {

    @JsonProperty("data_emissao")
    private String dataEmissao;

    @JsonProperty("natureza_operacao")
    private String naturezaOperacao;

    @JsonProperty("regime_especial_tributacao")
    private String regimeEspecialTributacao;

    @JsonProperty("optante_simples_nacional")
    private Boolean optanteSimplesNacional;

    @JsonProperty("incentivador_cultural")
    private Boolean incentivadorCultural;

    @JsonProperty("prestador")
    private Prestador prestador;

    @JsonProperty("tomador")
    private Tomador tomador;

    @JsonProperty("servico")
    private Servico servico;

    @JsonProperty("intermediario")
    private Intermediario intermediario;

    @JsonProperty("codigo_obra")
    private String codigoObra;

    @JsonProperty("art")
    private String art;

    @JsonProperty("numero_nfse_substituido")
    private String numeroNfseSubstituido;

    @JsonProperty("numero_rps_substituido")
    private String numeroRpsSubstituido;

    @JsonProperty("serie_rps_substituido")
    private String serieRpsSubstituido;

    @JsonProperty("tipo_rps_substituido")
    private String tipoRpsSubstituido;

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getNaturezaOperacao() {
        return naturezaOperacao;
    }

    public void setNaturezaOperacao(String naturezaOperacao) {
        this.naturezaOperacao = naturezaOperacao;
    }

    public String getRegimeEspecialTributacao() {
        return regimeEspecialTributacao;
    }

    public void setRegimeEspecialTributacao(String regimeEspecialTributacao) {
        this.regimeEspecialTributacao = regimeEspecialTributacao;
    }

    public Boolean getOptanteSimplesNacional() {
        return optanteSimplesNacional;
    }

    public void setOptanteSimplesNacional(Boolean optanteSimplesNacional) {
        this.optanteSimplesNacional = optanteSimplesNacional;
    }

    public Boolean getIncentivadorCultural() {
        return incentivadorCultural;
    }

    public void setIncentivadorCultural(Boolean incentivadorCultural) {
        this.incentivadorCultural = incentivadorCultural;
    }

    public Prestador getPrestador() {
        return prestador;
    }

    public void setPrestador(Prestador prestador) {
        this.prestador = prestador;
    }

    public Tomador getTomador() {
        return tomador;
    }

    public void setTomador(Tomador tomador) {
        this.tomador = tomador;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Intermediario getIntermediario() {
        return intermediario;
    }

    public void setIntermediario(Intermediario intermediario) {
        this.intermediario = intermediario;
    }

    public String getCodigoObra() {
        return codigoObra;
    }

    public void setCodigoObra(String codigoObra) {
        this.codigoObra = codigoObra;
    }

    public String getArt() {
        return art;
    }

    public void setArt(String art) {
        this.art = art;
    }

    public String getNumeroNfseSubstituido() {
        return numeroNfseSubstituido;
    }

    public void setNumeroNfseSubstituido(String numeroNfseSubstituido) {
        this.numeroNfseSubstituido = numeroNfseSubstituido;
    }

    public String getNumeroRpsSubstituido() {
        return numeroRpsSubstituido;
    }

    public void setNumeroRpsSubstituido(String numeroRpsSubstituido) {
        this.numeroRpsSubstituido = numeroRpsSubstituido;
    }

    public String getSerieRpsSubstituido() {
        return serieRpsSubstituido;
    }

    public void setSerieRpsSubstituido(String serieRpsSubstituido) {
        this.serieRpsSubstituido = serieRpsSubstituido;
    }

    public String getTipoRpsSubstituido() {
        return tipoRpsSubstituido;
    }

    public void setTipoRpsSubstituido(String tipoRpsSubstituido) {
        this.tipoRpsSubstituido = tipoRpsSubstituido;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String dataEmissao;
        private String naturezaOperacao;
        private String regimeEspecialTributacao;
        private Boolean optanteSimplesNacional;
        private Boolean incentivadorCultural;
        private Prestador prestador;
        private Tomador tomador;
        private Servico servico;
        private Intermediario intermediario;
        private String codigoObra;
        private String art;
        private String numeroNfseSubstituido;
        private String numeroRpsSubstituido;
        private String serieRpsSubstituido;
        private String tipoRpsSubstituido;

        Builder() {
        }

        public Builder dataEmissao(String dataEmissao) {
            this.dataEmissao = dataEmissao;
            return this;
        }

        public Builder naturezaOperacao(String naturezaOperacao) {
            this.naturezaOperacao = naturezaOperacao;
            return this;
        }

        public Builder regimeEspecialTributacao(String regimeEspecialTributacao) {
            this.regimeEspecialTributacao = regimeEspecialTributacao;
            return this;
        }

        public Builder optanteSimplesNacional(Boolean optanteSimplesNacional) {
            this.optanteSimplesNacional = optanteSimplesNacional;
            return this;
        }

        public Builder incentivadorCultural(Boolean incentivadorCultural) {
            this.incentivadorCultural = incentivadorCultural;
            return this;
        }

        public Builder prestador(Prestador prestador) {
            this.prestador = prestador;
            return this;
        }

        public Builder tomador(Tomador tomador) {
            this.tomador = tomador;
            return this;
        }

        public Builder servico(Servico servico) {
            this.servico = servico;
            return this;
        }

        public Builder intermediario(Intermediario intermediario) {
            this.intermediario = intermediario;
            return this;
        }

        public Builder codigoObra(String codigoObra) {
            this.codigoObra = codigoObra;
            return this;
        }

        public Builder art(String art) {
            this.art = art;
            return this;
        }

        public Builder numeroNfseSubstituido(String numeroNfseSubstituido) {
            this.numeroNfseSubstituido = numeroNfseSubstituido;
            return this;
        }

        public Builder numeroRpsSubstituido(String numeroRpsSubstituido) {
            this.numeroRpsSubstituido = numeroRpsSubstituido;
            return this;
        }

        public Builder serieRpsSubstituido(String serieRpsSubstituido) {
            this.serieRpsSubstituido = serieRpsSubstituido;
            return this;
        }

        public Builder tipoRpsSubstituido(String tipoRpsSubstituido) {
            this.tipoRpsSubstituido = tipoRpsSubstituido;
            return this;
        }

        public NfseRequest build() {
            NfseRequest nfseRequest = new NfseRequest();
            nfseRequest.dataEmissao = this.dataEmissao;
            nfseRequest.naturezaOperacao = this.naturezaOperacao;
            nfseRequest.regimeEspecialTributacao = this.regimeEspecialTributacao;
            nfseRequest.optanteSimplesNacional = this.optanteSimplesNacional;
            nfseRequest.incentivadorCultural = this.incentivadorCultural;
            nfseRequest.prestador = this.prestador;
            nfseRequest.tomador = this.tomador;
            nfseRequest.servico = this.servico;
            nfseRequest.intermediario = this.intermediario;
            nfseRequest.codigoObra = this.codigoObra;
            nfseRequest.art = this.art;
            nfseRequest.numeroNfseSubstituido = this.numeroNfseSubstituido;
            nfseRequest.numeroRpsSubstituido = this.numeroRpsSubstituido;
            nfseRequest.serieRpsSubstituido = this.serieRpsSubstituido;
            nfseRequest.tipoRpsSubstituido = this.tipoRpsSubstituido;
            return nfseRequest;
        }
    }
}
