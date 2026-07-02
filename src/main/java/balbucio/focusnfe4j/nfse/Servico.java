package balbucio.focusnfe4j.nfse;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Servico {

    @JsonProperty("valor_servicos")
    private Double valorServicos;

    @JsonProperty("valor_deducoes")
    private Double valorDeducoes;

    @JsonProperty("valor_pis")
    private Double valorPis;

    @JsonProperty("valor_cofins")
    private Double valorCofins;

    @JsonProperty("valor_inss")
    private Double valorInss;

    @JsonProperty("valor_ir")
    private Double valorIr;

    @JsonProperty("valor_csll")
    private Double valorCsll;

    @JsonProperty("iss_retido")
    private Boolean issRetido;

    @JsonProperty("valor_iss")
    private Double valorIss;

    @JsonProperty("valor_iss_retido")
    private Double valorIssRetido;

    @JsonProperty("outras_retencoes")
    private Double outrasRetencoes;

    @JsonProperty("base_calculo")
    private Double baseCalculo;

    @JsonProperty("aliquota")
    private Double aliquota;

    @JsonProperty("desconto_incondicionado")
    private Double descontoIncondicionado;

    @JsonProperty("desconto_condicionado")
    private Double descontoCondicionado;

    @JsonProperty("item_lista_servico")
    private String itemListaServico;

    @JsonProperty("codigo_cnae")
    private String codigoCnae;

    @JsonProperty("codigo_tributario_municipio")
    private String codigoTributarioMunicipio;

    @JsonProperty("discriminacao")
    private String discriminacao;

    @JsonProperty("codigo_municipio")
    private String codigoMunicipio;

    @JsonProperty("percentual_total_tributos")
    private Double percentualTotalTributos;

    @JsonProperty("fonte_total_tributos")
    private String fonteTotalTributos;

    @JsonProperty("codigo_nbs")
    private String codigoNbs;

    @JsonProperty("codigo_indicador_operacao")
    private String codigoIndicadorOperacao;

    @JsonProperty("ibs_cbs_classificacao_tributaria")
    private String ibsCbsClassificacaoTributaria;

    @JsonProperty("ibs_cbs_situacao_tributaria")
    private String ibsCbsSituacaoTributaria;

    @JsonProperty("ibs_cbs_base_calculo")
    private Double ibsCbsBaseCalculo;

    @JsonProperty("ibs_uf_aliquota")
    private Double ibsUfAliquota;

    @JsonProperty("ibs_mun_aliquota")
    private Double ibsMunAliquota;

    @JsonProperty("cbs_aliquota")
    private Double cbsAliquota;

    @JsonProperty("ibs_uf_valor")
    private Double ibsUfValor;

    @JsonProperty("ibs_mun_valor")
    private Double ibsMunValor;

    @JsonProperty("cbs_valor")
    private Double cbsValor;

    public Double getValorServicos() {
        return valorServicos;
    }

    public void setValorServicos(Double valorServicos) {
        this.valorServicos = valorServicos;
    }

    public Double getValorDeducoes() {
        return valorDeducoes;
    }

    public void setValorDeducoes(Double valorDeducoes) {
        this.valorDeducoes = valorDeducoes;
    }

    public Double getValorPis() {
        return valorPis;
    }

    public void setValorPis(Double valorPis) {
        this.valorPis = valorPis;
    }

    public Double getValorCofins() {
        return valorCofins;
    }

    public void setValorCofins(Double valorCofins) {
        this.valorCofins = valorCofins;
    }

    public Double getValorInss() {
        return valorInss;
    }

    public void setValorInss(Double valorInss) {
        this.valorInss = valorInss;
    }

    public Double getValorIr() {
        return valorIr;
    }

    public void setValorIr(Double valorIr) {
        this.valorIr = valorIr;
    }

    public Double getValorCsll() {
        return valorCsll;
    }

    public void setValorCsll(Double valorCsll) {
        this.valorCsll = valorCsll;
    }

    public Boolean getIssRetido() {
        return issRetido;
    }

    public void setIssRetido(Boolean issRetido) {
        this.issRetido = issRetido;
    }

    public Double getValorIss() {
        return valorIss;
    }

    public void setValorIss(Double valorIss) {
        this.valorIss = valorIss;
    }

    public Double getValorIssRetido() {
        return valorIssRetido;
    }

    public void setValorIssRetido(Double valorIssRetido) {
        this.valorIssRetido = valorIssRetido;
    }

    public Double getOutrasRetencoes() {
        return outrasRetencoes;
    }

    public void setOutrasRetencoes(Double outrasRetencoes) {
        this.outrasRetencoes = outrasRetencoes;
    }

    public Double getBaseCalculo() {
        return baseCalculo;
    }

    public void setBaseCalculo(Double baseCalculo) {
        this.baseCalculo = baseCalculo;
    }

    public Double getAliquota() {
        return aliquota;
    }

    public void setAliquota(Double aliquota) {
        this.aliquota = aliquota;
    }

    public Double getDescontoIncondicionado() {
        return descontoIncondicionado;
    }

    public void setDescontoIncondicionado(Double descontoIncondicionado) {
        this.descontoIncondicionado = descontoIncondicionado;
    }

    public Double getDescontoCondicionado() {
        return descontoCondicionado;
    }

    public void setDescontoCondicionado(Double descontoCondicionado) {
        this.descontoCondicionado = descontoCondicionado;
    }

    public String getItemListaServico() {
        return itemListaServico;
    }

    public void setItemListaServico(String itemListaServico) {
        this.itemListaServico = itemListaServico;
    }

    public String getCodigoCnae() {
        return codigoCnae;
    }

    public void setCodigoCnae(String codigoCnae) {
        this.codigoCnae = codigoCnae;
    }

    public String getCodigoTributarioMunicipio() {
        return codigoTributarioMunicipio;
    }

    public void setCodigoTributarioMunicipio(String codigoTributarioMunicipio) {
        this.codigoTributarioMunicipio = codigoTributarioMunicipio;
    }

    public String getDiscriminacao() {
        return discriminacao;
    }

    public void setDiscriminacao(String discriminacao) {
        this.discriminacao = discriminacao;
    }

    public String getCodigoMunicipio() {
        return codigoMunicipio;
    }

    public void setCodigoMunicipio(String codigoMunicipio) {
        this.codigoMunicipio = codigoMunicipio;
    }

    public Double getPercentualTotalTributos() {
        return percentualTotalTributos;
    }

    public void setPercentualTotalTributos(Double percentualTotalTributos) {
        this.percentualTotalTributos = percentualTotalTributos;
    }

    public String getFonteTotalTributos() {
        return fonteTotalTributos;
    }

    public void setFonteTotalTributos(String fonteTotalTributos) {
        this.fonteTotalTributos = fonteTotalTributos;
    }

    public String getCodigoNbs() {
        return codigoNbs;
    }

    public void setCodigoNbs(String codigoNbs) {
        this.codigoNbs = codigoNbs;
    }

    public String getCodigoIndicadorOperacao() {
        return codigoIndicadorOperacao;
    }

    public void setCodigoIndicadorOperacao(String codigoIndicadorOperacao) {
        this.codigoIndicadorOperacao = codigoIndicadorOperacao;
    }

    public String getIbsCbsClassificacaoTributaria() {
        return ibsCbsClassificacaoTributaria;
    }

    public void setIbsCbsClassificacaoTributaria(String ibsCbsClassificacaoTributaria) {
        this.ibsCbsClassificacaoTributaria = ibsCbsClassificacaoTributaria;
    }

    public String getIbsCbsSituacaoTributaria() {
        return ibsCbsSituacaoTributaria;
    }

    public void setIbsCbsSituacaoTributaria(String ibsCbsSituacaoTributaria) {
        this.ibsCbsSituacaoTributaria = ibsCbsSituacaoTributaria;
    }

    public Double getIbsCbsBaseCalculo() {
        return ibsCbsBaseCalculo;
    }

    public void setIbsCbsBaseCalculo(Double ibsCbsBaseCalculo) {
        this.ibsCbsBaseCalculo = ibsCbsBaseCalculo;
    }

    public Double getIbsUfAliquota() {
        return ibsUfAliquota;
    }

    public void setIbsUfAliquota(Double ibsUfAliquota) {
        this.ibsUfAliquota = ibsUfAliquota;
    }

    public Double getIbsMunAliquota() {
        return ibsMunAliquota;
    }

    public void setIbsMunAliquota(Double ibsMunAliquota) {
        this.ibsMunAliquota = ibsMunAliquota;
    }

    public Double getCbsAliquota() {
        return cbsAliquota;
    }

    public void setCbsAliquota(Double cbsAliquota) {
        this.cbsAliquota = cbsAliquota;
    }

    public Double getIbsUfValor() {
        return ibsUfValor;
    }

    public void setIbsUfValor(Double ibsUfValor) {
        this.ibsUfValor = ibsUfValor;
    }

    public Double getIbsMunValor() {
        return ibsMunValor;
    }

    public void setIbsMunValor(Double ibsMunValor) {
        this.ibsMunValor = ibsMunValor;
    }

    public Double getCbsValor() {
        return cbsValor;
    }

    public void setCbsValor(Double cbsValor) {
        this.cbsValor = cbsValor;
    }
}
