package balbucio.focusnfe4j.nfe;

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
}
