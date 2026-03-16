package balbucio.focusnfe4j;

import java.net.URI;

/**
 * Environments known by FocusNFE.
 */
public enum FocusNfeEnvironment {
    PRODUCTION(URI.create("https://api.focusnfe.com.br")),
    HOMOLOGATION(URI.create("https://homologacao.focusnfe.com.br"));

    private final URI baseUri;

    FocusNfeEnvironment(URI baseUri) {
        this.baseUri = baseUri;
    }

    public URI getBaseUri() {
        return baseUri;
    }
}

