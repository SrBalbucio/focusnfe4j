package balbucio.focusnfe4j.gestao.model;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Request para POST /v2/hooks.
 */
public class WebhookCreateRequest {
    @JsonProperty("cnpj")
    private String cnpj;

    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("event")
    private String event;

    @JsonProperty("url")
    private String url;

    @JsonProperty("authorization")
    private String authorization;

    @JsonProperty("authorization_header")
    private String authorizationHeader;

    public WebhookCreateRequest() {
    }

    public String getCnpj() {
        return cnpj;
    }

    public WebhookCreateRequest setCnpj(String cnpj) {
        this.cnpj = cnpj;
        return this;
    }

    public String getCpf() {
        return cpf;
    }

    public WebhookCreateRequest setCpf(String cpf) {
        this.cpf = cpf;
        return this;
    }

    public String getEvent() {
        return event;
    }

    public WebhookCreateRequest setEvent(String event) {
        this.event = event;
        return this;
    }

    public String getUrl() {
        return url;
    }

    public WebhookCreateRequest setUrl(String url) {
        this.url = url;
        return this;
    }

    public String getAuthorization() {
        return authorization;
    }

    public WebhookCreateRequest setAuthorization(String authorization) {
        this.authorization = authorization;
        return this;
    }

    public String getAuthorizationHeader() {
        return authorizationHeader;
    }

    public WebhookCreateRequest setAuthorizationHeader(String authorizationHeader) {
        this.authorizationHeader = authorizationHeader;
        return this;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String cnpj;
        private String cpf;
        private String event;
        private String url;
        private String authorization;
        private String authorizationHeader;

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

        public Builder event(String event) {
            this.event = event;
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

        public WebhookCreateRequest build() {
            WebhookCreateRequest request = new WebhookCreateRequest();
            request.cnpj = this.cnpj;
            request.cpf = this.cpf;
            request.event = this.event;
            request.url = this.url;
            request.authorization = this.authorization;
            request.authorizationHeader = this.authorizationHeader;
            return request;
        }
    }
}

