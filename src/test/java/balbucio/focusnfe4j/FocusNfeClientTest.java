package balbucio.focusnfe4j;

import balbucio.focusnfe4j.testutil.TestHttpServer;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

import static org.junit.jupiter.api.Assertions.*;

public class FocusNfeClientTest {

    @Test
    void addsBasicAuthHeader() throws Exception {
        try (TestHttpServer srv = TestHttpServer.start(0, ex -> {
            byte[] bytes = "{}".getBytes(StandardCharsets.UTF_8);
            ex.getResponseHeaders().add("Content-Type", "application/json");
            ex.sendResponseHeaders(200, bytes.length);
            ex.getResponseBody().write(bytes);
            ex.close();
        })) {
            String token = "my-token";
            FocusNfeClient client = FocusNfeClient.builder()
                    .baseUri(srv.baseUri())
                    .token(token)
                    .build();

            client.sendJson("GET", "/ping", null, null);

            TestHttpServer.CapturedRequest req = srv.awaitRequest(2000);
            String expected = "Basic " + Base64.getEncoder()
                    .encodeToString((token + ":").getBytes(StandardCharsets.UTF_8));
            assertEquals(expected, req.headers.get("Authorization").get(0));
        }
    }
}

