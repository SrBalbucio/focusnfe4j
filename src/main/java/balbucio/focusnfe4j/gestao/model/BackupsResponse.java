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
}

