package balbucio.focusnfe4j;

import balbucio.focusnfe4j.gestao.BlockedEmailsService;
import balbucio.focusnfe4j.gestao.model.BlockedEmailStatus;
import balbucio.focusnfe4j.testutil.TestHttpServer;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class GestaoBlockedEmailsServiceTest {

    @Test
    void consultarEncodesEmailInPath() throws Exception {
        try (TestHttpServer srv = TestHttpServer.start(0, ex -> {
            byte[] bytes = ("{\"email\":\"test@example.com\",\"block_type\":\"hard\",\"bounce_type\":\"permanent\",\"diagnostic_code\":\"x\",\"blocked_at\":\"2023-08-01T10:15:30-03:00\"}")
                    .getBytes(StandardCharsets.UTF_8);
            ex.getResponseHeaders().add("Content-Type", "application/json");
            ex.sendResponseHeaders(200, bytes.length);
            ex.getResponseBody().write(bytes);
            ex.close();
        })) {
            FocusNfeClient client = FocusNfeClient.builder()
                    .baseUri(srv.baseUri())
                    .token("t")
                    .build();

            BlockedEmailsService svc = new BlockedEmailsService(client, srv.baseUri());
            BlockedEmailStatus status = svc.consultar("test@example.com");
            assertEquals("test@example.com", status.getEmail());
            assertNotNull(status.getBlockedAt());

            TestHttpServer.CapturedRequest captured = srv.awaitRequest(2000);
            assertEquals("GET", captured.method);
            assertEquals("/v2/blocked_emails/test%40example.com", captured.uri.getRawPath());
        }
    }
}


