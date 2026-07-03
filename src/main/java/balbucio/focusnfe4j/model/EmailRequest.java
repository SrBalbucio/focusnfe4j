package balbucio.focusnfe4j.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class EmailRequest {
    @JsonProperty("emails")
    private final List<String> emails;

    public EmailRequest(List<String> emails) {
        this.emails = emails;
    }

    public List<String> getEmails() {
        return emails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private List<String> emails;

        Builder() {
        }

        public Builder emails(List<String> emails) {
            this.emails = emails;
            return this;
        }

        public EmailRequest build() {
            return new EmailRequest(emails);
        }
    }
}

