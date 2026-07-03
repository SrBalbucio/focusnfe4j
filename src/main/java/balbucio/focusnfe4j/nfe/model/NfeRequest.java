package balbucio.focusnfe4j.nfe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NfeRequest {

    @JsonProperty("natureza_operacao")
    private String naturezaOperacao;

    @JsonProperty("serie")
    private Integer serie;

    @JsonProperty("numero")
    private Integer numero;

    @JsonProperty("data_emissao")
    private String dataEmissao;

    @JsonProperty("data_entrada_saida")
    private String dataEntradaSaida;

    @JsonProperty("data_previsao_entrega_bem")
    private String dataPrevisaoEntregaBem;

    @JsonProperty("tipo_documento")
    private Integer tipoDocumento;

    @JsonProperty("local_destino")
    private Integer localDestino;

    @JsonProperty("municipio")
    private Integer municipio;

    @JsonProperty("ibs_cbs_municipio")
    private Integer ibsCbsMunicipio;

    @JsonProperty("finalidade_emissao")
    private Integer finalidadeEmissao;

    @JsonProperty("tipo_nota_debito")
    private String tipoNotaDebito;

    @JsonProperty("tipo_nota_credito")
    private String tipoNotaCredito;

    @JsonProperty("consumidor_final")
    private Integer consumidorFinal;

    @JsonProperty("presenca_comprador")
    private Integer presencaComprador;

    @JsonProperty("indicador_intermediario")
    private Integer indicadorIntermediario;

    @JsonProperty("notas_referenciadas")
    private List<NotaReferenciada> notasReferenciadas;

    @JsonProperty("chaves_nfe_antecipacao_pagamento")
    private List<String> chavesNfeAntecipacaoPagamento;

    @JsonProperty("cnpj_emitente")
    private String cnpjEmitente;

    @JsonProperty("cpf_emitente")
    private String cpfEmitente;

    @JsonProperty("nome_emitente")
    private String nomeEmitente;

    @JsonProperty("nome_fantasia_emitente")
    private String nomeFantasiaEmitente;

    @JsonProperty("logradouro_emitente")
    private String logradouroEmitente;

    @JsonProperty("numero_emitente")
    private String numeroEmitente;

    @JsonProperty("complemento_emitente")
    private String complementoEmitente;

    @JsonProperty("bairro_emitente")
    private String bairroEmitente;

    @JsonProperty("codigo_municipio_emitente")
    private Integer codigoMunicipioEmitente;

    @JsonProperty("municipio_emitente")
    private String municipioEmitente;

    @JsonProperty("uf_emitente")
    private String ufEmitente;

    @JsonProperty("cep_emitente")
    private String cepEmitente;

    @JsonProperty("telefone_emitente")
    private String telefoneEmitente;

    @JsonProperty("inscricao_estadual_emitente")
    private String inscricaoEstadualEmitente;

    @JsonProperty("inscricao_estadual_st_emitente")
    private String inscricaoEstadualStEmitente;

    @JsonProperty("inscricao_municipal_emitente")
    private String inscricaoMunicipalEmitente;

    @JsonProperty("cnae_fiscal_emitente")
    private Integer cnaeFiscalEmitente;

    @JsonProperty("regime_tributario_emitente")
    private Integer regimeTributarioEmitente;

    @JsonProperty("cnpj_destinatario")
    private String cnpjDestinatario;

    @JsonProperty("cpf_destinatario")
    private String cpfDestinatario;

    @JsonProperty("id_estrangeiro_destinatario")
    private String idEstrangeiroDestinatario;

    @JsonProperty("nome_destinatario")
    private String nomeDestinatario;

    @JsonProperty("logradouro_destinatario")
    private String logradouroDestinatario;

    @JsonProperty("numero_destinatario")
    private String numeroDestinatario;

    @JsonProperty("complemento_destinatario")
    private String complementoDestinatario;

    @JsonProperty("bairro_destinatario")
    private String bairroDestinatario;

    @JsonProperty("codigo_municipio_destinatario")
    private Integer codigoMunicipioDestinatario;

    @JsonProperty("municipio_destinatario")
    private String municipioDestinatario;

    @JsonProperty("uf_destinatario")
    private String ufDestinatario;

    @JsonProperty("cep_destinatario")
    private String cepDestinatario;

    @JsonProperty("codigo_pais_destinatario")
    private Integer codigoPaisDestinatario;

    @JsonProperty("pais_destinatario")
    private String paisDestinatario;

    @JsonProperty("telefone_destinatario")
    private String telefoneDestinatario;

    @JsonProperty("indicador_inscricao_estadual_destinatario")
    private Integer indicadorInscricaoEstadualDestinatario;

    @JsonProperty("inscricao_estadual_destinatario")
    private String inscricaoEstadualDestinatario;

    @JsonProperty("inscricao_suframa_destinatario")
    private String inscricaoSuframaDestinatario;

    @JsonProperty("inscricao_municipal_destinatario")
    private String inscricaoMunicipalDestinatario;

    @JsonProperty("email_destinatario")
    private String emailDestinatario;

    @JsonProperty("cnpj_retirada")
    private String cnpjRetirada;

    @JsonProperty("cpf_retirada")
    private String cpfRetirada;

    @JsonProperty("nome_retirada")
    private String nomeRetirada;

    @JsonProperty("logradouro_retirada")
    private String logradouroRetirada;

    @JsonProperty("numero_retirada")
    private String numeroRetirada;

    @JsonProperty("complemento_retirada")
    private String complementoRetirada;

    @JsonProperty("bairro_retirada")
    private String bairroRetirada;

    @JsonProperty("codigo_municipio_retirada")
    private Integer codigoMunicipioRetirada;

    @JsonProperty("municipio_retirada")
    private String municipioRetirada;

    @JsonProperty("uf_retirada")
    private String ufRetirada;

    @JsonProperty("cep_retirada")
    private String cepRetirada;

    @JsonProperty("codigo_pais_retirada")
    private Integer codigoPaisRetirada;

    @JsonProperty("pais_retirada")
    private String paisRetirada;

    @JsonProperty("telefone_retirada")
    private String telefoneRetirada;

    @JsonProperty("email_retirada")
    private String emailRetirada;

    @JsonProperty("inscricao_estadual_retirada")
    private String inscricaoEstadualRetirada;

    @JsonProperty("cnpj_entrega")
    private String cnpjEntrega;

    @JsonProperty("cpf_entrega")
    private String cpfEntrega;

    @JsonProperty("nome_entrega")
    private String nomeEntrega;

    @JsonProperty("logradouro_entrega")
    private String logradouroEntrega;

    @JsonProperty("numero_entrega")
    private String numeroEntrega;

    @JsonProperty("complemento_entrega")
    private String complementoEntrega;

    @JsonProperty("bairro_entrega")
    private String bairroEntrega;

    @JsonProperty("codigo_municipio_entrega")
    private Integer codigoMunicipioEntrega;

    @JsonProperty("municipio_entrega")
    private String municipioEntrega;

    @JsonProperty("uf_entrega")
    private String ufEntrega;

    @JsonProperty("cep_entrega")
    private String cepEntrega;

    @JsonProperty("codigo_pais_entrega")
    private Integer codigoPaisEntrega;

    @JsonProperty("pais_entrega")
    private String paisEntrega;

    @JsonProperty("telefone_entrega")
    private String telefoneEntrega;

    @JsonProperty("email_entrega")
    private String emailEntrega;

    @JsonProperty("inscricao_estadual_entrega")
    private String inscricaoEstadualEntrega;

    @JsonProperty("pessoas_autorizadas")
    private List<PessoaAutorizada> pessoasAutorizadas;

    @JsonProperty("valor_frete")
    private Double valorFrete;

    @JsonProperty("valor_seguro")
    private Double valorSeguro;

    @JsonProperty("valor_desconto")
    private Double valorDesconto;

    @JsonProperty("valor_outras_despesas")
    private Double valorOutrasDespesas;

    @JsonProperty("valor_total")
    private Double valorTotal;

    @JsonProperty("valor_produtos")
    private Double valorProdutos;

    @JsonProperty("modalidade_frete")
    private Integer modalidadeFrete;

    @JsonProperty("valor_total_tributos")
    private Double valorTotalTributos;

    @JsonProperty("icms_base_calculo")
    private Double icmsBaseCalculo;

    @JsonProperty("icms_valor_total")
    private Double icmsValorTotal;

    @JsonProperty("icms_valor_total_desonerado")
    private Double icmsValorTotalDesonerado;

    @JsonProperty("fcp_valor_total_uf_destino")
    private Double fcpValorTotalUfDestino;

    @JsonProperty("icms_valor_total_uf_destino")
    private Double icmsValorTotalUfDestino;

    @JsonProperty("icms_valor_total_uf_remetente")
    private Double icmsValorTotalUfRemetente;

    @JsonProperty("fcp_valor_total")
    private Double fcpValorTotal;

    @JsonProperty("icms_valor_total_st")
    private Double icmsValorTotalSt;

    @JsonProperty("fcp_valor_total_st")
    private Double fcpValorTotalSt;

    @JsonProperty("informacoes_adicionais_contribuinte")
    private String informacoesAdicionaisContribuinte;

    @JsonProperty("observacoes_contribuinte")
    private List<ObservacaoContribuinte> observacoesContribuinte;

    @JsonProperty("informacoes_complementares_interesse_fisco")
    private String informacoesComplementaresInteresseFisco;

    @JsonProperty("tipo_compra_governamental")
    private Integer tipoCompraGovernamental;

    @JsonProperty("perc_reducao_aliquota_compra_governamental")
    private Double percReducaoAliquotaCompraGovernamental;

    @JsonProperty("tipo_operacao_governamental")
    private Integer tipoOperacaoGovernamental;

    @JsonProperty("items")
    private List<NfeItem> items;

    public String getNaturezaOperacao() {
        return naturezaOperacao;
    }

    public void setNaturezaOperacao(String naturezaOperacao) {
        this.naturezaOperacao = naturezaOperacao;
    }

    public Integer getSerie() {
        return serie;
    }

    public void setSerie(Integer serie) {
        this.serie = serie;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getDataEntradaSaida() {
        return dataEntradaSaida;
    }

    public void setDataEntradaSaida(String dataEntradaSaida) {
        this.dataEntradaSaida = dataEntradaSaida;
    }

    public String getDataPrevisaoEntregaBem() {
        return dataPrevisaoEntregaBem;
    }

    public void setDataPrevisaoEntregaBem(String dataPrevisaoEntregaBem) {
        this.dataPrevisaoEntregaBem = dataPrevisaoEntregaBem;
    }

    public Integer getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(Integer tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getLocalDestino() {
        return localDestino;
    }

    public void setLocalDestino(Integer localDestino) {
        this.localDestino = localDestino;
    }

    public Integer getMunicipio() {
        return municipio;
    }

    public void setMunicipio(Integer municipio) {
        this.municipio = municipio;
    }

    public Integer getIbsCbsMunicipio() {
        return ibsCbsMunicipio;
    }

    public void setIbsCbsMunicipio(Integer ibsCbsMunicipio) {
        this.ibsCbsMunicipio = ibsCbsMunicipio;
    }

    public Integer getFinalidadeEmissao() {
        return finalidadeEmissao;
    }

    public void setFinalidadeEmissao(Integer finalidadeEmissao) {
        this.finalidadeEmissao = finalidadeEmissao;
    }

    public String getTipoNotaDebito() {
        return tipoNotaDebito;
    }

    public void setTipoNotaDebito(String tipoNotaDebito) {
        this.tipoNotaDebito = tipoNotaDebito;
    }

    public String getTipoNotaCredito() {
        return tipoNotaCredito;
    }

    public void setTipoNotaCredito(String tipoNotaCredito) {
        this.tipoNotaCredito = tipoNotaCredito;
    }

    public Integer getConsumidorFinal() {
        return consumidorFinal;
    }

    public void setConsumidorFinal(Integer consumidorFinal) {
        this.consumidorFinal = consumidorFinal;
    }

    public Integer getPresencaComprador() {
        return presencaComprador;
    }

    public void setPresencaComprador(Integer presencaComprador) {
        this.presencaComprador = presencaComprador;
    }

    public Integer getIndicadorIntermediario() {
        return indicadorIntermediario;
    }

    public void setIndicadorIntermediario(Integer indicadorIntermediario) {
        this.indicadorIntermediario = indicadorIntermediario;
    }

    public List<NotaReferenciada> getNotasReferenciadas() {
        return notasReferenciadas;
    }

    public void setNotasReferenciadas(List<NotaReferenciada> notasReferenciadas) {
        this.notasReferenciadas = notasReferenciadas;
    }

    public List<String> getChavesNfeAntecipacaoPagamento() {
        return chavesNfeAntecipacaoPagamento;
    }

    public void setChavesNfeAntecipacaoPagamento(List<String> chavesNfeAntecipacaoPagamento) {
        this.chavesNfeAntecipacaoPagamento = chavesNfeAntecipacaoPagamento;
    }

    public String getCnpjEmitente() {
        return cnpjEmitente;
    }

    public void setCnpjEmitente(String cnpjEmitente) {
        this.cnpjEmitente = cnpjEmitente;
    }

    public String getCpfEmitente() {
        return cpfEmitente;
    }

    public void setCpfEmitente(String cpfEmitente) {
        this.cpfEmitente = cpfEmitente;
    }

    public String getNomeEmitente() {
        return nomeEmitente;
    }

    public void setNomeEmitente(String nomeEmitente) {
        this.nomeEmitente = nomeEmitente;
    }

    public String getNomeFantasiaEmitente() {
        return nomeFantasiaEmitente;
    }

    public void setNomeFantasiaEmitente(String nomeFantasiaEmitente) {
        this.nomeFantasiaEmitente = nomeFantasiaEmitente;
    }

    public String getLogradouroEmitente() {
        return logradouroEmitente;
    }

    public void setLogradouroEmitente(String logradouroEmitente) {
        this.logradouroEmitente = logradouroEmitente;
    }

    public String getNumeroEmitente() {
        return numeroEmitente;
    }

    public void setNumeroEmitente(String numeroEmitente) {
        this.numeroEmitente = numeroEmitente;
    }

    public String getComplementoEmitente() {
        return complementoEmitente;
    }

    public void setComplementoEmitente(String complementoEmitente) {
        this.complementoEmitente = complementoEmitente;
    }

    public String getBairroEmitente() {
        return bairroEmitente;
    }

    public void setBairroEmitente(String bairroEmitente) {
        this.bairroEmitente = bairroEmitente;
    }

    public Integer getCodigoMunicipioEmitente() {
        return codigoMunicipioEmitente;
    }

    public void setCodigoMunicipioEmitente(Integer codigoMunicipioEmitente) {
        this.codigoMunicipioEmitente = codigoMunicipioEmitente;
    }

    public String getMunicipioEmitente() {
        return municipioEmitente;
    }

    public void setMunicipioEmitente(String municipioEmitente) {
        this.municipioEmitente = municipioEmitente;
    }

    public String getUfEmitente() {
        return ufEmitente;
    }

    public void setUfEmitente(String ufEmitente) {
        this.ufEmitente = ufEmitente;
    }

    public String getCepEmitente() {
        return cepEmitente;
    }

    public void setCepEmitente(String cepEmitente) {
        this.cepEmitente = cepEmitente;
    }

    public String getTelefoneEmitente() {
        return telefoneEmitente;
    }

    public void setTelefoneEmitente(String telefoneEmitente) {
        this.telefoneEmitente = telefoneEmitente;
    }

    public String getInscricaoEstadualEmitente() {
        return inscricaoEstadualEmitente;
    }

    public void setInscricaoEstadualEmitente(String inscricaoEstadualEmitente) {
        this.inscricaoEstadualEmitente = inscricaoEstadualEmitente;
    }

    public String getInscricaoEstadualStEmitente() {
        return inscricaoEstadualStEmitente;
    }

    public void setInscricaoEstadualStEmitente(String inscricaoEstadualStEmitente) {
        this.inscricaoEstadualStEmitente = inscricaoEstadualStEmitente;
    }

    public String getInscricaoMunicipalEmitente() {
        return inscricaoMunicipalEmitente;
    }

    public void setInscricaoMunicipalEmitente(String inscricaoMunicipalEmitente) {
        this.inscricaoMunicipalEmitente = inscricaoMunicipalEmitente;
    }

    public Integer getCnaeFiscalEmitente() {
        return cnaeFiscalEmitente;
    }

    public void setCnaeFiscalEmitente(Integer cnaeFiscalEmitente) {
        this.cnaeFiscalEmitente = cnaeFiscalEmitente;
    }

    public Integer getRegimeTributarioEmitente() {
        return regimeTributarioEmitente;
    }

    public void setRegimeTributarioEmitente(Integer regimeTributarioEmitente) {
        this.regimeTributarioEmitente = regimeTributarioEmitente;
    }

    public String getCnpjDestinatario() {
        return cnpjDestinatario;
    }

    public void setCnpjDestinatario(String cnpjDestinatario) {
        this.cnpjDestinatario = cnpjDestinatario;
    }

    public String getCpfDestinatario() {
        return cpfDestinatario;
    }

    public void setCpfDestinatario(String cpfDestinatario) {
        this.cpfDestinatario = cpfDestinatario;
    }

    public String getIdEstrangeiroDestinatario() {
        return idEstrangeiroDestinatario;
    }

    public void setIdEstrangeiroDestinatario(String idEstrangeiroDestinatario) {
        this.idEstrangeiroDestinatario = idEstrangeiroDestinatario;
    }

    public String getNomeDestinatario() {
        return nomeDestinatario;
    }

    public void setNomeDestinatario(String nomeDestinatario) {
        this.nomeDestinatario = nomeDestinatario;
    }

    public String getLogradouroDestinatario() {
        return logradouroDestinatario;
    }

    public void setLogradouroDestinatario(String logradouroDestinatario) {
        this.logradouroDestinatario = logradouroDestinatario;
    }

    public String getNumeroDestinatario() {
        return numeroDestinatario;
    }

    public void setNumeroDestinatario(String numeroDestinatario) {
        this.numeroDestinatario = numeroDestinatario;
    }

    public String getComplementoDestinatario() {
        return complementoDestinatario;
    }

    public void setComplementoDestinatario(String complementoDestinatario) {
        this.complementoDestinatario = complementoDestinatario;
    }

    public String getBairroDestinatario() {
        return bairroDestinatario;
    }

    public void setBairroDestinatario(String bairroDestinatario) {
        this.bairroDestinatario = bairroDestinatario;
    }

    public Integer getCodigoMunicipioDestinatario() {
        return codigoMunicipioDestinatario;
    }

    public void setCodigoMunicipioDestinatario(Integer codigoMunicipioDestinatario) {
        this.codigoMunicipioDestinatario = codigoMunicipioDestinatario;
    }

    public String getMunicipioDestinatario() {
        return municipioDestinatario;
    }

    public void setMunicipioDestinatario(String municipioDestinatario) {
        this.municipioDestinatario = municipioDestinatario;
    }

    public String getUfDestinatario() {
        return ufDestinatario;
    }

    public void setUfDestinatario(String ufDestinatario) {
        this.ufDestinatario = ufDestinatario;
    }

    public String getCepDestinatario() {
        return cepDestinatario;
    }

    public void setCepDestinatario(String cepDestinatario) {
        this.cepDestinatario = cepDestinatario;
    }

    public Integer getCodigoPaisDestinatario() {
        return codigoPaisDestinatario;
    }

    public void setCodigoPaisDestinatario(Integer codigoPaisDestinatario) {
        this.codigoPaisDestinatario = codigoPaisDestinatario;
    }

    public String getPaisDestinatario() {
        return paisDestinatario;
    }

    public void setPaisDestinatario(String paisDestinatario) {
        this.paisDestinatario = paisDestinatario;
    }

    public String getTelefoneDestinatario() {
        return telefoneDestinatario;
    }

    public void setTelefoneDestinatario(String telefoneDestinatario) {
        this.telefoneDestinatario = telefoneDestinatario;
    }

    public Integer getIndicadorInscricaoEstadualDestinatario() {
        return indicadorInscricaoEstadualDestinatario;
    }

    public void setIndicadorInscricaoEstadualDestinatario(Integer indicadorInscricaoEstadualDestinatario) {
        this.indicadorInscricaoEstadualDestinatario = indicadorInscricaoEstadualDestinatario;
    }

    public String getInscricaoEstadualDestinatario() {
        return inscricaoEstadualDestinatario;
    }

    public void setInscricaoEstadualDestinatario(String inscricaoEstadualDestinatario) {
        this.inscricaoEstadualDestinatario = inscricaoEstadualDestinatario;
    }

    public String getInscricaoSuframaDestinatario() {
        return inscricaoSuframaDestinatario;
    }

    public void setInscricaoSuframaDestinatario(String inscricaoSuframaDestinatario) {
        this.inscricaoSuframaDestinatario = inscricaoSuframaDestinatario;
    }

    public String getInscricaoMunicipalDestinatario() {
        return inscricaoMunicipalDestinatario;
    }

    public void setInscricaoMunicipalDestinatario(String inscricaoMunicipalDestinatario) {
        this.inscricaoMunicipalDestinatario = inscricaoMunicipalDestinatario;
    }

    public String getEmailDestinatario() {
        return emailDestinatario;
    }

    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
    }

    public String getCnpjRetirada() {
        return cnpjRetirada;
    }

    public void setCnpjRetirada(String cnpjRetirada) {
        this.cnpjRetirada = cnpjRetirada;
    }

    public String getCpfRetirada() {
        return cpfRetirada;
    }

    public void setCpfRetirada(String cpfRetirada) {
        this.cpfRetirada = cpfRetirada;
    }

    public String getNomeRetirada() {
        return nomeRetirada;
    }

    public void setNomeRetirada(String nomeRetirada) {
        this.nomeRetirada = nomeRetirada;
    }

    public String getLogradouroRetirada() {
        return logradouroRetirada;
    }

    public void setLogradouroRetirada(String logradouroRetirada) {
        this.logradouroRetirada = logradouroRetirada;
    }

    public String getNumeroRetirada() {
        return numeroRetirada;
    }

    public void setNumeroRetirada(String numeroRetirada) {
        this.numeroRetirada = numeroRetirada;
    }

    public String getComplementoRetirada() {
        return complementoRetirada;
    }

    public void setComplementoRetirada(String complementoRetirada) {
        this.complementoRetirada = complementoRetirada;
    }

    public String getBairroRetirada() {
        return bairroRetirada;
    }

    public void setBairroRetirada(String bairroRetirada) {
        this.bairroRetirada = bairroRetirada;
    }

    public Integer getCodigoMunicipioRetirada() {
        return codigoMunicipioRetirada;
    }

    public void setCodigoMunicipioRetirada(Integer codigoMunicipioRetirada) {
        this.codigoMunicipioRetirada = codigoMunicipioRetirada;
    }

    public String getMunicipioRetirada() {
        return municipioRetirada;
    }

    public void setMunicipioRetirada(String municipioRetirada) {
        this.municipioRetirada = municipioRetirada;
    }

    public String getUfRetirada() {
        return ufRetirada;
    }

    public void setUfRetirada(String ufRetirada) {
        this.ufRetirada = ufRetirada;
    }

    public String getCepRetirada() {
        return cepRetirada;
    }

    public void setCepRetirada(String cepRetirada) {
        this.cepRetirada = cepRetirada;
    }

    public Integer getCodigoPaisRetirada() {
        return codigoPaisRetirada;
    }

    public void setCodigoPaisRetirada(Integer codigoPaisRetirada) {
        this.codigoPaisRetirada = codigoPaisRetirada;
    }

    public String getPaisRetirada() {
        return paisRetirada;
    }

    public void setPaisRetirada(String paisRetirada) {
        this.paisRetirada = paisRetirada;
    }

    public String getTelefoneRetirada() {
        return telefoneRetirada;
    }

    public void setTelefoneRetirada(String telefoneRetirada) {
        this.telefoneRetirada = telefoneRetirada;
    }

    public String getEmailRetirada() {
        return emailRetirada;
    }

    public void setEmailRetirada(String emailRetirada) {
        this.emailRetirada = emailRetirada;
    }

    public String getInscricaoEstadualRetirada() {
        return inscricaoEstadualRetirada;
    }

    public void setInscricaoEstadualRetirada(String inscricaoEstadualRetirada) {
        this.inscricaoEstadualRetirada = inscricaoEstadualRetirada;
    }

    public String getCnpjEntrega() {
        return cnpjEntrega;
    }

    public void setCnpjEntrega(String cnpjEntrega) {
        this.cnpjEntrega = cnpjEntrega;
    }

    public String getCpfEntrega() {
        return cpfEntrega;
    }

    public void setCpfEntrega(String cpfEntrega) {
        this.cpfEntrega = cpfEntrega;
    }

    public String getNomeEntrega() {
        return nomeEntrega;
    }

    public void setNomeEntrega(String nomeEntrega) {
        this.nomeEntrega = nomeEntrega;
    }

    public String getLogradouroEntrega() {
        return logradouroEntrega;
    }

    public void setLogradouroEntrega(String logradouroEntrega) {
        this.logradouroEntrega = logradouroEntrega;
    }

    public String getNumeroEntrega() {
        return numeroEntrega;
    }

    public void setNumeroEntrega(String numeroEntrega) {
        this.numeroEntrega = numeroEntrega;
    }

    public String getComplementoEntrega() {
        return complementoEntrega;
    }

    public void setComplementoEntrega(String complementoEntrega) {
        this.complementoEntrega = complementoEntrega;
    }

    public String getBairroEntrega() {
        return bairroEntrega;
    }

    public void setBairroEntrega(String bairroEntrega) {
        this.bairroEntrega = bairroEntrega;
    }

    public Integer getCodigoMunicipioEntrega() {
        return codigoMunicipioEntrega;
    }

    public void setCodigoMunicipioEntrega(Integer codigoMunicipioEntrega) {
        this.codigoMunicipioEntrega = codigoMunicipioEntrega;
    }

    public String getMunicipioEntrega() {
        return municipioEntrega;
    }

    public void setMunicipioEntrega(String municipioEntrega) {
        this.municipioEntrega = municipioEntrega;
    }

    public String getUfEntrega() {
        return ufEntrega;
    }

    public void setUfEntrega(String ufEntrega) {
        this.ufEntrega = ufEntrega;
    }

    public String getCepEntrega() {
        return cepEntrega;
    }

    public void setCepEntrega(String cepEntrega) {
        this.cepEntrega = cepEntrega;
    }

    public Integer getCodigoPaisEntrega() {
        return codigoPaisEntrega;
    }

    public void setCodigoPaisEntrega(Integer codigoPaisEntrega) {
        this.codigoPaisEntrega = codigoPaisEntrega;
    }

    public String getPaisEntrega() {
        return paisEntrega;
    }

    public void setPaisEntrega(String paisEntrega) {
        this.paisEntrega = paisEntrega;
    }

    public String getTelefoneEntrega() {
        return telefoneEntrega;
    }

    public void setTelefoneEntrega(String telefoneEntrega) {
        this.telefoneEntrega = telefoneEntrega;
    }

    public String getEmailEntrega() {
        return emailEntrega;
    }

    public void setEmailEntrega(String emailEntrega) {
        this.emailEntrega = emailEntrega;
    }

    public String getInscricaoEstadualEntrega() {
        return inscricaoEstadualEntrega;
    }

    public void setInscricaoEstadualEntrega(String inscricaoEstadualEntrega) {
        this.inscricaoEstadualEntrega = inscricaoEstadualEntrega;
    }

    public List<PessoaAutorizada> getPessoasAutorizadas() {
        return pessoasAutorizadas;
    }

    public void setPessoasAutorizadas(List<PessoaAutorizada> pessoasAutorizadas) {
        this.pessoasAutorizadas = pessoasAutorizadas;
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

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getValorProdutos() {
        return valorProdutos;
    }

    public void setValorProdutos(Double valorProdutos) {
        this.valorProdutos = valorProdutos;
    }

    public Integer getModalidadeFrete() {
        return modalidadeFrete;
    }

    public void setModalidadeFrete(Integer modalidadeFrete) {
        this.modalidadeFrete = modalidadeFrete;
    }

    public Double getValorTotalTributos() {
        return valorTotalTributos;
    }

    public void setValorTotalTributos(Double valorTotalTributos) {
        this.valorTotalTributos = valorTotalTributos;
    }

    public Double getIcmsBaseCalculo() {
        return icmsBaseCalculo;
    }

    public void setIcmsBaseCalculo(Double icmsBaseCalculo) {
        this.icmsBaseCalculo = icmsBaseCalculo;
    }

    public Double getIcmsValorTotal() {
        return icmsValorTotal;
    }

    public void setIcmsValorTotal(Double icmsValorTotal) {
        this.icmsValorTotal = icmsValorTotal;
    }

    public Double getIcmsValorTotalDesonerado() {
        return icmsValorTotalDesonerado;
    }

    public void setIcmsValorTotalDesonerado(Double icmsValorTotalDesonerado) {
        this.icmsValorTotalDesonerado = icmsValorTotalDesonerado;
    }

    public Double getFcpValorTotalUfDestino() {
        return fcpValorTotalUfDestino;
    }

    public void setFcpValorTotalUfDestino(Double fcpValorTotalUfDestino) {
        this.fcpValorTotalUfDestino = fcpValorTotalUfDestino;
    }

    public Double getIcmsValorTotalUfDestino() {
        return icmsValorTotalUfDestino;
    }

    public void setIcmsValorTotalUfDestino(Double icmsValorTotalUfDestino) {
        this.icmsValorTotalUfDestino = icmsValorTotalUfDestino;
    }

    public Double getIcmsValorTotalUfRemetente() {
        return icmsValorTotalUfRemetente;
    }

    public void setIcmsValorTotalUfRemetente(Double icmsValorTotalUfRemetente) {
        this.icmsValorTotalUfRemetente = icmsValorTotalUfRemetente;
    }

    public Double getFcpValorTotal() {
        return fcpValorTotal;
    }

    public void setFcpValorTotal(Double fcpValorTotal) {
        this.fcpValorTotal = fcpValorTotal;
    }

    public Double getIcmsValorTotalSt() {
        return icmsValorTotalSt;
    }

    public void setIcmsValorTotalSt(Double icmsValorTotalSt) {
        this.icmsValorTotalSt = icmsValorTotalSt;
    }

    public Double getFcpValorTotalSt() {
        return fcpValorTotalSt;
    }

    public void setFcpValorTotalSt(Double fcpValorTotalSt) {
        this.fcpValorTotalSt = fcpValorTotalSt;
    }

    public String getInformacoesAdicionaisContribuinte() {
        return informacoesAdicionaisContribuinte;
    }

    public void setInformacoesAdicionaisContribuinte(String informacoesAdicionaisContribuinte) {
        this.informacoesAdicionaisContribuinte = informacoesAdicionaisContribuinte;
    }

    public List<ObservacaoContribuinte> getObservacoesContribuinte() {
        return observacoesContribuinte;
    }

    public void setObservacoesContribuinte(List<ObservacaoContribuinte> observacoesContribuinte) {
        this.observacoesContribuinte = observacoesContribuinte;
    }

    public String getInformacoesComplementaresInteresseFisco() {
        return informacoesComplementaresInteresseFisco;
    }

    public void setInformacoesComplementaresInteresseFisco(String informacoesComplementaresInteresseFisco) {
        this.informacoesComplementaresInteresseFisco = informacoesComplementaresInteresseFisco;
    }

    public Integer getTipoCompraGovernamental() {
        return tipoCompraGovernamental;
    }

    public void setTipoCompraGovernamental(Integer tipoCompraGovernamental) {
        this.tipoCompraGovernamental = tipoCompraGovernamental;
    }

    public Double getPercReducaoAliquotaCompraGovernamental() {
        return percReducaoAliquotaCompraGovernamental;
    }

    public void setPercReducaoAliquotaCompraGovernamental(Double percReducaoAliquotaCompraGovernamental) {
        this.percReducaoAliquotaCompraGovernamental = percReducaoAliquotaCompraGovernamental;
    }

    public Integer getTipoOperacaoGovernamental() {
        return tipoOperacaoGovernamental;
    }

    public void setTipoOperacaoGovernamental(Integer tipoOperacaoGovernamental) {
        this.tipoOperacaoGovernamental = tipoOperacaoGovernamental;
    }

    public List<NfeItem> getItems() {
        return items;
    }

    public void setItems(List<NfeItem> items) {
        this.items = items;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String naturezaOperacao;
        private Integer serie;
        private Integer numero;
        private String dataEmissao;
        private String dataEntradaSaida;
        private String dataPrevisaoEntregaBem;
        private Integer tipoDocumento;
        private Integer localDestino;
        private Integer municipio;
        private Integer ibsCbsMunicipio;
        private Integer finalidadeEmissao;
        private String tipoNotaDebito;
        private String tipoNotaCredito;
        private Integer consumidorFinal;
        private Integer presencaComprador;
        private Integer indicadorIntermediario;
        private List<NotaReferenciada> notasReferenciadas;
        private List<String> chavesNfeAntecipacaoPagamento;
        private String cnpjEmitente;
        private String cpfEmitente;
        private String nomeEmitente;
        private String nomeFantasiaEmitente;
        private String logradouroEmitente;
        private String numeroEmitente;
        private String complementoEmitente;
        private String bairroEmitente;
        private Integer codigoMunicipioEmitente;
        private String municipioEmitente;
        private String ufEmitente;
        private String cepEmitente;
        private String telefoneEmitente;
        private String inscricaoEstadualEmitente;
        private String inscricaoEstadualStEmitente;
        private String inscricaoMunicipalEmitente;
        private Integer cnaeFiscalEmitente;
        private Integer regimeTributarioEmitente;
        private String cnpjDestinatario;
        private String cpfDestinatario;
        private String idEstrangeiroDestinatario;
        private String nomeDestinatario;
        private String logradouroDestinatario;
        private String numeroDestinatario;
        private String complementoDestinatario;
        private String bairroDestinatario;
        private Integer codigoMunicipioDestinatario;
        private String municipioDestinatario;
        private String ufDestinatario;
        private String cepDestinatario;
        private Integer codigoPaisDestinatario;
        private String paisDestinatario;
        private String telefoneDestinatario;
        private Integer indicadorInscricaoEstadualDestinatario;
        private String inscricaoEstadualDestinatario;
        private String inscricaoSuframaDestinatario;
        private String inscricaoMunicipalDestinatario;
        private String emailDestinatario;
        private String cnpjRetirada;
        private String cpfRetirada;
        private String nomeRetirada;
        private String logradouroRetirada;
        private String numeroRetirada;
        private String complementoRetirada;
        private String bairroRetirada;
        private Integer codigoMunicipioRetirada;
        private String municipioRetirada;
        private String ufRetirada;
        private String cepRetirada;
        private Integer codigoPaisRetirada;
        private String paisRetirada;
        private String telefoneRetirada;
        private String emailRetirada;
        private String inscricaoEstadualRetirada;
        private String cnpjEntrega;
        private String cpfEntrega;
        private String nomeEntrega;
        private String logradouroEntrega;
        private String numeroEntrega;
        private String complementoEntrega;
        private String bairroEntrega;
        private Integer codigoMunicipioEntrega;
        private String municipioEntrega;
        private String ufEntrega;
        private String cepEntrega;
        private Integer codigoPaisEntrega;
        private String paisEntrega;
        private String telefoneEntrega;
        private String emailEntrega;
        private String inscricaoEstadualEntrega;
        private List<PessoaAutorizada> pessoasAutorizadas;
        private Double valorFrete;
        private Double valorSeguro;
        private Double valorDesconto;
        private Double valorOutrasDespesas;
        private Double valorTotal;
        private Double valorProdutos;
        private Integer modalidadeFrete;
        private Double valorTotalTributos;
        private Double icmsBaseCalculo;
        private Double icmsValorTotal;
        private Double icmsValorTotalDesonerado;
        private Double fcpValorTotalUfDestino;
        private Double icmsValorTotalUfDestino;
        private Double icmsValorTotalUfRemetente;
        private Double fcpValorTotal;
        private Double icmsValorTotalSt;
        private Double fcpValorTotalSt;
        private String informacoesAdicionaisContribuinte;
        private List<ObservacaoContribuinte> observacoesContribuinte;
        private String informacoesComplementaresInteresseFisco;
        private Integer tipoCompraGovernamental;
        private Double percReducaoAliquotaCompraGovernamental;
        private Integer tipoOperacaoGovernamental;
        private List<NfeItem> items;

        Builder() {
        }

        public Builder naturezaOperacao(String naturezaOperacao) {
            this.naturezaOperacao = naturezaOperacao;
            return this;
        }

        public Builder serie(Integer serie) {
            this.serie = serie;
            return this;
        }

        public Builder numero(Integer numero) {
            this.numero = numero;
            return this;
        }

        public Builder dataEmissao(String dataEmissao) {
            this.dataEmissao = dataEmissao;
            return this;
        }

        public Builder dataEntradaSaida(String dataEntradaSaida) {
            this.dataEntradaSaida = dataEntradaSaida;
            return this;
        }

        public Builder dataPrevisaoEntregaBem(String dataPrevisaoEntregaBem) {
            this.dataPrevisaoEntregaBem = dataPrevisaoEntregaBem;
            return this;
        }

        public Builder tipoDocumento(Integer tipoDocumento) {
            this.tipoDocumento = tipoDocumento;
            return this;
        }

        public Builder localDestino(Integer localDestino) {
            this.localDestino = localDestino;
            return this;
        }

        public Builder municipio(Integer municipio) {
            this.municipio = municipio;
            return this;
        }

        public Builder ibsCbsMunicipio(Integer ibsCbsMunicipio) {
            this.ibsCbsMunicipio = ibsCbsMunicipio;
            return this;
        }

        public Builder finalidadeEmissao(Integer finalidadeEmissao) {
            this.finalidadeEmissao = finalidadeEmissao;
            return this;
        }

        public Builder tipoNotaDebito(String tipoNotaDebito) {
            this.tipoNotaDebito = tipoNotaDebito;
            return this;
        }

        public Builder tipoNotaCredito(String tipoNotaCredito) {
            this.tipoNotaCredito = tipoNotaCredito;
            return this;
        }

        public Builder consumidorFinal(Integer consumidorFinal) {
            this.consumidorFinal = consumidorFinal;
            return this;
        }

        public Builder presencaComprador(Integer presencaComprador) {
            this.presencaComprador = presencaComprador;
            return this;
        }

        public Builder indicadorIntermediario(Integer indicadorIntermediario) {
            this.indicadorIntermediario = indicadorIntermediario;
            return this;
        }

        public Builder notasReferenciadas(List<NotaReferenciada> notasReferenciadas) {
            this.notasReferenciadas = notasReferenciadas;
            return this;
        }

        public Builder chavesNfeAntecipacaoPagamento(List<String> chavesNfeAntecipacaoPagamento) {
            this.chavesNfeAntecipacaoPagamento = chavesNfeAntecipacaoPagamento;
            return this;
        }

        public Builder cnpjEmitente(String cnpjEmitente) {
            this.cnpjEmitente = cnpjEmitente;
            return this;
        }

        public Builder cpfEmitente(String cpfEmitente) {
            this.cpfEmitente = cpfEmitente;
            return this;
        }

        public Builder nomeEmitente(String nomeEmitente) {
            this.nomeEmitente = nomeEmitente;
            return this;
        }

        public Builder nomeFantasiaEmitente(String nomeFantasiaEmitente) {
            this.nomeFantasiaEmitente = nomeFantasiaEmitente;
            return this;
        }

        public Builder logradouroEmitente(String logradouroEmitente) {
            this.logradouroEmitente = logradouroEmitente;
            return this;
        }

        public Builder numeroEmitente(String numeroEmitente) {
            this.numeroEmitente = numeroEmitente;
            return this;
        }

        public Builder complementoEmitente(String complementoEmitente) {
            this.complementoEmitente = complementoEmitente;
            return this;
        }

        public Builder bairroEmitente(String bairroEmitente) {
            this.bairroEmitente = bairroEmitente;
            return this;
        }

        public Builder codigoMunicipioEmitente(Integer codigoMunicipioEmitente) {
            this.codigoMunicipioEmitente = codigoMunicipioEmitente;
            return this;
        }

        public Builder municipioEmitente(String municipioEmitente) {
            this.municipioEmitente = municipioEmitente;
            return this;
        }

        public Builder ufEmitente(String ufEmitente) {
            this.ufEmitente = ufEmitente;
            return this;
        }

        public Builder cepEmitente(String cepEmitente) {
            this.cepEmitente = cepEmitente;
            return this;
        }

        public Builder telefoneEmitente(String telefoneEmitente) {
            this.telefoneEmitente = telefoneEmitente;
            return this;
        }

        public Builder inscricaoEstadualEmitente(String inscricaoEstadualEmitente) {
            this.inscricaoEstadualEmitente = inscricaoEstadualEmitente;
            return this;
        }

        public Builder inscricaoEstadualStEmitente(String inscricaoEstadualStEmitente) {
            this.inscricaoEstadualStEmitente = inscricaoEstadualStEmitente;
            return this;
        }

        public Builder inscricaoMunicipalEmitente(String inscricaoMunicipalEmitente) {
            this.inscricaoMunicipalEmitente = inscricaoMunicipalEmitente;
            return this;
        }

        public Builder cnaeFiscalEmitente(Integer cnaeFiscalEmitente) {
            this.cnaeFiscalEmitente = cnaeFiscalEmitente;
            return this;
        }

        public Builder regimeTributarioEmitente(Integer regimeTributarioEmitente) {
            this.regimeTributarioEmitente = regimeTributarioEmitente;
            return this;
        }

        public Builder cnpjDestinatario(String cnpjDestinatario) {
            this.cnpjDestinatario = cnpjDestinatario;
            return this;
        }

        public Builder cpfDestinatario(String cpfDestinatario) {
            this.cpfDestinatario = cpfDestinatario;
            return this;
        }

        public Builder idEstrangeiroDestinatario(String idEstrangeiroDestinatario) {
            this.idEstrangeiroDestinatario = idEstrangeiroDestinatario;
            return this;
        }

        public Builder nomeDestinatario(String nomeDestinatario) {
            this.nomeDestinatario = nomeDestinatario;
            return this;
        }

        public Builder logradouroDestinatario(String logradouroDestinatario) {
            this.logradouroDestinatario = logradouroDestinatario;
            return this;
        }

        public Builder numeroDestinatario(String numeroDestinatario) {
            this.numeroDestinatario = numeroDestinatario;
            return this;
        }

        public Builder complementoDestinatario(String complementoDestinatario) {
            this.complementoDestinatario = complementoDestinatario;
            return this;
        }

        public Builder bairroDestinatario(String bairroDestinatario) {
            this.bairroDestinatario = bairroDestinatario;
            return this;
        }

        public Builder codigoMunicipioDestinatario(Integer codigoMunicipioDestinatario) {
            this.codigoMunicipioDestinatario = codigoMunicipioDestinatario;
            return this;
        }

        public Builder municipioDestinatario(String municipioDestinatario) {
            this.municipioDestinatario = municipioDestinatario;
            return this;
        }

        public Builder ufDestinatario(String ufDestinatario) {
            this.ufDestinatario = ufDestinatario;
            return this;
        }

        public Builder cepDestinatario(String cepDestinatario) {
            this.cepDestinatario = cepDestinatario;
            return this;
        }

        public Builder codigoPaisDestinatario(Integer codigoPaisDestinatario) {
            this.codigoPaisDestinatario = codigoPaisDestinatario;
            return this;
        }

        public Builder paisDestinatario(String paisDestinatario) {
            this.paisDestinatario = paisDestinatario;
            return this;
        }

        public Builder telefoneDestinatario(String telefoneDestinatario) {
            this.telefoneDestinatario = telefoneDestinatario;
            return this;
        }

        public Builder indicadorInscricaoEstadualDestinatario(Integer indicadorInscricaoEstadualDestinatario) {
            this.indicadorInscricaoEstadualDestinatario = indicadorInscricaoEstadualDestinatario;
            return this;
        }

        public Builder inscricaoEstadualDestinatario(String inscricaoEstadualDestinatario) {
            this.inscricaoEstadualDestinatario = inscricaoEstadualDestinatario;
            return this;
        }

        public Builder inscricaoSuframaDestinatario(String inscricaoSuframaDestinatario) {
            this.inscricaoSuframaDestinatario = inscricaoSuframaDestinatario;
            return this;
        }

        public Builder inscricaoMunicipalDestinatario(String inscricaoMunicipalDestinatario) {
            this.inscricaoMunicipalDestinatario = inscricaoMunicipalDestinatario;
            return this;
        }

        public Builder emailDestinatario(String emailDestinatario) {
            this.emailDestinatario = emailDestinatario;
            return this;
        }

        public Builder cnpjRetirada(String cnpjRetirada) {
            this.cnpjRetirada = cnpjRetirada;
            return this;
        }

        public Builder cpfRetirada(String cpfRetirada) {
            this.cpfRetirada = cpfRetirada;
            return this;
        }

        public Builder nomeRetirada(String nomeRetirada) {
            this.nomeRetirada = nomeRetirada;
            return this;
        }

        public Builder logradouroRetirada(String logradouroRetirada) {
            this.logradouroRetirada = logradouroRetirada;
            return this;
        }

        public Builder numeroRetirada(String numeroRetirada) {
            this.numeroRetirada = numeroRetirada;
            return this;
        }

        public Builder complementoRetirada(String complementoRetirada) {
            this.complementoRetirada = complementoRetirada;
            return this;
        }

        public Builder bairroRetirada(String bairroRetirada) {
            this.bairroRetirada = bairroRetirada;
            return this;
        }

        public Builder codigoMunicipioRetirada(Integer codigoMunicipioRetirada) {
            this.codigoMunicipioRetirada = codigoMunicipioRetirada;
            return this;
        }

        public Builder municipioRetirada(String municipioRetirada) {
            this.municipioRetirada = municipioRetirada;
            return this;
        }

        public Builder ufRetirada(String ufRetirada) {
            this.ufRetirada = ufRetirada;
            return this;
        }

        public Builder cepRetirada(String cepRetirada) {
            this.cepRetirada = cepRetirada;
            return this;
        }

        public Builder codigoPaisRetirada(Integer codigoPaisRetirada) {
            this.codigoPaisRetirada = codigoPaisRetirada;
            return this;
        }

        public Builder paisRetirada(String paisRetirada) {
            this.paisRetirada = paisRetirada;
            return this;
        }

        public Builder telefoneRetirada(String telefoneRetirada) {
            this.telefoneRetirada = telefoneRetirada;
            return this;
        }

        public Builder emailRetirada(String emailRetirada) {
            this.emailRetirada = emailRetirada;
            return this;
        }

        public Builder inscricaoEstadualRetirada(String inscricaoEstadualRetirada) {
            this.inscricaoEstadualRetirada = inscricaoEstadualRetirada;
            return this;
        }

        public Builder cnpjEntrega(String cnpjEntrega) {
            this.cnpjEntrega = cnpjEntrega;
            return this;
        }

        public Builder cpfEntrega(String cpfEntrega) {
            this.cpfEntrega = cpfEntrega;
            return this;
        }

        public Builder nomeEntrega(String nomeEntrega) {
            this.nomeEntrega = nomeEntrega;
            return this;
        }

        public Builder logradouroEntrega(String logradouroEntrega) {
            this.logradouroEntrega = logradouroEntrega;
            return this;
        }

        public Builder numeroEntrega(String numeroEntrega) {
            this.numeroEntrega = numeroEntrega;
            return this;
        }

        public Builder complementoEntrega(String complementoEntrega) {
            this.complementoEntrega = complementoEntrega;
            return this;
        }

        public Builder bairroEntrega(String bairroEntrega) {
            this.bairroEntrega = bairroEntrega;
            return this;
        }

        public Builder codigoMunicipioEntrega(Integer codigoMunicipioEntrega) {
            this.codigoMunicipioEntrega = codigoMunicipioEntrega;
            return this;
        }

        public Builder municipioEntrega(String municipioEntrega) {
            this.municipioEntrega = municipioEntrega;
            return this;
        }

        public Builder ufEntrega(String ufEntrega) {
            this.ufEntrega = ufEntrega;
            return this;
        }

        public Builder cepEntrega(String cepEntrega) {
            this.cepEntrega = cepEntrega;
            return this;
        }

        public Builder codigoPaisEntrega(Integer codigoPaisEntrega) {
            this.codigoPaisEntrega = codigoPaisEntrega;
            return this;
        }

        public Builder paisEntrega(String paisEntrega) {
            this.paisEntrega = paisEntrega;
            return this;
        }

        public Builder telefoneEntrega(String telefoneEntrega) {
            this.telefoneEntrega = telefoneEntrega;
            return this;
        }

        public Builder emailEntrega(String emailEntrega) {
            this.emailEntrega = emailEntrega;
            return this;
        }

        public Builder inscricaoEstadualEntrega(String inscricaoEstadualEntrega) {
            this.inscricaoEstadualEntrega = inscricaoEstadualEntrega;
            return this;
        }

        public Builder pessoasAutorizadas(List<PessoaAutorizada> pessoasAutorizadas) {
            this.pessoasAutorizadas = pessoasAutorizadas;
            return this;
        }

        public Builder valorFrete(Double valorFrete) {
            this.valorFrete = valorFrete;
            return this;
        }

        public Builder valorSeguro(Double valorSeguro) {
            this.valorSeguro = valorSeguro;
            return this;
        }

        public Builder valorDesconto(Double valorDesconto) {
            this.valorDesconto = valorDesconto;
            return this;
        }

        public Builder valorOutrasDespesas(Double valorOutrasDespesas) {
            this.valorOutrasDespesas = valorOutrasDespesas;
            return this;
        }

        public Builder valorTotal(Double valorTotal) {
            this.valorTotal = valorTotal;
            return this;
        }

        public Builder valorProdutos(Double valorProdutos) {
            this.valorProdutos = valorProdutos;
            return this;
        }

        public Builder modalidadeFrete(Integer modalidadeFrete) {
            this.modalidadeFrete = modalidadeFrete;
            return this;
        }

        public Builder valorTotalTributos(Double valorTotalTributos) {
            this.valorTotalTributos = valorTotalTributos;
            return this;
        }

        public Builder icmsBaseCalculo(Double icmsBaseCalculo) {
            this.icmsBaseCalculo = icmsBaseCalculo;
            return this;
        }

        public Builder icmsValorTotal(Double icmsValorTotal) {
            this.icmsValorTotal = icmsValorTotal;
            return this;
        }

        public Builder icmsValorTotalDesonerado(Double icmsValorTotalDesonerado) {
            this.icmsValorTotalDesonerado = icmsValorTotalDesonerado;
            return this;
        }

        public Builder fcpValorTotalUfDestino(Double fcpValorTotalUfDestino) {
            this.fcpValorTotalUfDestino = fcpValorTotalUfDestino;
            return this;
        }

        public Builder icmsValorTotalUfDestino(Double icmsValorTotalUfDestino) {
            this.icmsValorTotalUfDestino = icmsValorTotalUfDestino;
            return this;
        }

        public Builder icmsValorTotalUfRemetente(Double icmsValorTotalUfRemetente) {
            this.icmsValorTotalUfRemetente = icmsValorTotalUfRemetente;
            return this;
        }

        public Builder fcpValorTotal(Double fcpValorTotal) {
            this.fcpValorTotal = fcpValorTotal;
            return this;
        }

        public Builder icmsValorTotalSt(Double icmsValorTotalSt) {
            this.icmsValorTotalSt = icmsValorTotalSt;
            return this;
        }

        public Builder fcpValorTotalSt(Double fcpValorTotalSt) {
            this.fcpValorTotalSt = fcpValorTotalSt;
            return this;
        }

        public Builder informacoesAdicionaisContribuinte(String informacoesAdicionaisContribuinte) {
            this.informacoesAdicionaisContribuinte = informacoesAdicionaisContribuinte;
            return this;
        }

        public Builder observacoesContribuinte(List<ObservacaoContribuinte> observacoesContribuinte) {
            this.observacoesContribuinte = observacoesContribuinte;
            return this;
        }

        public Builder informacoesComplementaresInteresseFisco(String informacoesComplementaresInteresseFisco) {
            this.informacoesComplementaresInteresseFisco = informacoesComplementaresInteresseFisco;
            return this;
        }

        public Builder tipoCompraGovernamental(Integer tipoCompraGovernamental) {
            this.tipoCompraGovernamental = tipoCompraGovernamental;
            return this;
        }

        public Builder percReducaoAliquotaCompraGovernamental(Double percReducaoAliquotaCompraGovernamental) {
            this.percReducaoAliquotaCompraGovernamental = percReducaoAliquotaCompraGovernamental;
            return this;
        }

        public Builder tipoOperacaoGovernamental(Integer tipoOperacaoGovernamental) {
            this.tipoOperacaoGovernamental = tipoOperacaoGovernamental;
            return this;
        }

        public Builder items(List<NfeItem> items) {
            this.items = items;
            return this;
        }

        public NfeRequest build() {
            NfeRequest request = new NfeRequest();
            request.naturezaOperacao = this.naturezaOperacao;
            request.serie = this.serie;
            request.numero = this.numero;
            request.dataEmissao = this.dataEmissao;
            request.dataEntradaSaida = this.dataEntradaSaida;
            request.dataPrevisaoEntregaBem = this.dataPrevisaoEntregaBem;
            request.tipoDocumento = this.tipoDocumento;
            request.localDestino = this.localDestino;
            request.municipio = this.municipio;
            request.ibsCbsMunicipio = this.ibsCbsMunicipio;
            request.finalidadeEmissao = this.finalidadeEmissao;
            request.tipoNotaDebito = this.tipoNotaDebito;
            request.tipoNotaCredito = this.tipoNotaCredito;
            request.consumidorFinal = this.consumidorFinal;
            request.presencaComprador = this.presencaComprador;
            request.indicadorIntermediario = this.indicadorIntermediario;
            request.notasReferenciadas = this.notasReferenciadas;
            request.chavesNfeAntecipacaoPagamento = this.chavesNfeAntecipacaoPagamento;
            request.cnpjEmitente = this.cnpjEmitente;
            request.cpfEmitente = this.cpfEmitente;
            request.nomeEmitente = this.nomeEmitente;
            request.nomeFantasiaEmitente = this.nomeFantasiaEmitente;
            request.logradouroEmitente = this.logradouroEmitente;
            request.numeroEmitente = this.numeroEmitente;
            request.complementoEmitente = this.complementoEmitente;
            request.bairroEmitente = this.bairroEmitente;
            request.codigoMunicipioEmitente = this.codigoMunicipioEmitente;
            request.municipioEmitente = this.municipioEmitente;
            request.ufEmitente = this.ufEmitente;
            request.cepEmitente = this.cepEmitente;
            request.telefoneEmitente = this.telefoneEmitente;
            request.inscricaoEstadualEmitente = this.inscricaoEstadualEmitente;
            request.inscricaoEstadualStEmitente = this.inscricaoEstadualStEmitente;
            request.inscricaoMunicipalEmitente = this.inscricaoMunicipalEmitente;
            request.cnaeFiscalEmitente = this.cnaeFiscalEmitente;
            request.regimeTributarioEmitente = this.regimeTributarioEmitente;
            request.cnpjDestinatario = this.cnpjDestinatario;
            request.cpfDestinatario = this.cpfDestinatario;
            request.idEstrangeiroDestinatario = this.idEstrangeiroDestinatario;
            request.nomeDestinatario = this.nomeDestinatario;
            request.logradouroDestinatario = this.logradouroDestinatario;
            request.numeroDestinatario = this.numeroDestinatario;
            request.complementoDestinatario = this.complementoDestinatario;
            request.bairroDestinatario = this.bairroDestinatario;
            request.codigoMunicipioDestinatario = this.codigoMunicipioDestinatario;
            request.municipioDestinatario = this.municipioDestinatario;
            request.ufDestinatario = this.ufDestinatario;
            request.cepDestinatario = this.cepDestinatario;
            request.codigoPaisDestinatario = this.codigoPaisDestinatario;
            request.paisDestinatario = this.paisDestinatario;
            request.telefoneDestinatario = this.telefoneDestinatario;
            request.indicadorInscricaoEstadualDestinatario = this.indicadorInscricaoEstadualDestinatario;
            request.inscricaoEstadualDestinatario = this.inscricaoEstadualDestinatario;
            request.inscricaoSuframaDestinatario = this.inscricaoSuframaDestinatario;
            request.inscricaoMunicipalDestinatario = this.inscricaoMunicipalDestinatario;
            request.emailDestinatario = this.emailDestinatario;
            request.cnpjRetirada = this.cnpjRetirada;
            request.cpfRetirada = this.cpfRetirada;
            request.nomeRetirada = this.nomeRetirada;
            request.logradouroRetirada = this.logradouroRetirada;
            request.numeroRetirada = this.numeroRetirada;
            request.complementoRetirada = this.complementoRetirada;
            request.bairroRetirada = this.bairroRetirada;
            request.codigoMunicipioRetirada = this.codigoMunicipioRetirada;
            request.municipioRetirada = this.municipioRetirada;
            request.ufRetirada = this.ufRetirada;
            request.cepRetirada = this.cepRetirada;
            request.codigoPaisRetirada = this.codigoPaisRetirada;
            request.paisRetirada = this.paisRetirada;
            request.telefoneRetirada = this.telefoneRetirada;
            request.emailRetirada = this.emailRetirada;
            request.inscricaoEstadualRetirada = this.inscricaoEstadualRetirada;
            request.cnpjEntrega = this.cnpjEntrega;
            request.cpfEntrega = this.cpfEntrega;
            request.nomeEntrega = this.nomeEntrega;
            request.logradouroEntrega = this.logradouroEntrega;
            request.numeroEntrega = this.numeroEntrega;
            request.complementoEntrega = this.complementoEntrega;
            request.bairroEntrega = this.bairroEntrega;
            request.codigoMunicipioEntrega = this.codigoMunicipioEntrega;
            request.municipioEntrega = this.municipioEntrega;
            request.ufEntrega = this.ufEntrega;
            request.cepEntrega = this.cepEntrega;
            request.codigoPaisEntrega = this.codigoPaisEntrega;
            request.paisEntrega = this.paisEntrega;
            request.telefoneEntrega = this.telefoneEntrega;
            request.emailEntrega = this.emailEntrega;
            request.inscricaoEstadualEntrega = this.inscricaoEstadualEntrega;
            request.pessoasAutorizadas = this.pessoasAutorizadas;
            request.valorFrete = this.valorFrete;
            request.valorSeguro = this.valorSeguro;
            request.valorDesconto = this.valorDesconto;
            request.valorOutrasDespesas = this.valorOutrasDespesas;
            request.valorTotal = this.valorTotal;
            request.valorProdutos = this.valorProdutos;
            request.modalidadeFrete = this.modalidadeFrete;
            request.valorTotalTributos = this.valorTotalTributos;
            request.icmsBaseCalculo = this.icmsBaseCalculo;
            request.icmsValorTotal = this.icmsValorTotal;
            request.icmsValorTotalDesonerado = this.icmsValorTotalDesonerado;
            request.fcpValorTotalUfDestino = this.fcpValorTotalUfDestino;
            request.icmsValorTotalUfDestino = this.icmsValorTotalUfDestino;
            request.icmsValorTotalUfRemetente = this.icmsValorTotalUfRemetente;
            request.fcpValorTotal = this.fcpValorTotal;
            request.icmsValorTotalSt = this.icmsValorTotalSt;
            request.fcpValorTotalSt = this.fcpValorTotalSt;
            request.informacoesAdicionaisContribuinte = this.informacoesAdicionaisContribuinte;
            request.observacoesContribuinte = this.observacoesContribuinte;
            request.informacoesComplementaresInteresseFisco = this.informacoesComplementaresInteresseFisco;
            request.tipoCompraGovernamental = this.tipoCompraGovernamental;
            request.percReducaoAliquotaCompraGovernamental = this.percReducaoAliquotaCompraGovernamental;
            request.tipoOperacaoGovernamental = this.tipoOperacaoGovernamental;
            request.items = this.items;
            return request;
        }
    }
}
