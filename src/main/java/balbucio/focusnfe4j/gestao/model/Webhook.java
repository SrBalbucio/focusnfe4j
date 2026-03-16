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
}

