package balbucio.focusnfe4j.gestao.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BlockedEmailStatus {
    @JsonProperty("email")
    private String email;

    @JsonProperty("block_type")
    private String blockType;

    @JsonProperty("bounce_type")
    private String bounceType;

    @JsonProperty("diagnostic_code")
    private String diagnosticCode;

    @JsonProperty("blocked_at")
    private OffsetDateTime blockedAt;

    public String getEmail() {
        return email;
    }

    public String getBlockType() {
        return blockType;
    }

    public String getBounceType() {
        return bounceType;
    }

    public String getDiagnosticCode() {
        return diagnosticCode;
    }

    public OffsetDateTime getBlockedAt() {
        return blockedAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String email;
        private String blockType;
        private String bounceType;
        private String diagnosticCode;
        private OffsetDateTime blockedAt;

        Builder() {
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder blockType(String blockType) {
            this.blockType = blockType;
            return this;
        }

        public Builder bounceType(String bounceType) {
            this.bounceType = bounceType;
            return this;
        }

        public Builder diagnosticCode(String diagnosticCode) {
            this.diagnosticCode = diagnosticCode;
            return this;
        }

        public Builder blockedAt(OffsetDateTime blockedAt) {
            this.blockedAt = blockedAt;
            return this;
        }

        public BlockedEmailStatus build() {
            BlockedEmailStatus status = new BlockedEmailStatus();
            status.email = this.email;
            status.blockType = this.blockType;
            status.bounceType = this.bounceType;
            status.diagnosticCode = this.diagnosticCode;
            status.blockedAt = this.blockedAt;
            return status;
        }
    }
}

