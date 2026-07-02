package balbucio.focusnfe4j.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NfeItem {

    @JsonProperty("numero_item")
    private Integer numeroItem;

    @JsonProperty("codigo_produto")
    private String codigoProduto;

    @JsonProperty("codigo_barras_comercial")
    private String codigoBarrasComercial;

    @JsonProperty("codigo_barras_proprio_comercial")
    private String codigoBarrasProprioComercial;

    @JsonProperty("descricao")
    private String descricao;

    @JsonProperty("codigo_ncm")
    private String codigoNcm;

    @JsonProperty("nves")
    private List<String> nves;

    @JsonProperty("cest")
    private String cest;

    @JsonProperty("escala_relevante")
    private Boolean escalaRelevante;

    @JsonProperty("cnpj_fabricante")
    private String cnpjFabricante;

    @JsonProperty("codigo_beneficio_fiscal")
    private String codigoBeneficioFiscal;

    @JsonProperty("infos_credito_presumido")
    private List<InfoCreditoPresumido> infosCreditoPresumido;

    @JsonProperty("codigo_ex_tipi")
    private String codigoExTipi;

    @JsonProperty("cfop")
    private Integer cfop;

    @JsonProperty("unidade_comercial")
    private String unidadeComercial;

    @JsonProperty("quantidade_comercial")
    private Double quantidadeComercial;

    @JsonProperty("valor_unitario_comercial")
    private Double valorUnitarioComercial;

    @JsonProperty("valor_bruto")
    private Double valorBruto;

    @JsonProperty("codigo_barras_tributavel")
    private String codigoBarrasTributavel;

    @JsonProperty("codigo_barras_proprio_tributavel")
    private String codigoBarrasProprioTributavel;

    @JsonProperty("unidade_tributavel")
    private String unidadeTributavel;

    @JsonProperty("quantidade_tributavel")
    private Double quantidadeTributavel;

    @JsonProperty("valor_unitario_tributavel")
    private Double valorUnitarioTributavel;

    @JsonProperty("valor_frete")
    private Double valorFrete;

    @JsonProperty("valor_seguro")
    private Double valorSeguro;

    @JsonProperty("valor_desconto")
    private Double valorDesconto;

    @JsonProperty("valor_outras_despesas")
    private Double valorOutrasDespesas;

    @JsonProperty("inclui_no_total")
    private Integer incluiNoTotal;

    @JsonProperty("bem_movel_usado")
    private Integer bemMovelUsado;

    @JsonProperty("documentos_importacao")
    private List<DocumentoImportacao> documentosImportacao;

    @JsonProperty("detalhes_exportacao")
    private List<DetalheExportacao> detalhesExportacao;

    @JsonProperty("pedido_compra")
    private String pedidoCompra;

    @JsonProperty("numero_item_pedido_compra")
    private Integer numeroItemPedidoCompra;

    @JsonProperty("numero_fci")
    private String numeroFci;

    @JsonProperty("rastros")
    private List<Rastro> rastros;

    @JsonProperty("veiculo_tipo_operacao")
    private String veiculoTipoOperacao;

    @JsonProperty("veiculo_chassi")
    private String veiculoChassi;

    @JsonProperty("veiculo_codigo_cor")
    private String veiculoCodigoCor;

    @JsonProperty("veiculo_descricao_cor")
    private String veiculoDescricaoCor;

    @JsonProperty("veiculo_potencia_motor")
    private String veiculoPotenciaMotor;

    @JsonProperty("veiculo_cm3")
    private String veiculoCm3;

    @JsonProperty("veiculo_peso_liquido")
    private String veiculoPesoLiquido;

    @JsonProperty("veiculo_peso_bruto")
    private String veiculoPesoBruto;

    @JsonProperty("veiculo_serie")
    private String veiculoSerie;

    @JsonProperty("veiculo_tipo_combustivel")
    private String veiculoTipoCombustivel;

    @JsonProperty("veiculo_numero_motor")
    private String veiculoNumeroMotor;

    @JsonProperty("veiculo_cmt")
    private String veiculoCmt;

    @JsonProperty("veiculo_distancia_eixos")
    private String veiculoDistanciaEixos;

    @JsonProperty("veiculo_ano_modelo")
    private Integer veiculoAnoModelo;

    @JsonProperty("veiculo_ano_fabricacao")
    private Integer veiculoAnoFabricacao;

    @JsonProperty("veiculo_tipo_pintura")
    private String veiculoTipoPintura;

    @JsonProperty("veiculo_tipo")
    private Integer veiculoTipo;

    @JsonProperty("veiculo_especie")
    private Integer veiculoEspecie;

    @JsonProperty("veiculo_codigo_vin")
    private String veiculoCodigoVin;

    @JsonProperty("veiculo_condicao")
    private String veiculoCondicao;

    @JsonProperty("veiculo_codigo_marca_modelo")
    private Integer veiculoCodigoMarcaModelo;

    @JsonProperty("veiculo_codigo_cor_denatran")
    private String veiculoCodigoCorDenatran;

    @JsonProperty("veiculo_lotacao")
    private Integer veiculoLotacao;

    @JsonProperty("veiculo_restricao")
    private String veiculoRestricao;

    @JsonProperty("medicamento_codigo_anvisa")
    private String medicamentoCodigoAnvisa;

    @JsonProperty("medicamento_motivo_isencao")
    private String medicamentoMotivoIsencao;

    @JsonProperty("medicamento_preco_maximo_consumidor")
    private Double medicamentoPrecoMaximoConsumidor;

    @JsonProperty("armamentos")
    private List<Armamento> armamentos;

    @JsonProperty("combustivel_codigo_anp")
    private Integer combustivelCodigoAnp;

    @JsonProperty("combustivel_descricao_anp")
    private String combustivelDescricaoAnp;

    @JsonProperty("combustivel_percentual_glp")
    private Double combustivelPercentualGlp;

    @JsonProperty("combustivel_percentual_gas_natural_nacional")
    private Double combustivelPercentualGasNaturalNacional;

    @JsonProperty("combustivel_percentual_gas_natural_importado")
    private Double combustivelPercentualGasNaturalImportado;

    @JsonProperty("combustivel_valor_partida")
    private Double combustivelValorPartida;

    @JsonProperty("combustivel_registro_codif")
    private Integer combustivelRegistroCodif;

    @JsonProperty("combustivel_quantidade_temperatura_ambiente")
    private Double combustivelQuantidadeTemperaturaAmbiente;

    @JsonProperty("combustivel_sigla_uf")
    private String combustivelSiglaUf;

    @JsonProperty("combustivel_cide_base_calculo")
    private Double combustivelCideBaseCalculo;

    @JsonProperty("combustivel_cide_aliquota")
    private Double combustivelCideAliquota;

    @JsonProperty("combustivel_cide_valor")
    private Double combustivelCideValor;

    @JsonProperty("combustivel_numero_bico")
    private Integer combustivelNumeroBico;

    @JsonProperty("combustivel_numero_bomba")
    private Integer combustivelNumeroBomba;

    @JsonProperty("combustivel_numero_tanque")
    private Integer combustivelNumeroTanque;

    @JsonProperty("combustivel_valor_encerrante_inicio")
    private Double combustivelValorEncerranteInicio;

    @JsonProperty("combustivel_valor_encerrante_final")
    private Double combustivelValorEncerranteFinal;

    @JsonProperty("combustivel_percentual_biodiesel")
    private Double combustivelPercentualBiodiesel;

    @JsonProperty("origens_combustivel")
    private List<OrigemCombustivel> origensCombustivel;

    @JsonProperty("icms_origem")
    private Integer icmsOrigem;

    @JsonProperty("icms_situacao_tributaria")
    private String icmsSituacaoTributaria;

    @JsonProperty("icms_modalidade_base_calculo")
    private Integer icmsModalidadeBaseCalculo;

    @JsonProperty("icms_base_calculo")
    private Double icmsBaseCalculo;

    @JsonProperty("icms_base_calculo_mono")
    private Double icmsBaseCalculoMono;

    @JsonProperty("icms_base_calculo_retido_st")
    private Double icmsBaseCalculoRetidoSt;

    @JsonProperty("icms_base_calculo_mono_retencao")
    private Double icmsBaseCalculoMonoRetencao;

    @JsonProperty("icms_reducao_base_calculo")
    private Double icmsReducaoBaseCalculo;

    @JsonProperty("icms_codigo_beneficio_fiscal_reducao_base_calculo")
    private String icmsCodigoBeneficioFiscalReducaoBaseCalculo;

    @JsonProperty("icms_aliquota")
    private Double icmsAliquota;

    @JsonProperty("icms_aliquota_final")
    private Double icmsAliquotaFinal;

    @JsonProperty("icms_aliquota_retencao")
    private Double icmsAliquotaRetencao;

    @JsonProperty("icms_valor_substituto")
    private Double icmsValorSubstituto;

    @JsonProperty("icms_valor")
    private Double icmsValor;

    @JsonProperty("icms_valor_mono")
    private Double icmsValorMono;

    @JsonProperty("icms_valor_mono_retencao")
    private Double icmsValorMonoRetencao;

    @JsonProperty("icms_valor_retido_st")
    private Double icmsValorRetidoSt;

    @JsonProperty("icms_valor_desonerado")
    private Double icmsValorDesonerado;

    @JsonProperty("icms_valor_operacao")
    private Double icmsValorOperacao;

    @JsonProperty("icms_valor_mono_operacao")
    private Double icmsValorMonoOperacao;

    @JsonProperty("icms_percentual_diferimento")
    private Double icmsPercentualDiferimento;

    @JsonProperty("icms_percentual_reducao")
    private Double icmsPercentualReducao;

    @JsonProperty("icms_valor_diferido")
    private Double icmsValorDiferido;

    @JsonProperty("icms_valor_mono_diferido")
    private Double icmsValorMonoDiferido;

    @JsonProperty("icms_motivo_desoneracao")
    private String icmsMotivoDesoneracao;

    @JsonProperty("icms_deducao_desoneracao")
    private Integer icmsDeducaoDesoneracao;

    @JsonProperty("icms_motivo_reducao")
    private String icmsMotivoReducao;

    @JsonProperty("icms_valor_icms_st_desonerado")
    private Double icmsValorIcmsStDesonerado;

    @JsonProperty("icms_motivo_desoneracao_icms_st")
    private String icmsMotivoDesoneracaoIcmsSt;

    @JsonProperty("icms_modalidade_base_calculo_st")
    private Integer icmsModalidadeBaseCalculoSt;

    @JsonProperty("icms_margem_valor_adicionado_st")
    private Double icmsMargemValorAdicionadoSt;

    @JsonProperty("icms_reducao_base_calculo_st")
    private Double icmsReducaoBaseCalculoSt;

    @JsonProperty("icms_base_calculo_st")
    private Double icmsBaseCalculoSt;

    @JsonProperty("icms_aliquota_retido")
    private Double icmsAliquotaRetido;

    @JsonProperty("icms_aliquota_st")
    private Double icmsAliquotaSt;

    @JsonProperty("icms_valor_mono_retido")
    private Double icmsValorMonoRetido;

    @JsonProperty("icms_valor_st")
    private Double icmsValorSt;

    @JsonProperty("icms_base_calculo_operacao_propria")
    private Double icmsBaseCalculoOperacaoPropria;

    @JsonProperty("icms_uf_st")
    private String icmsUfSt;

    @JsonProperty("icms_base_calculo_mono_retido")
    private Double icmsBaseCalculoMonoRetido;

    @JsonProperty("icms_base_calculo_retido_remetente")
    private Double icmsBaseCalculoRetidoRemetente;

    @JsonProperty("icms_valor_retido_remetente")
    private Double icmsValorRetidoRemetente;

    @JsonProperty("icms_base_calculo_destino")
    private Double icmsBaseCalculoDestino;

    @JsonProperty("icms_valor_destino")
    private Double icmsValorDestino;

    @JsonProperty("icms_aliquota_credito_simples")
    private Double icmsAliquotaCreditoSimples;

    @JsonProperty("icms_valor_credito_simples")
    private Double icmsValorCreditoSimples;

    @JsonProperty("icms_reducao_base_calculo_efetiva")
    private Double icmsReducaoBaseCalculoEfetiva;

    @JsonProperty("icms_base_calculo_efetiva")
    private Double icmsBaseCalculoEfetiva;

    @JsonProperty("icms_aliquota_efetiva")
    private Double icmsAliquotaEfetiva;

    @JsonProperty("icms_valor_efetivo")
    private Double icmsValorEfetivo;

    @JsonProperty("fcp_percentual")
    private Double fcpPercentual;

    @JsonProperty("fcp_base_calculo")
    private Double fcpBaseCalculo;

    @JsonProperty("fcp_valor")
    private Double fcpValor;

    @JsonProperty("fcp_percentual_st")
    private Double fcpPercentualSt;

    @JsonProperty("fcp_base_calculo_st")
    private Double fcpBaseCalculoSt;

    @JsonProperty("fcp_valor_st")
    private Double fcpValorSt;

    @JsonProperty("fcp_percentual_retido_st")
    private Double fcpPercentualRetidoSt;

    @JsonProperty("fcp_base_calculo_retido_st")
    private Double fcpBaseCalculoRetidoSt;

    @JsonProperty("fcp_valor_retido_st")
    private Double fcpValorRetidoSt;

    @JsonProperty("icms_fcp_percentual_diferimento")
    private Double icmsFcpPercentualDiferimento;

    @JsonProperty("icms_fcp_valor_diferido")
    private Double icmsFcpValorDiferido;

    @JsonProperty("icms_fcp_valor_efetivo")
    private Double icmsFcpValorEfetivo;

    @JsonProperty("icms_base_calculo_uf_destino")
    private Double icmsBaseCalculoUfDestino;

    @JsonProperty("fcp_base_calculo_uf_destino")
    private Double fcpBaseCalculoUfDestino;

    @JsonProperty("fcp_percentual_uf_destino")
    private Double fcpPercentualUfDestino;

    @JsonProperty("icms_aliquota_interna_uf_destino")
    private Double icmsAliquotaInternaUfDestino;

    @JsonProperty("icms_aliquota_interestadual")
    private Double icmsAliquotaInterestadual;

    @JsonProperty("icms_percentual_partilha")
    private Double icmsPercentualPartilha;

    @JsonProperty("fcp_valor_uf_destino")
    private Double fcpValorUfDestino;

    @JsonProperty("icms_valor_uf_destino")
    private Double icmsValorUfDestino;

    @JsonProperty("icms_valor_uf_remetente")
    private Double icmsValorUfRemetente;

    @JsonProperty("ipi_situacao_tributaria")
    private String ipiSituacaoTributaria;

    @JsonProperty("ipi_base_calculo")
    private Double ipiBaseCalculo;

    @JsonProperty("ipi_aliquota")
    private Double ipiAliquota;

    @JsonProperty("ipi_quantidade_total")
    private Double ipiQuantidadeTotal;

    @JsonProperty("ipi_valor_por_unidade_tributavel")
    private Double ipiValorPorUnidadeTributavel;

    @JsonProperty("ipi_valor")
    private Double ipiValor;

    @JsonProperty("ipi_cnpj_produtor")
    private String ipiCnpjProdutor;

    @JsonProperty("ipi_codigo_selo_controle")
    private String ipiCodigoSeloControle;

    @JsonProperty("ipi_quantidade_selo_controle")
    private Integer ipiQuantidadeSeloControle;

    @JsonProperty("ipi_codigo_enquadramento_legal")
    private Integer ipiCodigoEnquadramentoLegal;

    @JsonProperty("ii_base_calculo")
    private Double iiBaseCalculo;

    @JsonProperty("ii_despesas_aduaneiras")
    private Double iiDespesasAduaneiras;

    @JsonProperty("ii_valor")
    private Double iiValor;

    @JsonProperty("ii_valor_iof")
    private Double iiValorIof;

    @JsonProperty("issqn_base_calculo")
    private Double issqnBaseCalculo;

    @JsonProperty("issqn_aliquota")
    private Double issqnAliquota;

    @JsonProperty("issqn_valor")
    private Double issqnValor;

    @JsonProperty("issqn_codigo_municipio")
    private Integer issqnCodigoMunicipio;

    @JsonProperty("issqn_item_lista_servico")
    private String issqnItemListaServico;

    @JsonProperty("issqn_valor_deducao")
    private Double issqnValorDeducao;

    @JsonProperty("issqn_valor_outras_retencoes")
    private Double issqnValorOutrasRetencoes;

    @JsonProperty("issqn_valor_desconto_incondicionado")
    private Double issqnValorDescontoIncondicionado;

    @JsonProperty("issqn_valor_desconto_condicionado")
    private Double issqnValorDescontoCondicionado;

    @JsonProperty("issqn_valor_retencao")
    private Double issqnValorRetencao;

    @JsonProperty("issqn_indicador_exigibilidade")
    private Integer issqnIndicadorExigibilidade;

    @JsonProperty("issqn_codigo_servico")
    private String issqnCodigoServico;

    @JsonProperty("issqn_codigo_municipio_incidencia")
    private Integer issqnCodigoMunicipioIncidencia;

    @JsonProperty("issqn_codigo_pais")
    private Integer issqnCodigoPais;

    @JsonProperty("issqn_numero_processo")
    private String issqnNumeroProcesso;

    @JsonProperty("issqn_indicador_incentivo")
    private Integer issqnIndicadorIncentivo;

    @JsonProperty("pis_situacao_tributaria")
    private String pisSituacaoTributaria;

    @JsonProperty("pis_base_calculo")
    private Double pisBaseCalculo;

    @JsonProperty("pis_aliquota_porcentual")
    private Double pisAliquotaPorcentual;

    @JsonProperty("pis_quantidade_vendida")
    private Double pisQuantidadeVendida;

    @JsonProperty("pis_aliquota_valor")
    private Double pisAliquotaValor;

    @JsonProperty("pis_valor")
    private Double pisValor;

    @JsonProperty("pis_base_calculo_st")
    private Double pisBaseCalculoSt;

    @JsonProperty("pis_aliquota_porcentual_st")
    private Double pisAliquotaPorcentualSt;

    @JsonProperty("pis_quantidade_vendida_st")
    private Double pisQuantidadeVendidaSt;

    @JsonProperty("pis_aliquota_valor_st")
    private Double pisAliquotaValorSt;

    @JsonProperty("pis_valor_st")
    private Double pisValorSt;

    @JsonProperty("inclui_pis_st_no_total")
    private Integer incluiPisStNoTotal;

    @JsonProperty("cofins_situacao_tributaria")
    private String cofinsSituacaoTributaria;

    @JsonProperty("cofins_base_calculo")
    private Double cofinsBaseCalculo;

    @JsonProperty("cofins_aliquota_porcentual")
    private Double cofinsAliquotaPorcentual;

    @JsonProperty("cofins_quantidade_vendida")
    private Double cofinsQuantidadeVendida;

    @JsonProperty("cofins_aliquota_valor")
    private Double cofinsAliquotaValor;

    @JsonProperty("cofins_valor")
    private Double cofinsValor;

    @JsonProperty("cofins_base_calculo_st")
    private Double cofinsBaseCalculoSt;

    @JsonProperty("cofins_aliquota_porcentual_st")
    private Double cofinsAliquotaPorcentualSt;

    @JsonProperty("cofins_quantidade_vendida_st")
    private Double cofinsQuantidadeVendidaSt;

    @JsonProperty("cofins_aliquota_valor_st")
    private Double cofinsAliquotaValorSt;

    @JsonProperty("cofins_valor_st")
    private Double cofinsValorSt;

    @JsonProperty("inclui_cofins_st_no_total")
    private Integer incluiCofinsStNoTotal;

    @JsonProperty("is_situacao_tributaria")
    private String isSituacaoTributaria;

    @JsonProperty("is_classificacao_tributaria")
    private String isClassificacaoTributaria;

    @JsonProperty("is_base_calculo")
    private Double isBaseCalculo;

    @JsonProperty("is_aliquota")
    private Double isAliquota;

    @JsonProperty("is_aliquota_especifica")
    private Double isAliquotaEspecifica;

    @JsonProperty("is_unidade_tributavel")
    private String isUnidadeTributavel;

    @JsonProperty("is_valor")
    private Double isValor;

    @JsonProperty("ibs_cbs_base_calculo")
    private Double ibsCbsBaseCalculo;

    @JsonProperty("ibs_uf_aliquota")
    private Double ibsUfAliquota;

    @JsonProperty("ibs_uf_percentual_diferimento")
    private Double ibsUfPercentualDiferimento;

    @JsonProperty("ibs_uf_valor_diferido")
    private Double ibsUfValorDiferido;

    @JsonProperty("ibs_uf_valor_tributo_devolvido")
    private Double ibsUfValorTributoDevolvido;

    @JsonProperty("ibs_uf_percentual_reducao_aliquota")
    private Double ibsUfPercentualReducaoAliquota;

    @JsonProperty("ibs_uf_aliquota_efetiva")
    private Double ibsUfAliquotaEfetiva;

    @JsonProperty("ibs_uf_valor")
    private Double ibsUfValor;

    @JsonProperty("ibs_mun_aliquota")
    private Double ibsMunAliquota;

    @JsonProperty("ibs_mun_percentual_diferimento")
    private Double ibsMunPercentualDiferimento;

    @JsonProperty("ibs_mun_valor_diferido")
    private Double ibsMunValorDiferido;

    @JsonProperty("ibs_mun_valor_tributo_devolvido")
    private Double ibsMunValorTributoDevolvido;

    @JsonProperty("ibs_mun_percentual_reducao_aliquota")
    private Double ibsMunPercentualReducaoAliquota;

    @JsonProperty("ibs_mun_aliquota_efetiva")
    private Double ibsMunAliquotaEfetiva;

    @JsonProperty("ibs_mun_valor")
    private Double ibsMunValor;

    @JsonProperty("ibs_valor_total")
    private Double ibsValorTotal;

    @JsonProperty("cbs_aliquota")
    private Double cbsAliquota;

    @JsonProperty("cbs_percentual_diferimento")
    private Double cbsPercentualDiferimento;

    @JsonProperty("cbs_valor_diferido")
    private Double cbsValorDiferido;

    @JsonProperty("cbs_valor_tributo_devolvido")
    private Double cbsValorTributoDevolvido;

    @JsonProperty("cbs_percentual_reducao_aliquota")
    private Double cbsPercentualReducaoAliquota;

    @JsonProperty("cbs_aliquota_efetiva")
    private Double cbsAliquotaEfetiva;

    @JsonProperty("cbs_valor")
    private Double cbsValor;

    @JsonProperty("ibs_cbs_valor_total")
    private Double ibsCbsValorTotal;

    @JsonProperty("percentual_devolvido")
    private Double percentualDevolvido;

    @JsonProperty("valor_ipi_devolvido")
    private Double valorIpiDevolvido;

    @JsonProperty("informacoes_adicionais_item")
    private String informacoesAdicionaisItem;

    @JsonProperty("observacoes_contribuinte")
    private List<ObservacaoContribuinte> observacoesContribuinte;

    @JsonProperty("valor_total_item")
    private Double valorTotalItem;

    @JsonProperty("chave_acesso_dfe_referenciado")
    private String chaveAcessoDfeReferenciado;

    @JsonProperty("numero_item_dfe_referenciado")
    private String numeroItemDfeReferenciado;

    @JsonProperty("credito_presumido_zfm_classificacao")
    private Integer creditoPresumidoZfmClassificacao;

    @JsonProperty("credito_presumido_zfm_valor")
    private Double creditoPresumidoZfmValor;

    public Integer getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(Integer numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getCodigoBarrasComercial() {
        return codigoBarrasComercial;
    }

    public void setCodigoBarrasComercial(String codigoBarrasComercial) {
        this.codigoBarrasComercial = codigoBarrasComercial;
    }

    public String getCodigoBarrasProprioComercial() {
        return codigoBarrasProprioComercial;
    }

    public void setCodigoBarrasProprioComercial(String codigoBarrasProprioComercial) {
        this.codigoBarrasProprioComercial = codigoBarrasProprioComercial;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigoNcm() {
        return codigoNcm;
    }

    public void setCodigoNcm(String codigoNcm) {
        this.codigoNcm = codigoNcm;
    }

    public List<String> getNves() {
        return nves;
    }

    public void setNves(List<String> nves) {
        this.nves = nves;
    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

    public Boolean getEscalaRelevante() {
        return escalaRelevante;
    }

    public void setEscalaRelevante(Boolean escalaRelevante) {
        this.escalaRelevante = escalaRelevante;
    }

    public String getCnpjFabricante() {
        return cnpjFabricante;
    }

    public void setCnpjFabricante(String cnpjFabricante) {
        this.cnpjFabricante = cnpjFabricante;
    }

    public String getCodigoBeneficioFiscal() {
        return codigoBeneficioFiscal;
    }

    public void setCodigoBeneficioFiscal(String codigoBeneficioFiscal) {
        this.codigoBeneficioFiscal = codigoBeneficioFiscal;
    }

    public List<InfoCreditoPresumido> getInfosCreditoPresumido() {
        return infosCreditoPresumido;
    }

    public void setInfosCreditoPresumido(List<InfoCreditoPresumido> infosCreditoPresumido) {
        this.infosCreditoPresumido = infosCreditoPresumido;
    }

    public String getCodigoExTipi() {
        return codigoExTipi;
    }

    public void setCodigoExTipi(String codigoExTipi) {
        this.codigoExTipi = codigoExTipi;
    }

    public Integer getCfop() {
        return cfop;
    }

    public void setCfop(Integer cfop) {
        this.cfop = cfop;
    }

    public String getUnidadeComercial() {
        return unidadeComercial;
    }

    public void setUnidadeComercial(String unidadeComercial) {
        this.unidadeComercial = unidadeComercial;
    }

    public Double getQuantidadeComercial() {
        return quantidadeComercial;
    }

    public void setQuantidadeComercial(Double quantidadeComercial) {
        this.quantidadeComercial = quantidadeComercial;
    }

    public Double getValorUnitarioComercial() {
        return valorUnitarioComercial;
    }

    public void setValorUnitarioComercial(Double valorUnitarioComercial) {
        this.valorUnitarioComercial = valorUnitarioComercial;
    }

    public Double getValorBruto() {
        return valorBruto;
    }

    public void setValorBruto(Double valorBruto) {
        this.valorBruto = valorBruto;
    }

    public String getCodigoBarrasTributavel() {
        return codigoBarrasTributavel;
    }

    public void setCodigoBarrasTributavel(String codigoBarrasTributavel) {
        this.codigoBarrasTributavel = codigoBarrasTributavel;
    }

    public String getCodigoBarrasProprioTributavel() {
        return codigoBarrasProprioTributavel;
    }

    public void setCodigoBarrasProprioTributavel(String codigoBarrasProprioTributavel) {
        this.codigoBarrasProprioTributavel = codigoBarrasProprioTributavel;
    }

    public String getUnidadeTributavel() {
        return unidadeTributavel;
    }

    public void setUnidadeTributavel(String unidadeTributavel) {
        this.unidadeTributavel = unidadeTributavel;
    }

    public Double getQuantidadeTributavel() {
        return quantidadeTributavel;
    }

    public void setQuantidadeTributavel(Double quantidadeTributavel) {
        this.quantidadeTributavel = quantidadeTributavel;
    }

    public Double getValorUnitarioTributavel() {
        return valorUnitarioTributavel;
    }

    public void setValorUnitarioTributavel(Double valorUnitarioTributavel) {
        this.valorUnitarioTributavel = valorUnitarioTributavel;
    }

    public Double getValorFrete() {
        return valorFrete;
    }

    public void setValorFrete(Double valorFrete) {
        this.valorFrete = valorFrete;
    }

    public Double getValorSeguro() {
        return valorSeguro;
    }

    public void setValorSeguro(Double valorSeguro) {
        this.valorSeguro = valorSeguro;
    }

    public Double getValorDesconto() {
        return valorDesconto;
    }

    public void setValorDesconto(Double valorDesconto) {
        this.valorDesconto = valorDesconto;
    }

    public Double getValorOutrasDespesas() {
        return valorOutrasDespesas;
    }

    public void setValorOutrasDespesas(Double valorOutrasDespesas) {
        this.valorOutrasDespesas = valorOutrasDespesas;
    }

    public Integer getIncluiNoTotal() {
        return incluiNoTotal;
    }

    public void setIncluiNoTotal(Integer incluiNoTotal) {
        this.incluiNoTotal = incluiNoTotal;
    }

    public Integer getBemMovelUsado() {
        return bemMovelUsado;
    }

    public void setBemMovelUsado(Integer bemMovelUsado) {
        this.bemMovelUsado = bemMovelUsado;
    }

    public List<DocumentoImportacao> getDocumentosImportacao() {
        return documentosImportacao;
    }

    public void setDocumentosImportacao(List<DocumentoImportacao> documentosImportacao) {
        this.documentosImportacao = documentosImportacao;
    }

    public List<DetalheExportacao> getDetalhesExportacao() {
        return detalhesExportacao;
    }

    public void setDetalhesExportacao(List<DetalheExportacao> detalhesExportacao) {
        this.detalhesExportacao = detalhesExportacao;
    }

    public String getPedidoCompra() {
        return pedidoCompra;
    }

    public void setPedidoCompra(String pedidoCompra) {
        this.pedidoCompra = pedidoCompra;
    }

    public Integer getNumeroItemPedidoCompra() {
        return numeroItemPedidoCompra;
    }

    public void setNumeroItemPedidoCompra(Integer numeroItemPedidoCompra) {
        this.numeroItemPedidoCompra = numeroItemPedidoCompra;
    }

    public String getNumeroFci() {
        return numeroFci;
    }

    public void setNumeroFci(String numeroFci) {
        this.numeroFci = numeroFci;
    }

    public List<Rastro> getRastros() {
        return rastros;
    }

    public void setRastros(List<Rastro> rastros) {
        this.rastros = rastros;
    }

    public String getVeiculoTipoOperacao() {
        return veiculoTipoOperacao;
    }

    public void setVeiculoTipoOperacao(String veiculoTipoOperacao) {
        this.veiculoTipoOperacao = veiculoTipoOperacao;
    }

    public String getVeiculoChassi() {
        return veiculoChassi;
    }

    public void setVeiculoChassi(String veiculoChassi) {
        this.veiculoChassi = veiculoChassi;
    }

    public String getVeiculoCodigoCor() {
        return veiculoCodigoCor;
    }

    public void setVeiculoCodigoCor(String veiculoCodigoCor) {
        this.veiculoCodigoCor = veiculoCodigoCor;
    }

    public String getVeiculoDescricaoCor() {
        return veiculoDescricaoCor;
    }

    public void setVeiculoDescricaoCor(String veiculoDescricaoCor) {
        this.veiculoDescricaoCor = veiculoDescricaoCor;
    }

    public String getVeiculoPotenciaMotor() {
        return veiculoPotenciaMotor;
    }

    public void setVeiculoPotenciaMotor(String veiculoPotenciaMotor) {
        this.veiculoPotenciaMotor = veiculoPotenciaMotor;
    }

    public String getVeiculoCm3() {
        return veiculoCm3;
    }

    public void setVeiculoCm3(String veiculoCm3) {
        this.veiculoCm3 = veiculoCm3;
    }

    public String getVeiculoPesoLiquido() {
        return veiculoPesoLiquido;
    }

    public void setVeiculoPesoLiquido(String veiculoPesoLiquido) {
        this.veiculoPesoLiquido = veiculoPesoLiquido;
    }

    public String getVeiculoPesoBruto() {
        return veiculoPesoBruto;
    }

    public void setVeiculoPesoBruto(String veiculoPesoBruto) {
        this.veiculoPesoBruto = veiculoPesoBruto;
    }

    public String getVeiculoSerie() {
        return veiculoSerie;
    }

    public void setVeiculoSerie(String veiculoSerie) {
        this.veiculoSerie = veiculoSerie;
    }

    public String getVeiculoTipoCombustivel() {
        return veiculoTipoCombustivel;
    }

    public void setVeiculoTipoCombustivel(String veiculoTipoCombustivel) {
        this.veiculoTipoCombustivel = veiculoTipoCombustivel;
    }

    public String getVeiculoNumeroMotor() {
        return veiculoNumeroMotor;
    }

    public void setVeiculoNumeroMotor(String veiculoNumeroMotor) {
        this.veiculoNumeroMotor = veiculoNumeroMotor;
    }

    public String getVeiculoCmt() {
        return veiculoCmt;
    }

    public void setVeiculoCmt(String veiculoCmt) {
        this.veiculoCmt = veiculoCmt;
    }

    public String getVeiculoDistanciaEixos() {
        return veiculoDistanciaEixos;
    }

    public void setVeiculoDistanciaEixos(String veiculoDistanciaEixos) {
        this.veiculoDistanciaEixos = veiculoDistanciaEixos;
    }

    public Integer getVeiculoAnoModelo() {
        return veiculoAnoModelo;
    }

    public void setVeiculoAnoModelo(Integer veiculoAnoModelo) {
        this.veiculoAnoModelo = veiculoAnoModelo;
    }

    public Integer getVeiculoAnoFabricacao() {
        return veiculoAnoFabricacao;
    }

    public void setVeiculoAnoFabricacao(Integer veiculoAnoFabricacao) {
        this.veiculoAnoFabricacao = veiculoAnoFabricacao;
    }

    public String getVeiculoTipoPintura() {
        return veiculoTipoPintura;
    }

    public void setVeiculoTipoPintura(String veiculoTipoPintura) {
        this.veiculoTipoPintura = veiculoTipoPintura;
    }

    public Integer getVeiculoTipo() {
        return veiculoTipo;
    }

    public void setVeiculoTipo(Integer veiculoTipo) {
        this.veiculoTipo = veiculoTipo;
    }

    public Integer getVeiculoEspecie() {
        return veiculoEspecie;
    }

    public void setVeiculoEspecie(Integer veiculoEspecie) {
        this.veiculoEspecie = veiculoEspecie;
    }

    public String getVeiculoCodigoVin() {
        return veiculoCodigoVin;
    }

    public void setVeiculoCodigoVin(String veiculoCodigoVin) {
        this.veiculoCodigoVin = veiculoCodigoVin;
    }

    public String getVeiculoCondicao() {
        return veiculoCondicao;
    }

    public void setVeiculoCondicao(String veiculoCondicao) {
        this.veiculoCondicao = veiculoCondicao;
    }

    public Integer getVeiculoCodigoMarcaModelo() {
        return veiculoCodigoMarcaModelo;
    }

    public void setVeiculoCodigoMarcaModelo(Integer veiculoCodigoMarcaModelo) {
        this.veiculoCodigoMarcaModelo = veiculoCodigoMarcaModelo;
    }

    public String getVeiculoCodigoCorDenatran() {
        return veiculoCodigoCorDenatran;
    }

    public void setVeiculoCodigoCorDenatran(String veiculoCodigoCorDenatran) {
        this.veiculoCodigoCorDenatran = veiculoCodigoCorDenatran;
    }

    public Integer getVeiculoLotacao() {
        return veiculoLotacao;
    }

    public void setVeiculoLotacao(Integer veiculoLotacao) {
        this.veiculoLotacao = veiculoLotacao;
    }

    public String getVeiculoRestricao() {
        return veiculoRestricao;
    }

    public void setVeiculoRestricao(String veiculoRestricao) {
        this.veiculoRestricao = veiculoRestricao;
    }

    public String getMedicamentoCodigoAnvisa() {
        return medicamentoCodigoAnvisa;
    }

    public void setMedicamentoCodigoAnvisa(String medicamentoCodigoAnvisa) {
        this.medicamentoCodigoAnvisa = medicamentoCodigoAnvisa;
    }

    public String getMedicamentoMotivoIsencao() {
        return medicamentoMotivoIsencao;
    }

    public void setMedicamentoMotivoIsencao(String medicamentoMotivoIsencao) {
        this.medicamentoMotivoIsencao = medicamentoMotivoIsencao;
    }

    public Double getMedicamentoPrecoMaximoConsumidor() {
        return medicamentoPrecoMaximoConsumidor;
    }

    public void setMedicamentoPrecoMaximoConsumidor(Double medicamentoPrecoMaximoConsumidor) {
        this.medicamentoPrecoMaximoConsumidor = medicamentoPrecoMaximoConsumidor;
    }

    public List<Armamento> getArmamentos() {
        return armamentos;
    }

    public void setArmamentos(List<Armamento> armamentos) {
        this.armamentos = armamentos;
    }

    public Integer getCombustivelCodigoAnp() {
        return combustivelCodigoAnp;
    }

    public void setCombustivelCodigoAnp(Integer combustivelCodigoAnp) {
        this.combustivelCodigoAnp = combustivelCodigoAnp;
    }

    public String getCombustivelDescricaoAnp() {
        return combustivelDescricaoAnp;
    }

    public void setCombustivelDescricaoAnp(String combustivelDescricaoAnp) {
        this.combustivelDescricaoAnp = combustivelDescricaoAnp;
    }

    public Double getCombustivelPercentualGlp() {
        return combustivelPercentualGlp;
    }

    public void setCombustivelPercentualGlp(Double combustivelPercentualGlp) {
        this.combustivelPercentualGlp = combustivelPercentualGlp;
    }

    public Double getCombustivelPercentualGasNaturalNacional() {
        return combustivelPercentualGasNaturalNacional;
    }

    public void setCombustivelPercentualGasNaturalNacional(Double combustivelPercentualGasNaturalNacional) {
        this.combustivelPercentualGasNaturalNacional = combustivelPercentualGasNaturalNacional;
    }

    public Double getCombustivelPercentualGasNaturalImportado() {
        return combustivelPercentualGasNaturalImportado;
    }

    public void setCombustivelPercentualGasNaturalImportado(Double combustivelPercentualGasNaturalImportado) {
        this.combustivelPercentualGasNaturalImportado = combustivelPercentualGasNaturalImportado;
    }

    public Double getCombustivelValorPartida() {
        return combustivelValorPartida;
    }

    public void setCombustivelValorPartida(Double combustivelValorPartida) {
        this.combustivelValorPartida = combustivelValorPartida;
    }

    public Integer getCombustivelRegistroCodif() {
        return combustivelRegistroCodif;
    }

    public void setCombustivelRegistroCodif(Integer combustivelRegistroCodif) {
        this.combustivelRegistroCodif = combustivelRegistroCodif;
    }

    public Double getCombustivelQuantidadeTemperaturaAmbiente() {
        return combustivelQuantidadeTemperaturaAmbiente;
    }

    public void setCombustivelQuantidadeTemperaturaAmbiente(Double combustivelQuantidadeTemperaturaAmbiente) {
        this.combustivelQuantidadeTemperaturaAmbiente = combustivelQuantidadeTemperaturaAmbiente;
    }

    public String getCombustivelSiglaUf() {
        return combustivelSiglaUf;
    }

    public void setCombustivelSiglaUf(String combustivelSiglaUf) {
        this.combustivelSiglaUf = combustivelSiglaUf;
    }

    public Double getCombustivelCideBaseCalculo() {
        return combustivelCideBaseCalculo;
    }

    public void setCombustivelCideBaseCalculo(Double combustivelCideBaseCalculo) {
        this.combustivelCideBaseCalculo = combustivelCideBaseCalculo;
    }

    public Double getCombustivelCideAliquota() {
        return combustivelCideAliquota;
    }

    public void setCombustivelCideAliquota(Double combustivelCideAliquota) {
        this.combustivelCideAliquota = combustivelCideAliquota;
    }

    public Double getCombustivelCideValor() {
        return combustivelCideValor;
    }

    public void setCombustivelCideValor(Double combustivelCideValor) {
        this.combustivelCideValor = combustivelCideValor;
    }

    public Integer getCombustivelNumeroBico() {
        return combustivelNumeroBico;
    }

    public void setCombustivelNumeroBico(Integer combustivelNumeroBico) {
        this.combustivelNumeroBico = combustivelNumeroBico;
    }

    public Integer getCombustivelNumeroBomba() {
        return combustivelNumeroBomba;
    }

    public void setCombustivelNumeroBomba(Integer combustivelNumeroBomba) {
        this.combustivelNumeroBomba = combustivelNumeroBomba;
    }

    public Integer getCombustivelNumeroTanque() {
        return combustivelNumeroTanque;
    }

    public void setCombustivelNumeroTanque(Integer combustivelNumeroTanque) {
        this.combustivelNumeroTanque = combustivelNumeroTanque;
    }

    public Double getCombustivelValorEncerranteInicio() {
        return combustivelValorEncerranteInicio;
    }

    public void setCombustivelValorEncerranteInicio(Double combustivelValorEncerranteInicio) {
        this.combustivelValorEncerranteInicio = combustivelValorEncerranteInicio;
    }

    public Double getCombustivelValorEncerranteFinal() {
        return combustivelValorEncerranteFinal;
    }

    public void setCombustivelValorEncerranteFinal(Double combustivelValorEncerranteFinal) {
        this.combustivelValorEncerranteFinal = combustivelValorEncerranteFinal;
    }

    public Double getCombustivelPercentualBiodiesel() {
        return combustivelPercentualBiodiesel;
    }

    public void setCombustivelPercentualBiodiesel(Double combustivelPercentualBiodiesel) {
        this.combustivelPercentualBiodiesel = combustivelPercentualBiodiesel;
    }

    public List<OrigemCombustivel> getOrigensCombustivel() {
        return origensCombustivel;
    }

    public void setOrigensCombustivel(List<OrigemCombustivel> origensCombustivel) {
        this.origensCombustivel = origensCombustivel;
    }

    public Integer getIcmsOrigem() {
        return icmsOrigem;
    }

    public void setIcmsOrigem(Integer icmsOrigem) {
        this.icmsOrigem = icmsOrigem;
    }

    public String getIcmsSituacaoTributaria() {
        return icmsSituacaoTributaria;
    }

    public void setIcmsSituacaoTributaria(String icmsSituacaoTributaria) {
        this.icmsSituacaoTributaria = icmsSituacaoTributaria;
    }

    public Integer getIcmsModalidadeBaseCalculo() {
        return icmsModalidadeBaseCalculo;
    }

    public void setIcmsModalidadeBaseCalculo(Integer icmsModalidadeBaseCalculo) {
        this.icmsModalidadeBaseCalculo = icmsModalidadeBaseCalculo;
    }

    public Double getIcmsBaseCalculo() {
        return icmsBaseCalculo;
    }

    public void setIcmsBaseCalculo(Double icmsBaseCalculo) {
        this.icmsBaseCalculo = icmsBaseCalculo;
    }

    public Double getIcmsBaseCalculoMono() {
        return icmsBaseCalculoMono;
    }

    public void setIcmsBaseCalculoMono(Double icmsBaseCalculoMono) {
        this.icmsBaseCalculoMono = icmsBaseCalculoMono;
    }

    public Double getIcmsBaseCalculoRetidoSt() {
        return icmsBaseCalculoRetidoSt;
    }

    public void setIcmsBaseCalculoRetidoSt(Double icmsBaseCalculoRetidoSt) {
        this.icmsBaseCalculoRetidoSt = icmsBaseCalculoRetidoSt;
    }

    public Double getIcmsBaseCalculoMonoRetencao() {
        return icmsBaseCalculoMonoRetencao;
    }

    public void setIcmsBaseCalculoMonoRetencao(Double icmsBaseCalculoMonoRetencao) {
        this.icmsBaseCalculoMonoRetencao = icmsBaseCalculoMonoRetencao;
    }

    public Double getIcmsReducaoBaseCalculo() {
        return icmsReducaoBaseCalculo;
    }

    public void setIcmsReducaoBaseCalculo(Double icmsReducaoBaseCalculo) {
        this.icmsReducaoBaseCalculo = icmsReducaoBaseCalculo;
    }

    public String getIcmsCodigoBeneficioFiscalReducaoBaseCalculo() {
        return icmsCodigoBeneficioFiscalReducaoBaseCalculo;
    }

    public void setIcmsCodigoBeneficioFiscalReducaoBaseCalculo(String icmsCodigoBeneficioFiscalReducaoBaseCalculo) {
        this.icmsCodigoBeneficioFiscalReducaoBaseCalculo = icmsCodigoBeneficioFiscalReducaoBaseCalculo;
    }

    public Double getIcmsAliquota() {
        return icmsAliquota;
    }

    public void setIcmsAliquota(Double icmsAliquota) {
        this.icmsAliquota = icmsAliquota;
    }

    public Double getIcmsAliquotaFinal() {
        return icmsAliquotaFinal;
    }

    public void setIcmsAliquotaFinal(Double icmsAliquotaFinal) {
        this.icmsAliquotaFinal = icmsAliquotaFinal;
    }

    public Double getIcmsAliquotaRetencao() {
        return icmsAliquotaRetencao;
    }

    public void setIcmsAliquotaRetencao(Double icmsAliquotaRetencao) {
        this.icmsAliquotaRetencao = icmsAliquotaRetencao;
    }

    public Double getIcmsValorSubstituto() {
        return icmsValorSubstituto;
    }

    public void setIcmsValorSubstituto(Double icmsValorSubstituto) {
        this.icmsValorSubstituto = icmsValorSubstituto;
    }

    public Double getIcmsValor() {
        return icmsValor;
    }

    public void setIcmsValor(Double icmsValor) {
        this.icmsValor = icmsValor;
    }

    public Double getIcmsValorMono() {
        return icmsValorMono;
    }

    public void setIcmsValorMono(Double icmsValorMono) {
        this.icmsValorMono = icmsValorMono;
    }

    public Double getIcmsValorMonoRetencao() {
        return icmsValorMonoRetencao;
    }

    public void setIcmsValorMonoRetencao(Double icmsValorMonoRetencao) {
        this.icmsValorMonoRetencao = icmsValorMonoRetencao;
    }

    public Double getIcmsValorRetidoSt() {
        return icmsValorRetidoSt;
    }

    public void setIcmsValorRetidoSt(Double icmsValorRetidoSt) {
        this.icmsValorRetidoSt = icmsValorRetidoSt;
    }

    public Double getIcmsValorDesonerado() {
        return icmsValorDesonerado;
    }

    public void setIcmsValorDesonerado(Double icmsValorDesonerado) {
        this.icmsValorDesonerado = icmsValorDesonerado;
    }

    public Double getIcmsValorOperacao() {
        return icmsValorOperacao;
    }

    public void setIcmsValorOperacao(Double icmsValorOperacao) {
        this.icmsValorOperacao = icmsValorOperacao;
    }

    public Double getIcmsValorMonoOperacao() {
        return icmsValorMonoOperacao;
    }

    public void setIcmsValorMonoOperacao(Double icmsValorMonoOperacao) {
        this.icmsValorMonoOperacao = icmsValorMonoOperacao;
    }

    public Double getIcmsPercentualDiferimento() {
        return icmsPercentualDiferimento;
    }

    public void setIcmsPercentualDiferimento(Double icmsPercentualDiferimento) {
        this.icmsPercentualDiferimento = icmsPercentualDiferimento;
    }

    public Double getIcmsPercentualReducao() {
        return icmsPercentualReducao;
    }

    public void setIcmsPercentualReducao(Double icmsPercentualReducao) {
        this.icmsPercentualReducao = icmsPercentualReducao;
    }

    public Double getIcmsValorDiferido() {
        return icmsValorDiferido;
    }

    public void setIcmsValorDiferido(Double icmsValorDiferido) {
        this.icmsValorDiferido = icmsValorDiferido;
    }

    public Double getIcmsValorMonoDiferido() {
        return icmsValorMonoDiferido;
    }

    public void setIcmsValorMonoDiferido(Double icmsValorMonoDiferido) {
        this.icmsValorMonoDiferido = icmsValorMonoDiferido;
    }

    public String getIcmsMotivoDesoneracao() {
        return icmsMotivoDesoneracao;
    }

    public void setIcmsMotivoDesoneracao(String icmsMotivoDesoneracao) {
        this.icmsMotivoDesoneracao = icmsMotivoDesoneracao;
    }

    public Integer getIcmsDeducaoDesoneracao() {
        return icmsDeducaoDesoneracao;
    }

    public void setIcmsDeducaoDesoneracao(Integer icmsDeducaoDesoneracao) {
        this.icmsDeducaoDesoneracao = icmsDeducaoDesoneracao;
    }

    public String getIcmsMotivoReducao() {
        return icmsMotivoReducao;
    }

    public void setIcmsMotivoReducao(String icmsMotivoReducao) {
        this.icmsMotivoReducao = icmsMotivoReducao;
    }

    public Double getIcmsValorIcmsStDesonerado() {
        return icmsValorIcmsStDesonerado;
    }

    public void setIcmsValorIcmsStDesonerado(Double icmsValorIcmsStDesonerado) {
        this.icmsValorIcmsStDesonerado = icmsValorIcmsStDesonerado;
    }

    public String getIcmsMotivoDesoneracaoIcmsSt() {
        return icmsMotivoDesoneracaoIcmsSt;
    }

    public void setIcmsMotivoDesoneracaoIcmsSt(String icmsMotivoDesoneracaoIcmsSt) {
        this.icmsMotivoDesoneracaoIcmsSt = icmsMotivoDesoneracaoIcmsSt;
    }

    public Integer getIcmsModalidadeBaseCalculoSt() {
        return icmsModalidadeBaseCalculoSt;
    }

    public void setIcmsModalidadeBaseCalculoSt(Integer icmsModalidadeBaseCalculoSt) {
        this.icmsModalidadeBaseCalculoSt = icmsModalidadeBaseCalculoSt;
    }

    public Double getIcmsMargemValorAdicionadoSt() {
        return icmsMargemValorAdicionadoSt;
    }

    public void setIcmsMargemValorAdicionadoSt(Double icmsMargemValorAdicionadoSt) {
        this.icmsMargemValorAdicionadoSt = icmsMargemValorAdicionadoSt;
    }

    public Double getIcmsReducaoBaseCalculoSt() {
        return icmsReducaoBaseCalculoSt;
    }

    public void setIcmsReducaoBaseCalculoSt(Double icmsReducaoBaseCalculoSt) {
        this.icmsReducaoBaseCalculoSt = icmsReducaoBaseCalculoSt;
    }

    public Double getIcmsBaseCalculoSt() {
        return icmsBaseCalculoSt;
    }

    public void setIcmsBaseCalculoSt(Double icmsBaseCalculoSt) {
        this.icmsBaseCalculoSt = icmsBaseCalculoSt;
    }

    public Double getIcmsAliquotaRetido() {
        return icmsAliquotaRetido;
    }

    public void setIcmsAliquotaRetido(Double icmsAliquotaRetido) {
        this.icmsAliquotaRetido = icmsAliquotaRetido;
    }

    public Double getIcmsAliquotaSt() {
        return icmsAliquotaSt;
    }

    public void setIcmsAliquotaSt(Double icmsAliquotaSt) {
        this.icmsAliquotaSt = icmsAliquotaSt;
    }

    public Double getIcmsValorMonoRetido() {
        return icmsValorMonoRetido;
    }

    public void setIcmsValorMonoRetido(Double icmsValorMonoRetido) {
        this.icmsValorMonoRetido = icmsValorMonoRetido;
    }

    public Double getIcmsValorSt() {
        return icmsValorSt;
    }

    public void setIcmsValorSt(Double icmsValorSt) {
        this.icmsValorSt = icmsValorSt;
    }

    public Double getIcmsBaseCalculoOperacaoPropria() {
        return icmsBaseCalculoOperacaoPropria;
    }

    public void setIcmsBaseCalculoOperacaoPropria(Double icmsBaseCalculoOperacaoPropria) {
        this.icmsBaseCalculoOperacaoPropria = icmsBaseCalculoOperacaoPropria;
    }

    public String getIcmsUfSt() {
        return icmsUfSt;
    }

    public void setIcmsUfSt(String icmsUfSt) {
        this.icmsUfSt = icmsUfSt;
    }

    public Double getIcmsBaseCalculoMonoRetido() {
        return icmsBaseCalculoMonoRetido;
    }

    public void setIcmsBaseCalculoMonoRetido(Double icmsBaseCalculoMonoRetido) {
        this.icmsBaseCalculoMonoRetido = icmsBaseCalculoMonoRetido;
    }

    public Double getIcmsBaseCalculoRetidoRemetente() {
        return icmsBaseCalculoRetidoRemetente;
    }

    public void setIcmsBaseCalculoRetidoRemetente(Double icmsBaseCalculoRetidoRemetente) {
        this.icmsBaseCalculoRetidoRemetente = icmsBaseCalculoRetidoRemetente;
    }

    public Double getIcmsValorRetidoRemetente() {
        return icmsValorRetidoRemetente;
    }

    public void setIcmsValorRetidoRemetente(Double icmsValorRetidoRemetente) {
        this.icmsValorRetidoRemetente = icmsValorRetidoRemetente;
    }

    public Double getIcmsBaseCalculoDestino() {
        return icmsBaseCalculoDestino;
    }

    public void setIcmsBaseCalculoDestino(Double icmsBaseCalculoDestino) {
        this.icmsBaseCalculoDestino = icmsBaseCalculoDestino;
    }

    public Double getIcmsValorDestino() {
        return icmsValorDestino;
    }

    public void setIcmsValorDestino(Double icmsValorDestino) {
        this.icmsValorDestino = icmsValorDestino;
    }

    public Double getIcmsAliquotaCreditoSimples() {
        return icmsAliquotaCreditoSimples;
    }

    public void setIcmsAliquotaCreditoSimples(Double icmsAliquotaCreditoSimples) {
        this.icmsAliquotaCreditoSimples = icmsAliquotaCreditoSimples;
    }

    public Double getIcmsValorCreditoSimples() {
        return icmsValorCreditoSimples;
    }

    public void setIcmsValorCreditoSimples(Double icmsValorCreditoSimples) {
        this.icmsValorCreditoSimples = icmsValorCreditoSimples;
    }

    public Double getIcmsReducaoBaseCalculoEfetiva() {
        return icmsReducaoBaseCalculoEfetiva;
    }

    public void setIcmsReducaoBaseCalculoEfetiva(Double icmsReducaoBaseCalculoEfetiva) {
        this.icmsReducaoBaseCalculoEfetiva = icmsReducaoBaseCalculoEfetiva;
    }

    public Double getIcmsBaseCalculoEfetiva() {
        return icmsBaseCalculoEfetiva;
    }

    public void setIcmsBaseCalculoEfetiva(Double icmsBaseCalculoEfetiva) {
        this.icmsBaseCalculoEfetiva = icmsBaseCalculoEfetiva;
    }

    public Double getIcmsAliquotaEfetiva() {
        return icmsAliquotaEfetiva;
    }

    public void setIcmsAliquotaEfetiva(Double icmsAliquotaEfetiva) {
        this.icmsAliquotaEfetiva = icmsAliquotaEfetiva;
    }

    public Double getIcmsValorEfetivo() {
        return icmsValorEfetivo;
    }

    public void setIcmsValorEfetivo(Double icmsValorEfetivo) {
        this.icmsValorEfetivo = icmsValorEfetivo;
    }

    public Double getFcpPercentual() {
        return fcpPercentual;
    }

    public void setFcpPercentual(Double fcpPercentual) {
        this.fcpPercentual = fcpPercentual;
    }

    public Double getFcpBaseCalculo() {
        return fcpBaseCalculo;
    }

    public void setFcpBaseCalculo(Double fcpBaseCalculo) {
        this.fcpBaseCalculo = fcpBaseCalculo;
    }

    public Double getFcpValor() {
        return fcpValor;
    }

    public void setFcpValor(Double fcpValor) {
        this.fcpValor = fcpValor;
    }

    public Double getFcpPercentualSt() {
        return fcpPercentualSt;
    }

    public void setFcpPercentualSt(Double fcpPercentualSt) {
        this.fcpPercentualSt = fcpPercentualSt;
    }

    public Double getFcpBaseCalculoSt() {
        return fcpBaseCalculoSt;
    }

    public void setFcpBaseCalculoSt(Double fcpBaseCalculoSt) {
        this.fcpBaseCalculoSt = fcpBaseCalculoSt;
    }

    public Double getFcpValorSt() {
        return fcpValorSt;
    }

    public void setFcpValorSt(Double fcpValorSt) {
        this.fcpValorSt = fcpValorSt;
    }

    public Double getFcpPercentualRetidoSt() {
        return fcpPercentualRetidoSt;
    }

    public void setFcpPercentualRetidoSt(Double fcpPercentualRetidoSt) {
        this.fcpPercentualRetidoSt = fcpPercentualRetidoSt;
    }

    public Double getFcpBaseCalculoRetidoSt() {
        return fcpBaseCalculoRetidoSt;
    }

    public void setFcpBaseCalculoRetidoSt(Double fcpBaseCalculoRetidoSt) {
        this.fcpBaseCalculoRetidoSt = fcpBaseCalculoRetidoSt;
    }

    public Double getFcpValorRetidoSt() {
        return fcpValorRetidoSt;
    }

    public void setFcpValorRetidoSt(Double fcpValorRetidoSt) {
        this.fcpValorRetidoSt = fcpValorRetidoSt;
    }

    public Double getIcmsFcpPercentualDiferimento() {
        return icmsFcpPercentualDiferimento;
    }

    public void setIcmsFcpPercentualDiferimento(Double icmsFcpPercentualDiferimento) {
        this.icmsFcpPercentualDiferimento = icmsFcpPercentualDiferimento;
    }

    public Double getIcmsFcpValorDiferido() {
        return icmsFcpValorDiferido;
    }

    public void setIcmsFcpValorDiferido(Double icmsFcpValorDiferido) {
        this.icmsFcpValorDiferido = icmsFcpValorDiferido;
    }

    public Double getIcmsFcpValorEfetivo() {
        return icmsFcpValorEfetivo;
    }

    public void setIcmsFcpValorEfetivo(Double icmsFcpValorEfetivo) {
        this.icmsFcpValorEfetivo = icmsFcpValorEfetivo;
    }

    public Double getIcmsBaseCalculoUfDestino() {
        return icmsBaseCalculoUfDestino;
    }

    public void setIcmsBaseCalculoUfDestino(Double icmsBaseCalculoUfDestino) {
        this.icmsBaseCalculoUfDestino = icmsBaseCalculoUfDestino;
    }

    public Double getFcpBaseCalculoUfDestino() {
        return fcpBaseCalculoUfDestino;
    }

    public void setFcpBaseCalculoUfDestino(Double fcpBaseCalculoUfDestino) {
        this.fcpBaseCalculoUfDestino = fcpBaseCalculoUfDestino;
    }

    public Double getFcpPercentualUfDestino() {
        return fcpPercentualUfDestino;
    }

    public void setFcpPercentualUfDestino(Double fcpPercentualUfDestino) {
        this.fcpPercentualUfDestino = fcpPercentualUfDestino;
    }

    public Double getIcmsAliquotaInternaUfDestino() {
        return icmsAliquotaInternaUfDestino;
    }

    public void setIcmsAliquotaInternaUfDestino(Double icmsAliquotaInternaUfDestino) {
        this.icmsAliquotaInternaUfDestino = icmsAliquotaInternaUfDestino;
    }

    public Double getIcmsAliquotaInterestadual() {
        return icmsAliquotaInterestadual;
    }

    public void setIcmsAliquotaInterestadual(Double icmsAliquotaInterestadual) {
        this.icmsAliquotaInterestadual = icmsAliquotaInterestadual;
    }

    public Double getIcmsPercentualPartilha() {
        return icmsPercentualPartilha;
    }

    public void setIcmsPercentualPartilha(Double icmsPercentualPartilha) {
        this.icmsPercentualPartilha = icmsPercentualPartilha;
    }

    public Double getFcpValorUfDestino() {
        return fcpValorUfDestino;
    }

    public void setFcpValorUfDestino(Double fcpValorUfDestino) {
        this.fcpValorUfDestino = fcpValorUfDestino;
    }

    public Double getIcmsValorUfDestino() {
        return icmsValorUfDestino;
    }

    public void setIcmsValorUfDestino(Double icmsValorUfDestino) {
        this.icmsValorUfDestino = icmsValorUfDestino;
    }

    public Double getIcmsValorUfRemetente() {
        return icmsValorUfRemetente;
    }

    public void setIcmsValorUfRemetente(Double icmsValorUfRemetente) {
        this.icmsValorUfRemetente = icmsValorUfRemetente;
    }

    public String getIpiSituacaoTributaria() {
        return ipiSituacaoTributaria;
    }

    public void setIpiSituacaoTributaria(String ipiSituacaoTributaria) {
        this.ipiSituacaoTributaria = ipiSituacaoTributaria;
    }

    public Double getIpiBaseCalculo() {
        return ipiBaseCalculo;
    }

    public void setIpiBaseCalculo(Double ipiBaseCalculo) {
        this.ipiBaseCalculo = ipiBaseCalculo;
    }

    public Double getIpiAliquota() {
        return ipiAliquota;
    }

    public void setIpiAliquota(Double ipiAliquota) {
        this.ipiAliquota = ipiAliquota;
    }

    public Double getIpiQuantidadeTotal() {
        return ipiQuantidadeTotal;
    }

    public void setIpiQuantidadeTotal(Double ipiQuantidadeTotal) {
        this.ipiQuantidadeTotal = ipiQuantidadeTotal;
    }

    public Double getIpiValorPorUnidadeTributavel() {
        return ipiValorPorUnidadeTributavel;
    }

    public void setIpiValorPorUnidadeTributavel(Double ipiValorPorUnidadeTributavel) {
        this.ipiValorPorUnidadeTributavel = ipiValorPorUnidadeTributavel;
    }

    public Double getIpiValor() {
        return ipiValor;
    }

    public void setIpiValor(Double ipiValor) {
        this.ipiValor = ipiValor;
    }

    public String getIpiCnpjProdutor() {
        return ipiCnpjProdutor;
    }

    public void setIpiCnpjProdutor(String ipiCnpjProdutor) {
        this.ipiCnpjProdutor = ipiCnpjProdutor;
    }

    public String getIpiCodigoSeloControle() {
        return ipiCodigoSeloControle;
    }

    public void setIpiCodigoSeloControle(String ipiCodigoSeloControle) {
        this.ipiCodigoSeloControle = ipiCodigoSeloControle;
    }

    public Integer getIpiQuantidadeSeloControle() {
        return ipiQuantidadeSeloControle;
    }

    public void setIpiQuantidadeSeloControle(Integer ipiQuantidadeSeloControle) {
        this.ipiQuantidadeSeloControle = ipiQuantidadeSeloControle;
    }

    public Integer getIpiCodigoEnquadramentoLegal() {
        return ipiCodigoEnquadramentoLegal;
    }

    public void setIpiCodigoEnquadramentoLegal(Integer ipiCodigoEnquadramentoLegal) {
        this.ipiCodigoEnquadramentoLegal = ipiCodigoEnquadramentoLegal;
    }

    public Double getIiBaseCalculo() {
        return iiBaseCalculo;
    }

    public void setIiBaseCalculo(Double iiBaseCalculo) {
        this.iiBaseCalculo = iiBaseCalculo;
    }

    public Double getIiDespesasAduaneiras() {
        return iiDespesasAduaneiras;
    }

    public void setIiDespesasAduaneiras(Double iiDespesasAduaneiras) {
        this.iiDespesasAduaneiras = iiDespesasAduaneiras;
    }

    public Double getIiValor() {
        return iiValor;
    }

    public void setIiValor(Double iiValor) {
        this.iiValor = iiValor;
    }

    public Double getIiValorIof() {
        return iiValorIof;
    }

    public void setIiValorIof(Double iiValorIof) {
        this.iiValorIof = iiValorIof;
    }

    public Double getIssqnBaseCalculo() {
        return issqnBaseCalculo;
    }

    public void setIssqnBaseCalculo(Double issqnBaseCalculo) {
        this.issqnBaseCalculo = issqnBaseCalculo;
    }

    public Double getIssqnAliquota() {
        return issqnAliquota;
    }

    public void setIssqnAliquota(Double issqnAliquota) {
        this.issqnAliquota = issqnAliquota;
    }

    public Double getIssqnValor() {
        return issqnValor;
    }

    public void setIssqnValor(Double issqnValor) {
        this.issqnValor = issqnValor;
    }

    public Integer getIssqnCodigoMunicipio() {
        return issqnCodigoMunicipio;
    }

    public void setIssqnCodigoMunicipio(Integer issqnCodigoMunicipio) {
        this.issqnCodigoMunicipio = issqnCodigoMunicipio;
    }

    public String getIssqnItemListaServico() {
        return issqnItemListaServico;
    }

    public void setIssqnItemListaServico(String issqnItemListaServico) {
        this.issqnItemListaServico = issqnItemListaServico;
    }

    public Double getIssqnValorDeducao() {
        return issqnValorDeducao;
    }

    public void setIssqnValorDeducao(Double issqnValorDeducao) {
        this.issqnValorDeducao = issqnValorDeducao;
    }

    public Double getIssqnValorOutrasRetencoes() {
        return issqnValorOutrasRetencoes;
    }

    public void setIssqnValorOutrasRetencoes(Double issqnValorOutrasRetencoes) {
        this.issqnValorOutrasRetencoes = issqnValorOutrasRetencoes;
    }

    public Double getIssqnValorDescontoIncondicionado() {
        return issqnValorDescontoIncondicionado;
    }

    public void setIssqnValorDescontoIncondicionado(Double issqnValorDescontoIncondicionado) {
        this.issqnValorDescontoIncondicionado = issqnValorDescontoIncondicionado;
    }

    public Double getIssqnValorDescontoCondicionado() {
        return issqnValorDescontoCondicionado;
    }

    public void setIssqnValorDescontoCondicionado(Double issqnValorDescontoCondicionado) {
        this.issqnValorDescontoCondicionado = issqnValorDescontoCondicionado;
    }

    public Double getIssqnValorRetencao() {
        return issqnValorRetencao;
    }

    public void setIssqnValorRetencao(Double issqnValorRetencao) {
        this.issqnValorRetencao = issqnValorRetencao;
    }

    public Integer getIssqnIndicadorExigibilidade() {
        return issqnIndicadorExigibilidade;
    }

    public void setIssqnIndicadorExigibilidade(Integer issqnIndicadorExigibilidade) {
        this.issqnIndicadorExigibilidade = issqnIndicadorExigibilidade;
    }

    public String getIssqnCodigoServico() {
        return issqnCodigoServico;
    }

    public void setIssqnCodigoServico(String issqnCodigoServico) {
        this.issqnCodigoServico = issqnCodigoServico;
    }

    public Integer getIssqnCodigoMunicipioIncidencia() {
        return issqnCodigoMunicipioIncidencia;
    }

    public void setIssqnCodigoMunicipioIncidencia(Integer issqnCodigoMunicipioIncidencia) {
        this.issqnCodigoMunicipioIncidencia = issqnCodigoMunicipioIncidencia;
    }

    public Integer getIssqnCodigoPais() {
        return issqnCodigoPais;
    }

    public void setIssqnCodigoPais(Integer issqnCodigoPais) {
        this.issqnCodigoPais = issqnCodigoPais;
    }

    public String getIssqnNumeroProcesso() {
        return issqnNumeroProcesso;
    }

    public void setIssqnNumeroProcesso(String issqnNumeroProcesso) {
        this.issqnNumeroProcesso = issqnNumeroProcesso;
    }

    public Integer getIssqnIndicadorIncentivo() {
        return issqnIndicadorIncentivo;
    }

    public void setIssqnIndicadorIncentivo(Integer issqnIndicadorIncentivo) {
        this.issqnIndicadorIncentivo = issqnIndicadorIncentivo;
    }

    public String getPisSituacaoTributaria() {
        return pisSituacaoTributaria;
    }

    public void setPisSituacaoTributaria(String pisSituacaoTributaria) {
        this.pisSituacaoTributaria = pisSituacaoTributaria;
    }

    public Double getPisBaseCalculo() {
        return pisBaseCalculo;
    }

    public void setPisBaseCalculo(Double pisBaseCalculo) {
        this.pisBaseCalculo = pisBaseCalculo;
    }

    public Double getPisAliquotaPorcentual() {
        return pisAliquotaPorcentual;
    }

    public void setPisAliquotaPorcentual(Double pisAliquotaPorcentual) {
        this.pisAliquotaPorcentual = pisAliquotaPorcentual;
    }

    public Double getPisQuantidadeVendida() {
        return pisQuantidadeVendida;
    }

    public void setPisQuantidadeVendida(Double pisQuantidadeVendida) {
        this.pisQuantidadeVendida = pisQuantidadeVendida;
    }

    public Double getPisAliquotaValor() {
        return pisAliquotaValor;
    }

    public void setPisAliquotaValor(Double pisAliquotaValor) {
        this.pisAliquotaValor = pisAliquotaValor;
    }

    public Double getPisValor() {
        return pisValor;
    }

    public void setPisValor(Double pisValor) {
        this.pisValor = pisValor;
    }

    public Double getPisBaseCalculoSt() {
        return pisBaseCalculoSt;
    }

    public void setPisBaseCalculoSt(Double pisBaseCalculoSt) {
        this.pisBaseCalculoSt = pisBaseCalculoSt;
    }

    public Double getPisAliquotaPorcentualSt() {
        return pisAliquotaPorcentualSt;
    }

    public void setPisAliquotaPorcentualSt(Double pisAliquotaPorcentualSt) {
        this.pisAliquotaPorcentualSt = pisAliquotaPorcentualSt;
    }

    public Double getPisQuantidadeVendidaSt() {
        return pisQuantidadeVendidaSt;
    }

    public void setPisQuantidadeVendidaSt(Double pisQuantidadeVendidaSt) {
        this.pisQuantidadeVendidaSt = pisQuantidadeVendidaSt;
    }

    public Double getPisAliquotaValorSt() {
        return pisAliquotaValorSt;
    }

    public void setPisAliquotaValorSt(Double pisAliquotaValorSt) {
        this.pisAliquotaValorSt = pisAliquotaValorSt;
    }

    public Double getPisValorSt() {
        return pisValorSt;
    }

    public void setPisValorSt(Double pisValorSt) {
        this.pisValorSt = pisValorSt;
    }

    public Integer getIncluiPisStNoTotal() {
        return incluiPisStNoTotal;
    }

    public void setIncluiPisStNoTotal(Integer incluiPisStNoTotal) {
        this.incluiPisStNoTotal = incluiPisStNoTotal;
    }

    public String getCofinsSituacaoTributaria() {
        return cofinsSituacaoTributaria;
    }

    public void setCofinsSituacaoTributaria(String cofinsSituacaoTributaria) {
        this.cofinsSituacaoTributaria = cofinsSituacaoTributaria;
    }

    public Double getCofinsBaseCalculo() {
        return cofinsBaseCalculo;
    }

    public void setCofinsBaseCalculo(Double cofinsBaseCalculo) {
        this.cofinsBaseCalculo = cofinsBaseCalculo;
    }

    public Double getCofinsAliquotaPorcentual() {
        return cofinsAliquotaPorcentual;
    }

    public void setCofinsAliquotaPorcentual(Double cofinsAliquotaPorcentual) {
        this.cofinsAliquotaPorcentual = cofinsAliquotaPorcentual;
    }

    public Double getCofinsQuantidadeVendida() {
        return cofinsQuantidadeVendida;
    }

    public void setCofinsQuantidadeVendida(Double cofinsQuantidadeVendida) {
        this.cofinsQuantidadeVendida = cofinsQuantidadeVendida;
    }

    public Double getCofinsAliquotaValor() {
        return cofinsAliquotaValor;
    }

    public void setCofinsAliquotaValor(Double cofinsAliquotaValor) {
        this.cofinsAliquotaValor = cofinsAliquotaValor;
    }

    public Double getCofinsValor() {
        return cofinsValor;
    }

    public void setCofinsValor(Double cofinsValor) {
        this.cofinsValor = cofinsValor;
    }

    public Double getCofinsBaseCalculoSt() {
        return cofinsBaseCalculoSt;
    }

    public void setCofinsBaseCalculoSt(Double cofinsBaseCalculoSt) {
        this.cofinsBaseCalculoSt = cofinsBaseCalculoSt;
    }

    public Double getCofinsAliquotaPorcentualSt() {
        return cofinsAliquotaPorcentualSt;
    }

    public void setCofinsAliquotaPorcentualSt(Double cofinsAliquotaPorcentualSt) {
        this.cofinsAliquotaPorcentualSt = cofinsAliquotaPorcentualSt;
    }

    public Double getCofinsQuantidadeVendidaSt() {
        return cofinsQuantidadeVendidaSt;
    }

    public void setCofinsQuantidadeVendidaSt(Double cofinsQuantidadeVendidaSt) {
        this.cofinsQuantidadeVendidaSt = cofinsQuantidadeVendidaSt;
    }

    public Double getCofinsAliquotaValorSt() {
        return cofinsAliquotaValorSt;
    }

    public void setCofinsAliquotaValorSt(Double cofinsAliquotaValorSt) {
        this.cofinsAliquotaValorSt = cofinsAliquotaValorSt;
    }

    public Double getCofinsValorSt() {
        return cofinsValorSt;
    }

    public void setCofinsValorSt(Double cofinsValorSt) {
        this.cofinsValorSt = cofinsValorSt;
    }

    public Integer getIncluiCofinsStNoTotal() {
        return incluiCofinsStNoTotal;
    }

    public void setIncluiCofinsStNoTotal(Integer incluiCofinsStNoTotal) {
        this.incluiCofinsStNoTotal = incluiCofinsStNoTotal;
    }

    public String getIsSituacaoTributaria() {
        return isSituacaoTributaria;
    }

    public void setIsSituacaoTributaria(String isSituacaoTributaria) {
        this.isSituacaoTributaria = isSituacaoTributaria;
    }

    public String getIsClassificacaoTributaria() {
        return isClassificacaoTributaria;
    }

    public void setIsClassificacaoTributaria(String isClassificacaoTributaria) {
        this.isClassificacaoTributaria = isClassificacaoTributaria;
    }

    public Double getIsBaseCalculo() {
        return isBaseCalculo;
    }

    public void setIsBaseCalculo(Double isBaseCalculo) {
        this.isBaseCalculo = isBaseCalculo;
    }

    public Double getIsAliquota() {
        return isAliquota;
    }

    public void setIsAliquota(Double isAliquota) {
        this.isAliquota = isAliquota;
    }

    public Double getIsAliquotaEspecifica() {
        return isAliquotaEspecifica;
    }

    public void setIsAliquotaEspecifica(Double isAliquotaEspecifica) {
        this.isAliquotaEspecifica = isAliquotaEspecifica;
    }

    public String getIsUnidadeTributavel() {
        return isUnidadeTributavel;
    }

    public void setIsUnidadeTributavel(String isUnidadeTributavel) {
        this.isUnidadeTributavel = isUnidadeTributavel;
    }

    public Double getIsValor() {
        return isValor;
    }

    public void setIsValor(Double isValor) {
        this.isValor = isValor;
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

    public Double getIbsUfPercentualDiferimento() {
        return ibsUfPercentualDiferimento;
    }

    public void setIbsUfPercentualDiferimento(Double ibsUfPercentualDiferimento) {
        this.ibsUfPercentualDiferimento = ibsUfPercentualDiferimento;
    }

    public Double getIbsUfValorDiferido() {
        return ibsUfValorDiferido;
    }

    public void setIbsUfValorDiferido(Double ibsUfValorDiferido) {
        this.ibsUfValorDiferido = ibsUfValorDiferido;
    }

    public Double getIbsUfValorTributoDevolvido() {
        return ibsUfValorTributoDevolvido;
    }

    public void setIbsUfValorTributoDevolvido(Double ibsUfValorTributoDevolvido) {
        this.ibsUfValorTributoDevolvido = ibsUfValorTributoDevolvido;
    }

    public Double getIbsUfPercentualReducaoAliquota() {
        return ibsUfPercentualReducaoAliquota;
    }

    public void setIbsUfPercentualReducaoAliquota(Double ibsUfPercentualReducaoAliquota) {
        this.ibsUfPercentualReducaoAliquota = ibsUfPercentualReducaoAliquota;
    }

    public Double getIbsUfAliquotaEfetiva() {
        return ibsUfAliquotaEfetiva;
    }

    public void setIbsUfAliquotaEfetiva(Double ibsUfAliquotaEfetiva) {
        this.ibsUfAliquotaEfetiva = ibsUfAliquotaEfetiva;
    }

    public Double getIbsUfValor() {
        return ibsUfValor;
    }

    public void setIbsUfValor(Double ibsUfValor) {
        this.ibsUfValor = ibsUfValor;
    }

    public Double getIbsMunAliquota() {
        return ibsMunAliquota;
    }

    public void setIbsMunAliquota(Double ibsMunAliquota) {
        this.ibsMunAliquota = ibsMunAliquota;
    }

    public Double getIbsMunPercentualDiferimento() {
        return ibsMunPercentualDiferimento;
    }

    public void setIbsMunPercentualDiferimento(Double ibsMunPercentualDiferimento) {
        this.ibsMunPercentualDiferimento = ibsMunPercentualDiferimento;
    }

    public Double getIbsMunValorDiferido() {
        return ibsMunValorDiferido;
    }

    public void setIbsMunValorDiferido(Double ibsMunValorDiferido) {
        this.ibsMunValorDiferido = ibsMunValorDiferido;
    }

    public Double getIbsMunValorTributoDevolvido() {
        return ibsMunValorTributoDevolvido;
    }

    public void setIbsMunValorTributoDevolvido(Double ibsMunValorTributoDevolvido) {
        this.ibsMunValorTributoDevolvido = ibsMunValorTributoDevolvido;
    }

    public Double getIbsMunPercentualReducaoAliquota() {
        return ibsMunPercentualReducaoAliquota;
    }

    public void setIbsMunPercentualReducaoAliquota(Double ibsMunPercentualReducaoAliquota) {
        this.ibsMunPercentualReducaoAliquota = ibsMunPercentualReducaoAliquota;
    }

    public Double getIbsMunAliquotaEfetiva() {
        return ibsMunAliquotaEfetiva;
    }

    public void setIbsMunAliquotaEfetiva(Double ibsMunAliquotaEfetiva) {
        this.ibsMunAliquotaEfetiva = ibsMunAliquotaEfetiva;
    }

    public Double getIbsMunValor() {
        return ibsMunValor;
    }

    public void setIbsMunValor(Double ibsMunValor) {
        this.ibsMunValor = ibsMunValor;
    }

    public Double getIbsValorTotal() {
        return ibsValorTotal;
    }

    public void setIbsValorTotal(Double ibsValorTotal) {
        this.ibsValorTotal = ibsValorTotal;
    }

    public Double getCbsAliquota() {
        return cbsAliquota;
    }

    public void setCbsAliquota(Double cbsAliquota) {
        this.cbsAliquota = cbsAliquota;
    }

    public Double getCbsPercentualDiferimento() {
        return cbsPercentualDiferimento;
    }

    public void setCbsPercentualDiferimento(Double cbsPercentualDiferimento) {
        this.cbsPercentualDiferimento = cbsPercentualDiferimento;
    }

    public Double getCbsValorDiferido() {
        return cbsValorDiferido;
    }

    public void setCbsValorDiferido(Double cbsValorDiferido) {
        this.cbsValorDiferido = cbsValorDiferido;
    }

    public Double getCbsValorTributoDevolvido() {
        return cbsValorTributoDevolvido;
    }

    public void setCbsValorTributoDevolvido(Double cbsValorTributoDevolvido) {
        this.cbsValorTributoDevolvido = cbsValorTributoDevolvido;
    }

    public Double getCbsPercentualReducaoAliquota() {
        return cbsPercentualReducaoAliquota;
    }

    public void setCbsPercentualReducaoAliquota(Double cbsPercentualReducaoAliquota) {
        this.cbsPercentualReducaoAliquota = cbsPercentualReducaoAliquota;
    }

    public Double getCbsAliquotaEfetiva() {
        return cbsAliquotaEfetiva;
    }

    public void setCbsAliquotaEfetiva(Double cbsAliquotaEfetiva) {
        this.cbsAliquotaEfetiva = cbsAliquotaEfetiva;
    }

    public Double getCbsValor() {
        return cbsValor;
    }

    public void setCbsValor(Double cbsValor) {
        this.cbsValor = cbsValor;
    }

    public Double getIbsCbsValorTotal() {
        return ibsCbsValorTotal;
    }

    public void setIbsCbsValorTotal(Double ibsCbsValorTotal) {
        this.ibsCbsValorTotal = ibsCbsValorTotal;
    }

    public Double getPercentualDevolvido() {
        return percentualDevolvido;
    }

    public void setPercentualDevolvido(Double percentualDevolvido) {
        this.percentualDevolvido = percentualDevolvido;
    }

    public Double getValorIpiDevolvido() {
        return valorIpiDevolvido;
    }

    public void setValorIpiDevolvido(Double valorIpiDevolvido) {
        this.valorIpiDevolvido = valorIpiDevolvido;
    }

    public String getInformacoesAdicionaisItem() {
        return informacoesAdicionaisItem;
    }

    public void setInformacoesAdicionaisItem(String informacoesAdicionaisItem) {
        this.informacoesAdicionaisItem = informacoesAdicionaisItem;
    }

    public List<ObservacaoContribuinte> getObservacoesContribuinte() {
        return observacoesContribuinte;
    }

    public void setObservacoesContribuinte(List<ObservacaoContribuinte> observacoesContribuinte) {
        this.observacoesContribuinte = observacoesContribuinte;
    }

    public Double getValorTotalItem() {
        return valorTotalItem;
    }

    public void setValorTotalItem(Double valorTotalItem) {
        this.valorTotalItem = valorTotalItem;
    }

    public String getChaveAcessoDfeReferenciado() {
        return chaveAcessoDfeReferenciado;
    }

    public void setChaveAcessoDfeReferenciado(String chaveAcessoDfeReferenciado) {
        this.chaveAcessoDfeReferenciado = chaveAcessoDfeReferenciado;
    }

    public String getNumeroItemDfeReferenciado() {
        return numeroItemDfeReferenciado;
    }

    public void setNumeroItemDfeReferenciado(String numeroItemDfeReferenciado) {
        this.numeroItemDfeReferenciado = numeroItemDfeReferenciado;
    }

    public Integer getCreditoPresumidoZfmClassificacao() {
        return creditoPresumidoZfmClassificacao;
    }

    public void setCreditoPresumidoZfmClassificacao(Integer creditoPresumidoZfmClassificacao) {
        this.creditoPresumidoZfmClassificacao = creditoPresumidoZfmClassificacao;
    }

    public Double getCreditoPresumidoZfmValor() {
        return creditoPresumidoZfmValor;
    }

    public void setCreditoPresumidoZfmValor(Double creditoPresumidoZfmValor) {
        this.creditoPresumidoZfmValor = creditoPresumidoZfmValor;
    }
}
