package balbucio.focusnfe4j;

import balbucio.focusnfe4j.nfe.NfeRequest;
import balbucio.focusnfe4j.nfe.NfeStatusResponse;
import balbucio.focusnfe4j.testutil.TestHttpServer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class NfeServiceTest {

    @Test
    void emitirUsesPostV2NfeWithRefQueryAndBody() throws Exception {
        try (TestHttpServer srv = TestHttpServer.start(0, ex -> {
            byte[] bytes = "{\"cnpj_emitente\":\"123\",\"ref\":\"abc\",\"status\":\"processando_autorizacao\"}"
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

            NfeRequest payload = new NfeRequest();
            payload.setNaturezaOperacao("foo");
            NfeStatusResponse resp = client.nfe().emitir("abc", payload);

            assertEquals("abc", resp.getRef());
            assertEquals("processando_autorizacao", resp.getStatus());

            TestHttpServer.CapturedRequest req = srv.awaitRequest(2000);
            assertEquals("POST", req.method);
            assertEquals("/v2/nfe", req.uri.getPath());
            assertTrue(req.uri.getQuery().contains("ref=abc"));

            ObjectMapper om = client.getObjectMapper();
            assertEquals("foo", om.readTree(req.body).get("natureza_operacao").asText());
        }
    }
}

