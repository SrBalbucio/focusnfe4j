package balbucio.focusnfe4j;

import balbucio.focusnfe4j.nfse.NfseStatusResponse;
import balbucio.focusnfe4j.testutil.TestHttpServer;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class NfseServiceTest {

    @Test
    void cancelarUsesDeleteWithJustificativaBody() throws Exception {
        try (TestHttpServer srv = TestHttpServer.start(0, ex -> {
            byte[] bytes = "{\"cnpj_emitente\":\"123\",\"ref\":\"abc\",\"status\":\"cancelado\"}"
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

            NfseStatusResponse resp = client.nfse().cancelar("abc", "Erro de teste");
            assertEquals("cancelado", resp.getStatus());

            TestHttpServer.CapturedRequest req = srv.awaitRequest(2000);
            assertEquals("DELETE", req.method);
            assertEquals("/v2/nfse/abc", req.uri.getPath());
            assertTrue(req.body.contains("justificativa"));
            assertTrue(req.body.contains("Erro de teste"));
        }
    }
}

