package balbucio.focusnfe4j.nfe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class PessoaAutorizada {

    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("cpf")
    private String cpf;

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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String cnpj;
        private String cpf;

        Builder() {
        }

        public Builder cnpj(String cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public Builder cpf(String cpf) {
            this.cpf = cpf;
            return this;
        }

        public PessoaAutorizada build() {
            PessoaAutorizada pessoa = new PessoaAutorizada();
            pessoa.cnpj = this.cnpj;
            pessoa.cpf = this.cpf;
            return pessoa;
        }
    }
}
