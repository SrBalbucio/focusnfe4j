package balbucio.focusnfe4j.gestao.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BackupsResponse {
    @JsonProperty("backups")
    private List<BackupItem> backups;

    public List<BackupItem> getBackups() {
        return backups;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private List<BackupItem> backups;

        Builder() {
        }

        public Builder backups(List<BackupItem> backups) {
            this.backups = backups;
            return this;
        }

        public BackupsResponse build() {
            BackupsResponse response = new BackupsResponse();
            response.backups = this.backups;
            return response;
        }
    }
}

