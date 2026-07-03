package balbucio.focusnfe4j.nfe.model;

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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String chaveNfe;
        private String siglaUf;
        private Integer mes;
        private String cnpj;
        private Integer modelo;
        private Integer serie;
        private Integer numero;
        private String ufNfProdutor;
        private Integer mesNfProdutor;
        private String cnpjNfProdutor;
        private String cpfNfProdutor;
        private String inscricaoEstadualNfProdutor;
        private String modeloNfProdutor;
        private Integer serieNfProdutor;
        private Integer numeroNfProdutor;
        private String chaveCte;
        private String modeloEcf;
        private Integer numeroEcf;
        private Integer coo;

        Builder() {
        }

        public Builder chaveNfe(String chaveNfe) {
            this.chaveNfe = chaveNfe;
            return this;
        }

        public Builder siglaUf(String siglaUf) {
            this.siglaUf = siglaUf;
            return this;
        }

        public Builder mes(Integer mes) {
            this.mes = mes;
            return this;
        }

        public Builder cnpj(String cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public Builder modelo(Integer modelo) {
            this.modelo = modelo;
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

        public Builder ufNfProdutor(String ufNfProdutor) {
            this.ufNfProdutor = ufNfProdutor;
            return this;
        }

        public Builder mesNfProdutor(Integer mesNfProdutor) {
            this.mesNfProdutor = mesNfProdutor;
            return this;
        }

        public Builder cnpjNfProdutor(String cnpjNfProdutor) {
            this.cnpjNfProdutor = cnpjNfProdutor;
            return this;
        }

        public Builder cpfNfProdutor(String cpfNfProdutor) {
            this.cpfNfProdutor = cpfNfProdutor;
            return this;
        }

        public Builder inscricaoEstadualNfProdutor(String inscricaoEstadualNfProdutor) {
            this.inscricaoEstadualNfProdutor = inscricaoEstadualNfProdutor;
            return this;
        }

        public Builder modeloNfProdutor(String modeloNfProdutor) {
            this.modeloNfProdutor = modeloNfProdutor;
            return this;
        }

        public Builder serieNfProdutor(Integer serieNfProdutor) {
            this.serieNfProdutor = serieNfProdutor;
            return this;
        }

        public Builder numeroNfProdutor(Integer numeroNfProdutor) {
            this.numeroNfProdutor = numeroNfProdutor;
            return this;
        }

        public Builder chaveCte(String chaveCte) {
            this.chaveCte = chaveCte;
            return this;
        }

        public Builder modeloEcf(String modeloEcf) {
            this.modeloEcf = modeloEcf;
            return this;
        }

        public Builder numeroEcf(Integer numeroEcf) {
            this.numeroEcf = numeroEcf;
            return this;
        }

        public Builder coo(Integer coo) {
            this.coo = coo;
            return this;
        }

        public NotaReferenciada build() {
            NotaReferenciada nota = new NotaReferenciada();
            nota.chaveNfe = this.chaveNfe;
            nota.siglaUf = this.siglaUf;
            nota.mes = this.mes;
            nota.cnpj = this.cnpj;
            nota.modelo = this.modelo;
            nota.serie = this.serie;
            nota.numero = this.numero;
            nota.ufNfProdutor = this.ufNfProdutor;
            nota.mesNfProdutor = this.mesNfProdutor;
            nota.cnpjNfProdutor = this.cnpjNfProdutor;
            nota.cpfNfProdutor = this.cpfNfProdutor;
            nota.inscricaoEstadualNfProdutor = this.inscricaoEstadualNfProdutor;
            nota.modeloNfProdutor = this.modeloNfProdutor;
            nota.serieNfProdutor = this.serieNfProdutor;
            nota.numeroNfProdutor = this.numeroNfProdutor;
            nota.chaveCte = this.chaveCte;
            nota.modeloEcf = this.modeloEcf;
            nota.numeroEcf = this.numeroEcf;
            nota.coo = this.coo;
            return nota;
        }
    }
}
