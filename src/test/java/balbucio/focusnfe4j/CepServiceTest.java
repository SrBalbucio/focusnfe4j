package balbucio.focusnfe4j;

import balbucio.focusnfe4j.cep.CepService;
import balbucio.focusnfe4j.cep.model.CepResponse;
import balbucio.focusnfe4j.testutil.TestHttpServer;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CepServiceTest {

    @Test
    void consultarUsesGetV2CepsWithCepInPath() throws Exception {
        try (TestHttpServer srv = TestHttpServer.start(0, ex -> {
            byte[] bytes = "{\"cep\":\"81590549\",\"tipo\":\"logradouro\",\"uf\":\"PR\",\"nome_localidade\":\"Curitiba\",\"codigo_ibge\":\"4106902\",\"descricao\":\"Rua Exemplo, Curitiba, PR\"}"
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

            CepService svc = new CepService(client);
            CepResponse resp = svc.consultar("81590549");

            assertEquals("81590549", resp.getCep());
            assertEquals("logradouro", resp.getTipo());
            assertEquals("PR", resp.getUf());
            assertEquals("Curitiba", resp.getNomeLocalidade());
            assertEquals("4106902", resp.getCodigoIbge());
            assertEquals("Rua Exemplo, Curitiba, PR", resp.getDescricao());

            TestHttpServer.CapturedRequest req = srv.awaitRequest(2000);
            assertEquals("GET", req.method);
            assertEquals("/v2/ceps/81590549", req.uri.getRawPath());
        }
    }

    @Test
    void listarComParametrosRetornaLista() throws Exception {
        try (TestHttpServer srv = TestHttpServer.start(0, ex -> {
            byte[] bytes = "[{\"cep\":\"81590549\",\"uf\":\"PR\",\"nome_localidade\":\"Curitiba\"},{\"cep\":\"87303260\",\"uf\":\"PR\",\"nome_localidade\":\"Campo Mourão\"}]"
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

            CepService svc = new CepService(client);
            List<CepResponse> resultados = svc.listarPorUfELogradouro("PR", "Rua");

            assertEquals(2, resultados.size());
            assertEquals("81590549", resultados.get(0).getCep());
            assertEquals("Curitiba", resultados.get(0).getNomeLocalidade());

            TestHttpServer.CapturedRequest req = srv.awaitRequest(2000);
            assertEquals("GET", req.method);
            assertEquals("/v2/ceps", req.uri.getPath());
            assertTrue(req.uri.getQuery().contains("uf=PR"));
            assertTrue(req.uri.getQuery().contains("logradouro=Rua"));
        }
    }
}
