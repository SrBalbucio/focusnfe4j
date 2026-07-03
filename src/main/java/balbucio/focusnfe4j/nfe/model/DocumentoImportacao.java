package balbucio.focusnfe4j.nfe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class DocumentoImportacao {

    @JsonProperty("numero")
    private String numero;

    @JsonProperty("data_registro")
    private String dataRegistro;

    @JsonProperty("local_desembaraco_aduaneiro")
    private String localDesembaracoAduaneiro;

    @JsonProperty("uf_desembaraco_aduaneiro")
    private String ufDesembaracoAduaneiro;

    @JsonProperty("data_desembaraco_aduaneiro")
    private String dataDesembaracoAduaneiro;

    @JsonProperty("via_transporte")
    private Integer viaTransporte;

    @JsonProperty("valor_afrmm")
    private Double valorAfrmm;

    @JsonProperty("forma_intermedio")
    private Integer formaIntermedio;

    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("uf_terceiro")
    private String ufTerceiro;

    @JsonProperty("codigo_exportador")
    private String codigoExportador;

    @JsonProperty("adicoes")
    private List<Adicao> adicoes;

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getLocalDesembaracoAduaneiro() {
        return localDesembaracoAduaneiro;
    }

    public void setLocalDesembaracoAduaneiro(String localDesembaracoAduaneiro) {
        this.localDesembaracoAduaneiro = localDesembaracoAduaneiro;
    }

    public String getUfDesembaracoAduaneiro() {
        return ufDesembaracoAduaneiro;
    }

    public void setUfDesembaracoAduaneiro(String ufDesembaracoAduaneiro) {
        this.ufDesembaracoAduaneiro = ufDesembaracoAduaneiro;
    }

    public String getDataDesembaracoAduaneiro() {
        return dataDesembaracoAduaneiro;
    }

    public void setDataDesembaracoAduaneiro(String dataDesembaracoAduaneiro) {
        this.dataDesembaracoAduaneiro = dataDesembaracoAduaneiro;
    }

    public Integer getViaTransporte() {
        return viaTransporte;
    }

    public void setViaTransporte(Integer viaTransporte) {
        this.viaTransporte = viaTransporte;
    }

    public Double getValorAfrmm() {
        return valorAfrmm;
    }

    public void setValorAfrmm(Double valorAfrmm) {
        this.valorAfrmm = valorAfrmm;
    }

    public Integer getFormaIntermedio() {
        return formaIntermedio;
    }

    public void setFormaIntermedio(Integer formaIntermedio) {
        this.formaIntermedio = formaIntermedio;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getUfTerceiro() {
        return ufTerceiro;
    }

    public void setUfTerceiro(String ufTerceiro) {
        this.ufTerceiro = ufTerceiro;
    }

    public String getCodigoExportador() {
        return codigoExportador;
    }

    public void setCodigoExportador(String codigoExportador) {
        this.codigoExportador = codigoExportador;
    }

    public List<Adicao> getAdicoes() {
        return adicoes;
    }

    public void setAdicoes(List<Adicao> adicoes) {
        this.adicoes = adicoes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String numero;
        private String dataRegistro;
        private String localDesembaracoAduaneiro;
        private String ufDesembaracoAduaneiro;
        private String dataDesembaracoAduaneiro;
        private Integer viaTransporte;
        private Double valorAfrmm;
        private Integer formaIntermedio;
        private String cnpj;
        private String cpf;
        private String ufTerceiro;
        private String codigoExportador;
        private List<Adicao> adicoes;

        Builder() {
        }

        public Builder numero(String numero) {
            this.numero = numero;
            return this;
        }

        public Builder dataRegistro(String dataRegistro) {
            this.dataRegistro = dataRegistro;
            return this;
        }

        public Builder localDesembaracoAduaneiro(String localDesembaracoAduaneiro) {
            this.localDesembaracoAduaneiro = localDesembaracoAduaneiro;
            return this;
        }

        public Builder ufDesembaracoAduaneiro(String ufDesembaracoAduaneiro) {
            this.ufDesembaracoAduaneiro = ufDesembaracoAduaneiro;
            return this;
        }

        public Builder dataDesembaracoAduaneiro(String dataDesembaracoAduaneiro) {
            this.dataDesembaracoAduaneiro = dataDesembaracoAduaneiro;
            return this;
        }

        public Builder viaTransporte(Integer viaTransporte) {
            this.viaTransporte = viaTransporte;
            return this;
        }

        public Builder valorAfrmm(Double valorAfrmm) {
            this.valorAfrmm = valorAfrmm;
            return this;
        }

        public Builder formaIntermedio(Integer formaIntermedio) {
            this.formaIntermedio = formaIntermedio;
            return this;
        }

        public Builder cnpj(String cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public Builder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder ufTerceiro(String ufTerceiro) {
            this.ufTerceiro = ufTerceiro;
            return this;
        }

        public Builder codigoExportador(String codigoExportador) {
            this.codigoExportador = codigoExportador;
            return this;
        }

        public Builder adicoes(List<Adicao> adicoes) {
            this.adicoes = adicoes;
            return this;
        }

        public DocumentoImportacao build() {
            DocumentoImportacao doc = new DocumentoImportacao();
            doc.numero = this.numero;
            doc.dataRegistro = this.dataRegistro;
            doc.localDesembaracoAduaneiro = this.localDesembaracoAduaneiro;
            doc.ufDesembaracoAduaneiro = this.ufDesembaracoAduaneiro;
            doc.dataDesembaracoAduaneiro = this.dataDesembaracoAduaneiro;
            doc.viaTransporte = this.viaTransporte;
            doc.valorAfrmm = this.valorAfrmm;
            doc.formaIntermedio = this.formaIntermedio;
            doc.cnpj = this.cnpj;
            doc.cpf = this.cpf;
            doc.ufTerceiro = this.ufTerceiro;
            doc.codigoExportador = this.codigoExportador;
            doc.adicoes = this.adicoes;
            return doc;
        }
    }
}
