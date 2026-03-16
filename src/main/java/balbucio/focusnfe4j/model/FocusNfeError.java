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
}

