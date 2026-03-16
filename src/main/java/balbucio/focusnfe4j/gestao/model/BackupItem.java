package balbucio.focusnfe4j.gestao.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BackupItem {
    @JsonProperty("mes")
    private String mes;

    @JsonProperty("danfes")
    private String danfes;

    @JsonProperty("xmls")
    private String xmls;

    public String getMes() {
        return mes;
    }

    public String getDanfes() {
        return danfes;
    }

    public String getXmls() {
        return xmls;
    }
}

