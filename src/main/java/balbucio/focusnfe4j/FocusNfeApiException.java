package balbucio.focusnfe4j;

import balbucio.focusnfe4j.model.FocusNfeError;

/**
 * Thrown when FocusNFE returns a non-2xx HTTP status.
 */
public class FocusNfeApiException extends FocusNfeException {
    private final int statusCode;
    private final String responseBody;
    private final FocusNfeError error;

    public FocusNfeApiException(String message, int statusCode, String responseBody, FocusNfeError error) {
        super(message);
        this.statusCode = statusCode;
        this.responseBody = responseBody;
        this.error = error;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public FocusNfeError getError() {
        return error;
    }
}

