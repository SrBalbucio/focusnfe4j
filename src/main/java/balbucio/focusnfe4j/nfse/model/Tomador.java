package balbucio.focusnfe4j.nfse.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Tomador {

    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("nif")
    private String nif;

    @JsonProperty("motivo_ausencia_nif")
    private String motivoAusenciaNif;

    @JsonProperty("inscricao_municipal")
    private String inscricaoMunicipal;

    @JsonProperty("razao_social")
    private String razaoSocial;

    @JsonProperty("telefone")
    private String telefone;

    @JsonProperty("email")
    private String email;

    @JsonProperty("endereco")
    private EnderecoTomador endereco;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getMotivoAusenciaNif() {
        return motivoAusenciaNif;
    }

    public void setMotivoAusenciaNif(String motivoAusenciaNif) {
        this.motivoAusenciaNif = motivoAusenciaNif;
    }

    public String getInscricaoMunicipal() {
        return inscricaoMunicipal;
    }

    public void setInscricaoMunicipal(String inscricaoMunicipal) {
        this.inscricaoMunicipal = inscricaoMunicipal;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public EnderecoTomador getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoTomador endereco) {
        this.endereco = endereco;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String cpf;
        private String cnpj;
        private String nif;
        private String motivoAusenciaNif;
        private String inscricaoMunicipal;
        private String razaoSocial;
        private String telefone;
        private String email;
        private EnderecoTomador endereco;

        Builder() {
        }

        public Builder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public Builder cnpj(String cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public Builder nif(String nif) {
            this.nif = nif;
            return this;
        }

        public Builder motivoAusenciaNif(String motivoAusenciaNif) {
            this.motivoAusenciaNif = motivoAusenciaNif;
            return this;
        }

        public Builder inscricaoMunicipal(String inscricaoMunicipal) {
            this.inscricaoMunicipal = inscricaoMunicipal;
            return this;
        }

        public Builder razaoSocial(String razaoSocial) {
            this.razaoSocial = razaoSocial;
            return this;
        }

        public Builder telefone(String telefone) {
            this.telefone = telefone;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder endereco(EnderecoTomador endereco) {
            this.endereco = endereco;
            return this;
        }

        public Tomador build() {
            Tomador tomador = new Tomador();
            tomador.cpf = this.cpf;
            tomador.cnpj = this.cnpj;
            tomador.nif = this.nif;
            tomador.motivoAusenciaNif = this.motivoAusenciaNif;
            tomador.inscricaoMunicipal = this.inscricaoMunicipal;
            tomador.razaoSocial = this.razaoSocial;
            tomador.telefone = this.telefone;
            tomador.email = this.email;
            tomador.endereco = this.endereco;
            return tomador;
        }
    }
}
