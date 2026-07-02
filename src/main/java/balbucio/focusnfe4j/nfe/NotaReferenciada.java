package balbucio.focusnfe4j.nfe;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class NotaReferenciada {

    @JsonProperty("chave_nfe")
    private String chaveNfe;

    @JsonProperty("sigla_uf")
    private String siglaUf;

    @JsonProperty("mes")
    private Integer mes;

    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("modelo")
    private Integer modelo;

    @JsonProperty("serie")
    private Integer serie;

    @JsonProperty("numero")
    private Integer numero;

    @JsonProperty("uf_nf_produtor")
    private String ufNfProdutor;

    @JsonProperty("mes_nf_produtor")
    private Integer mesNfProdutor;

    @JsonProperty("cnpj_nf_produtor")
    private String cnpjNfProdutor;

    @JsonProperty("cpf_nf_produtor")
    private String cpfNfProdutor;

    @JsonProperty("inscricao_estadual_nf_produtor")
    private String inscricaoEstadualNfProdutor;

    @JsonProperty("modelo_nf_produtor")
    private String modeloNfProdutor;

    @JsonProperty("serie_nf_produtor")
    private Integer serieNfProdutor;

    @JsonProperty("numero_nf_produtor")
    private Integer numeroNfProdutor;

    @JsonProperty("chave_cte")
    private String chaveCte;

    @JsonProperty("modelo_ecf")
    private String modeloEcf;

    @JsonProperty("numero_ecf")
    private Integer numeroEcf;

    @JsonProperty("coo")
    private Integer coo;

    public String getChaveNfe() {
        return chaveNfe;
    }

    public void setChaveNfe(String chaveNfe) {
        this.chaveNfe = chaveNfe;
    }

    public String getSiglaUf() {
        return siglaUf;
    }

    public void setSiglaUf(String siglaUf) {
        this.siglaUf = siglaUf;
    }

    public Integer getMes() {
        return mes;
    }

    public void setMes(Integer mes) {
        this.mes = mes;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
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

    public String getUfNfProdutor() {
        return ufNfProdutor;
    }

    public void setUfNfProdutor(String ufNfProdutor) {
        this.ufNfProdutor = ufNfProdutor;
    }

    public Integer getMesNfProdutor() {
        return mesNfProdutor;
    }

    public void setMesNfProdutor(Integer mesNfProdutor) {
        this.mesNfProdutor = mesNfProdutor;
    }

    public String getCnpjNfProdutor() {
        return cnpjNfProdutor;
    }

    public void setCnpjNfProdutor(String cnpjNfProdutor) {
        this.cnpjNfProdutor = cnpjNfProdutor;
    }

    public String getCpfNfProdutor() {
        return cpfNfProdutor;
    }

    public void setCpfNfProdutor(String cpfNfProdutor) {
        this.cpfNfProdutor = cpfNfProdutor;
    }

    public String getInscricaoEstadualNfProdutor() {
        return inscricaoEstadualNfProdutor;
    }

    public void setInscricaoEstadualNfProdutor(String inscricaoEstadualNfProdutor) {
        this.inscricaoEstadualNfProdutor = inscricaoEstadualNfProdutor;
    }

    public String getModeloNfProdutor() {
        return modeloNfProdutor;
    }

    public void setModeloNfProdutor(String modeloNfProdutor) {
        this.modeloNfProdutor = modeloNfProdutor;
    }

    public Integer getSerieNfProdutor() {
        return serieNfProdutor;
    }

    public void setSerieNfProdutor(Integer serieNfProdutor) {
        this.serieNfProdutor = serieNfProdutor;
    }

    public Integer getNumeroNfProdutor() {
        return numeroNfProdutor;
    }

    public void setNumeroNfProdutor(Integer numeroNfProdutor) {
        this.numeroNfProdutor = numeroNfProdutor;
    }

    public String getChaveCte() {
        return chaveCte;
    }

    public void setChaveCte(String chaveCte) {
        this.chaveCte = chaveCte;
    }

    public String getModeloEcf() {
        return modeloEcf;
    }

    public void setModeloEcf(String modeloEcf) {
        this.modeloEcf = modeloEcf;
    }

    public Integer getNumeroEcf() {
        return numeroEcf;
    }

    public void setNumeroEcf(Integer numeroEcf) {
        this.numeroEcf = numeroEcf;
    }

    public Integer getCoo() {
        return coo;
    }

    public void setCoo(Integer coo) {
        this.coo = coo;
    }
}
