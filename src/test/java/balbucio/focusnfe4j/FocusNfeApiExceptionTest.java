package balbucio.focusnfe4j;

import balbucio.focusnfe4j.testutil.TestHttpServer;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class FocusNfeApiExceptionTest {

    @Test
    void parsesErrorBodyOnNon2xx() throws Exception {
        try (TestHttpServer srv = TestHttpServer.start(0, ex -> {
            byte[] bytes = ("{\"codigo\":\"erro_validacao\",\"mensagem\":\"Falha\",\"erros\":[{\"caminho\":\"x\",\"mensagem\":\"y\"}]}")
                    .getBytes(StandardCharsets.UTF_8);
            ex.getResponseHeaders().add("Content-Type", "application/json");
            ex.sendResponseHeaders(422, bytes.length);
            ex.getResponseBody().write(bytes);
            ex.close();
        })) {
            FocusNfeClient client = FocusNfeClient.builder()
                    .baseUri(srv.baseUri())
                    .token("t")
                    .build();

            FocusNfeApiException ex = assertThrows(FocusNfeApiException.class,
                    () -> client.nfe().emitir("abc", Map.of("data", Map.of())));

            assertEquals(422, ex.getStatusCode());
            assertNotNull(ex.getError());
            assertEquals("erro_validacao", ex.getError().getCodigo());
            assertEquals("Falha", ex.getError().getMensagem());
            assertEquals(1, ex.getError().getErros().size());
        }
    }
}

