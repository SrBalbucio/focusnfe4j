package balbucio.focusnfe4j.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FocusNfeValidationError {
    @JsonProperty("caminho")
    private String caminho;

    @JsonProperty("mensagem")
    private String mensagem;

    public String getCaminho() {
        return caminho;
    }

    public String getMensagem() {
        return mensagem;
    }
}

