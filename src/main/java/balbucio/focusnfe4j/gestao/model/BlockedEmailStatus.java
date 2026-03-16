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
}

