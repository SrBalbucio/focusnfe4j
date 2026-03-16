# focusnfe4j

Cliente Java 11 minimalista para a API da **FocusNFE** (NFe, NFSe e recursos de Gestão).  
Inclui transporte HTTP baseado no `HttpClient` do JDK, mapeamento JSON via Jackson e serviços prontos para os endpoints mais usados.

[![](https://img.shields.io/badge/HyperPowered-Use%20the%20official%20repository-yellow?color=%23279BF8&cacheSeconds=3600)](https://maven.dev.hyperpowered.net/#/releases/balbucio/picpay4j/picpay4j/)


## Requisitos
- Java 11 ou superior.
- Maven 3.8+ (ou Gradle) para compilar/empacotar.
- Um token de acesso da FocusNFE.

## Instalação

### Maven
```xml
<dependency>
  <groupId>balbucio.focusnfe4j</groupId>
  <artifactId>focusnfe4j</artifactId>
  <version>1.0.0</version>
</dependency>
```

### Gradle (Groovy)
```groovy
implementation 'balbucio.focusnfe4j:focusnfe4j:1.0.0'
```

### Gradle (Kotlin)
```kotlin
implementation("balbucio.focusnfe4j:focusnfe4j:1.0.0")
```

## Configuração rápida
```java
import balbucio.focusnfe4j.FocusNfeClient;
import balbucio.focusnfe4j.FocusNfeEnvironment;

FocusNfeClient client = FocusNfeClient.builder()
        .environment(FocusNfeEnvironment.HOMOLOGATION) // PRODUCTION é o padrão
        .token("SEU_TOKEN_AQUI")
        .userAgent("minha-app/1.0") // opcional
        .build();
```

## Exemplos

### Emitir NFe
```java
Map<String, Object> payload = Map.of(
        "cnpj_emitente", "12345678000190",
        "natureza_operacao", "Venda",
        "itens", List.of(Map.of("cfop", "5101", "valor_total", 100))
);

var status = client.nfe().emitir("minha-ref-123", payload);
System.out.println(status.getStatus()); // processando_autorizacao, autorizado etc.
```

### Consultar NFe (completa) e baixar DANFE
```java
var resp = client.nfe().consultar("minha-ref-123", true);
URI danfe = client.resolveFileUri(resp.getCaminhoDanfe()); // URL absoluta pronta
```

### Cancelar NFe e reenviar e-mail
```java
client.nfe().cancelar("minha-ref-123", "Erro de emissão");
client.nfe().enviarEmail("minha-ref-123", new EmailRequest(List.of("destino@exemplo.com")));
```

### NFSe
```java
var nfse = client.nfse().emitir("ref-nfse-001", Map.of("servico", Map.of("valor_servicos", 150.0)));
var detalhes = client.nfse().consultar("ref-nfse-001", true);
client.nfse().cancelar("ref-nfse-001", "Solicitação do tomador");
```

### Gestão: backups
```java
var backups = client.gestao().backups().listar("12345678000190");
backups.getBackups().forEach(b -> System.out.println(b.getArquivo()));
```

### Gestão: webhooks
```java
WebhookCreateRequest req = new WebhookCreateRequest()
        .setEvent("nfe") // ou nfse
        .setUrl("https://meusite.com/webhooks/focus")
        .setAuthorization("segredo");

Webhook criado = client.gestao().webhooks().criar(req);
List<Webhook> todos = client.gestao().webhooks().listar();
client.gestao().webhooks().reenviarNotificacoesNfe("minha-ref-123");
```

### Gestão: e-mails bloqueados
```java
var status = client.gestao().blockedEmails().consultar("destino@exemplo.com");
client.gestao().blockedEmails().solicitarExclusao("destino@exemplo.com");
```

## Tratamento de erros
- Erros HTTP da API levantam `FocusNfeApiException` com `statusCode`, corpo retornado e, quando possível, `FocusNfeError`.
- Falhas de rede ou interrupção levantam `FocusNfeException`.

## Desenvolvimento
- Rode os testes: `mvn test`
- O pacote usa apenas dependências leves (Jackson + JUnit) e o `HttpClient` padrão do JDK.
