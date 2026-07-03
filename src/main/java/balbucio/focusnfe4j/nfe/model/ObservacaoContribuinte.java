package balbucio.focusnfe4j.nfe.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ObservacaoContribuinte {

    @JsonProperty("campo")
    private String campo;

    @JsonProperty("texto")
    private String texto;

    public String getCampo() {
        return campo;
    }

    public void setCampo(String campo) {
        this.campo = campo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String campo;
        private String texto;

        Builder() {
        }

        public Builder campo(String campo) {
            this.campo = campo;
            return this;
        }

        public Builder texto(String texto) {
            this.texto = texto;
            return this;
        }

        public ObservacaoContribuinte build() {
            ObservacaoContribuinte obs = new ObservacaoContribuinte();
            obs.campo = this.campo;
            obs.texto = this.texto;
            return obs;
        }
    }
}
