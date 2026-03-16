package balbucio.focusnfe4j;

import balbucio.focusnfe4j.gestao.model.BackupsResponse;
import balbucio.focusnfe4j.testutil.TestHttpServer;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class GestaoBackupsServiceTest {
    @Test
    void listarBackupsUsesGetV2BackupsCnpjJson() throws Exception {
        try (TestHttpServer srv = TestHttpServer.start(0, ex -> {
            byte[] bytes = ("{\"backups\":[{\"mes\":\"2024-01\",\"danfes\":\"/danfes.zip\",\"xmls\":\"/xmls.zip\"}]}" )
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

            BackupsResponse resp = client.gestao().backups().listar("12345678000199");
            assertNotNull(resp.getBackups());
            assertEquals(1, resp.getBackups().size());
            assertEquals("2024-01", resp.getBackups().get(0).getMes());

            TestHttpServer.CapturedRequest req = srv.awaitRequest(2000);
            assertEquals("GET", req.method);
            assertEquals("/v2/backups/12345678000199.json", req.uri.getPath());
        }
    }
}

