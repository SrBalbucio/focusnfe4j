package balbucio.focusnfe4j.gestao;

import balbucio.focusnfe4j.FocusNfeClient;

/**
 * Categoria: Gestao.
 */
public class GestaoService {
    private final BackupsService backupsService;
    private final WebhooksService webhooksService;
    private final BlockedEmailsService blockedEmailsService;

    public GestaoService(FocusNfeClient client) {
        this.backupsService = new BackupsService(client);
        this.webhooksService = new WebhooksService(client);
        this.blockedEmailsService = new BlockedEmailsService(client);
    }

    public BackupsService backups() {
        return backupsService;
    }

    public WebhooksService webhooks() {
        return webhooksService;
    }

    public BlockedEmailsService blockedEmails() {
        return blockedEmailsService;
    }
}

