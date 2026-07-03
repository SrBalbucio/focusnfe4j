package balbucio.focusnfe4j.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class FocusNfeError {
    @JsonProperty("codigo")
    private String codigo;

    @JsonProperty("mensagem")
    private String mensagem;

    @JsonProperty("erros")
    private List<FocusNfeValidationError> erros;

    public String getCodigo() {
        return codigo;
    }

    public String getMensagem() {
        return mensagem;
    }

    public List<FocusNfeValidationError> getErros() {
        return erros;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String codigo;
        private String mensagem;
        private List<FocusNfeValidationError> erros;

        Builder() {
        }

        public Builder codigo(String codigo) {
            this.codigo = codigo;
            return this;
        }

        public Builder mensagem(String mensagem) {
            this.mensagem = mensagem;
            return this;
        }

        public Builder erros(List<FocusNfeValidationError> erros) {
            this.erros = erros;
            return this;
        }

        public FocusNfeError build() {
            FocusNfeError error = new FocusNfeError();
            error.codigo = this.codigo;
            error.mensagem = this.mensagem;
            error.erros = this.erros;
            return error;
        }
    }
}

