package balbucio.focusnfe4j;

import balbucio.focusnfe4j.cnpj.CnpjService;
import balbucio.focusnfe4j.cnpj.model.CnpjResponse;
import balbucio.focusnfe4j.cnpj.model.EnderecoCnpj;
import balbucio.focusnfe4j.testutil.TestHttpServer;
import org.junit.jupiter.api.Test;

import java.nio.charset.StandardCharsets;

import static org.junit.jupiter.api.Assertions.*;

public class CnpjServiceTest {

    @Test
    void consultarUsesGetV2CnpjsWithCnpjInPath() throws Exception {
        try (TestHttpServer srv = TestHttpServer.start(0, ex -> {
            byte[] bytes = "{\"razao_social\":\"EMPRESA EXEMPLO LTDA\",\"cnpj\":\"12345678000123\",\"situacao_cadastral\":\"ativa\",\"cnae_principal\":\"0000000\",\"optante_simples_nacional\":false,\"optante_mei\":false,\"endereco\":{\"codigo_municipio\":\"0000\",\"codigo_siafi\":\"0000\",\"codigo_ibge\":\"0000000\",\"nome_municipio\":\"CIDADE EXEMPLO\",\"tipo_logradouro\":\"RUA\",\"logradouro\":\"EXEMPLO\",\"complemento\":\"Sala 100\",\"numero\":\"100\",\"bairro\":\"BAIRRO EXEMPLO\",\"cep\":\"00000000\",\"uf\":\"XX\"}}"
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

            CnpjService svc = new CnpjService(client);
            CnpjResponse resp = svc.consultar("12345678000123");

            assertEquals("EMPRESA EXEMPLO LTDA", resp.getRazaoSocial());
            assertEquals("12345678000123", resp.getCnpj());
            assertEquals("ativa", resp.getSituacaoCadastral());
            assertEquals("0000000", resp.getCnaePrincipal());
            assertFalse(resp.isOptanteSimplesNacional());
            assertFalse(resp.isOptanteMei());

            EnderecoCnpj end = resp.getEndereco();
            assertNotNull(end);
            assertEquals("CIDADE EXEMPLO", end.getNomeMunicipio());
            assertEquals("RUA", end.getTipoLogradouro());
            assertEquals("EXEMPLO", end.getLogradouro());
            assertEquals("Sala 100", end.getComplemento());
            assertEquals("100", end.getNumero());
            assertEquals("BAIRRO EXEMPLO", end.getBairro());
            assertEquals("00000000", end.getCep());
            assertEquals("XX", end.getUf());

            TestHttpServer.CapturedRequest req = srv.awaitRequest(2000);
            assertEquals("GET", req.method);
            assertEquals("/v2/cnpjs/12345678000123", req.uri.getRawPath());
        }
    }
}
