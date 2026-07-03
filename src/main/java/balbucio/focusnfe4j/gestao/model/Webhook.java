package balbucio.focusnfe4j.gestao.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Webhook {
    @JsonProperty("id")
    private String id;

    @JsonProperty("url")
    private String url;

    @JsonProperty("authorization")
    private String authorization;

    @JsonProperty("authorization_header")
    private String authorizationHeader;

    @JsonProperty("event")
    private String event;

    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("empresa_id")
    private String empresaId;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("request_count")
    private Integer requestCount;

    @JsonProperty("success_count")
    private Integer successCount;

    @JsonProperty("failure_count")
    private Integer failureCount;

    @JsonProperty("deleted")
    private Boolean deleted;

    public String getId() {
        return id;
    }

    public String getUrl() {
        return url;
    }

    public String getAuthorization() {
        return authorization;
    }

    public String getAuthorizationHeader() {
        return authorizationHeader;
    }

    public String getEvent() {
        return event;
    }

    public String getCnpj() {
        return cnpj;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEmpresaId() {
        return empresaId;
    }

    public String getNome() {
        return nome;
    }

    public Integer getRequestCount() {
        return requestCount;
    }

    public Integer getSuccessCount() {
        return successCount;
    }

    public Integer getFailureCount() {
        return failureCount;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String id;
        private String url;
        private String authorization;
        private String authorizationHeader;
        private String event;
        private String cnpj;
        private String cpf;
        private String empresaId;
        private String nome;
        private Integer requestCount;
        private Integer successCount;
        private Integer failureCount;
        private Boolean deleted;

        Builder() {
        }

        public Builder id(String id) {
            this.id = id;
            return this;
        }

        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public Builder authorization(String authorization) {
            this.authorization = authorization;
            return this;
        }

        public Builder authorizationHeader(String authorizationHeader) {
            this.authorizationHeader = authorizationHeader;
            return this;
        }

        public Builder event(String event) {
            this.event = event;
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

        public Builder empresaId(String empresaId) {
            this.empresaId = empresaId;
            return this;
        }

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder requestCount(Integer requestCount) {
            this.requestCount = requestCount;
            return this;
        }

        public Builder successCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }

        public Builder failureCount(Integer failureCount) {
            this.failureCount = failureCount;
            return this;
        }

        public Builder deleted(Boolean deleted) {
            this.deleted = deleted;
            return this;
        }

        public Webhook build() {
            Webhook webhook = new Webhook();
            webhook.id = this.id;
            webhook.url = this.url;
            webhook.authorization = this.authorization;
            webhook.authorizationHeader = this.authorizationHeader;
            webhook.event = this.event;
            webhook.cnpj = this.cnpj;
            webhook.cpf = this.cpf;
            webhook.empresaId = this.empresaId;
            webhook.nome = this.nome;
            webhook.requestCount = this.requestCount;
            webhook.successCount = this.successCount;
            webhook.failureCount = this.failureCount;
            webhook.deleted = this.deleted;
            return webhook;
        }
    }
}

