package balbucio.focusnfe4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CancelRequest {
    @JsonProperty("justificativa")
    private final String justificativa;

    public CancelRequest(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String justificativa;

        Builder() {
        }

        public Builder justificativa(String justificativa) {
            this.justificativa = justificativa;
            return this;
        }

        public CancelRequest build() {
            return new CancelRequest(justificativa);
        }
    }
}

