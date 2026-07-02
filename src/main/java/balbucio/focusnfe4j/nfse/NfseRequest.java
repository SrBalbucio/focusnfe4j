package balbucio.focusnfe4j.nfse;

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
}
