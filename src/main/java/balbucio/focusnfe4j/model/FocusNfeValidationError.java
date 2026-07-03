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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String caminho;
        private String mensagem;

        Builder() {
        }

        public Builder caminho(String caminho) {
            this.caminho = caminho;
            return this;
        }

        public Builder mensagem(String mensagem) {
            this.mensagem = mensagem;
            return this;
        }

        public FocusNfeValidationError build() {
            FocusNfeValidationError error = new FocusNfeValidationError();
            error.caminho = this.caminho;
            error.mensagem = this.mensagem;
            return error;
        }
    }
}

