package balbucio.focusnfe4j.cnpj.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class CnpjResponse {
    @JsonProperty("razao_social")
    private String razaoSocial;

    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("situacao_cadastral")
    private String situacaoCadastral;

    @JsonProperty("cnae_principal")
    private String cnaePrincipal;

    @JsonProperty("optante_simples_nacional")
    private boolean optanteSimplesNacional;

    @JsonProperty("optante_mei")
    private boolean optanteMei;

    @JsonProperty("endereco")
    private EnderecoCnpj endereco;

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getSituacaoCadastral() {
        return situacaoCadastral;
    }

    public String getCnaePrincipal() {
        return cnaePrincipal;
    }

    public boolean isOptanteSimplesNacional() {
        return optanteSimplesNacional;
    }

    public boolean isOptanteMei() {
        return optanteMei;
    }

    public EnderecoCnpj getEndereco() {
        return endereco;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String razaoSocial;
        private String cnpj;
        private String situacaoCadastral;
        private String cnaePrincipal;
        private boolean optanteSimplesNacional;
        private boolean optanteMei;
        private EnderecoCnpj endereco;

        Builder() {
        }

        public Builder razaoSocial(String razaoSocial) {
            this.razaoSocial = razaoSocial;
            return this;
        }

        public Builder cnpj(String cnpj) {
            this.cnpj = cnpj;
            return this;
        }

        public Builder situacaoCadastral(String situacaoCadastral) {
            this.situacaoCadastral = situacaoCadastral;
            return this;
        }

        public Builder cnaePrincipal(String cnaePrincipal) {
            this.cnaePrincipal = cnaePrincipal;
            return this;
        }

        public Builder optanteSimplesNacional(boolean optanteSimplesNacional) {
            this.optanteSimplesNacional = optanteSimplesNacional;
            return this;
        }

        public Builder optanteMei(boolean optanteMei) {
            this.optanteMei = optanteMei;
            return this;
        }

        public Builder endereco(EnderecoCnpj endereco) {
            this.endereco = endereco;
            return this;
        }

        public CnpjResponse build() {
            CnpjResponse response = new CnpjResponse();
            response.razaoSocial = this.razaoSocial;
            response.cnpj = this.cnpj;
            response.situacaoCadastral = this.situacaoCadastral;
            response.cnaePrincipal = this.cnaePrincipal;
            response.optanteSimplesNacional = this.optanteSimplesNacional;
            response.optanteMei = this.optanteMei;
            response.endereco = this.endereco;
            return response;
        }
    }
}
