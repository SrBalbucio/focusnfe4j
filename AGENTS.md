# focusnfe4j

Cliente Java 11 para API FocusNFE (NFe, NFSe, Gestão).

## Comandos

```bash
mvn test                          # todos os testes
mvn test -Dtest=NomeDaClasseTest  # um teste específico
mvn package                       # build + jar
mvn javadoc:jar                   # javadoc
mvn deploy                        # publica em https://maven.dev.hyperpowered.net
```

Ordem exigida: não há — `mvn test` já compila.

## Arquitetura

- `FocusNfeClient` é `final`, construtor privado. **Única** forma de instanciar: `FocusNfeClient.builder().token("...").build()`.
- Cada domínio de API vira um subpacote (`nfe/`, `nfse/`, `gestao/`) com uma classe `*Service`.
- `GestaoService` é fachada para `BackupsService`, `WebhooksService`, `BlockedEmailsService`.
- `BlockedEmailsService` sempre usa produção (`api.focusnfe.com.br`), ignore `FocusNfeEnvironment`.
- Todos os serviços delegam HTTP a `FocusNfeClient.sendJson()`.

## Stack

- Java 11 (`java.net.http.HttpClient`, sem `var`, sem Lombok)
- Jackson 2.17.2 (`jackson-databind` + `jackson-datatype-jsr310`)
- JUnit Jupiter 5.11.4
- Maven 3.8+, `maven-surefire-plugin` 3.5.2 com `useModulePath=false`

## JSON

- Default `ObjectMapper`: `JavaTimeModule` registrado, `FAIL_ON_UNKNOWN_PROPERTIES = false`
- Todos os modelos usam `@JsonProperty` com snake_case
- Customizável via `Builder.objectMapper(custom)`

## Testes

- **Nenhum mock.** Todos os testes usam `TestHttpServer` — servidor HTTP embedded em loopback com porta aleatória.
- Padrão: sobe `TestHttpServer` → constrói `FocusNfeClient` apontando pra ele → chama serviço → asserciona resposta + request capturado.
- `TestHttpServer` usa `com.sun.net.httpserver.HttpServer` + `CountDownLatch` para captura síncrona.

## Exceções

- `FocusNfeApiException` (status 4xx/5xx): campos `statusCode`, `responseBody`, `error` (`FocusNfeError` com `codigo`, `mensagem`, `erros[]`)
- `FocusNfeException` (erro de rede/IO): herda de `RuntimeException`

## Publicação

- groupId: `balbucio.focusnfe4j`, artifactId: `focusnfe4j`
- Releases: `https://maven.dev.hyperpowered.net/releases`
- Snapshots: `https://maven.dev.hyperpowered.net/snapshots`
