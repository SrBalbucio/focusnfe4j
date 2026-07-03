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

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private String mes;
        private String danfes;
        private String xmls;

        Builder() {
        }

        public Builder mes(String mes) {
            this.mes = mes;
            return this;
        }

        public Builder danfes(String danfes) {
            this.danfes = danfes;
            return this;
        }

        public Builder xmls(String xmls) {
            this.xmls = xmls;
            return this;
        }

        public BackupItem build() {
            BackupItem item = new BackupItem();
            item.mes = this.mes;
            item.danfes = this.danfes;
            item.xmls = this.xmls;
            return item;
        }
    }
}

