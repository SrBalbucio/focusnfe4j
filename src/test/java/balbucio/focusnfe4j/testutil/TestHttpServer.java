package balbucio.focusnfe4j.testutil;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

public final class TestHttpServer implements AutoCloseable {
    public static final class CapturedRequest {
        public final String method;
        public final URI uri;
        public final Map<String, List<String>> headers;
        public final String body;

        CapturedRequest(String method, URI uri, Map<String, List<String>> headers, String body) {
            this.method = method;
            this.uri = uri;
            this.headers = headers;
            this.body = body;
        }
    }

    private final HttpServer server;
    private final AtomicReference<CapturedRequest> lastRequest = new AtomicReference<>();
    private final CountDownLatch latch = new CountDownLatch(1);

    private TestHttpServer(HttpServer server) {
        this.server = server;
    }

    public static TestHttpServer start(int port, HttpHandler handler) throws IOException {
        HttpServer s = HttpServer.create(new InetSocketAddress("127.0.0.1", port), 0);
        TestHttpServer wrapper = new TestHttpServer(s);
        s.createContext("/", exchange -> wrapper.captureThenHandle(exchange, handler));
        s.start();
        return wrapper;
    }

    public URI baseUri() {
        return URI.create("http://127.0.0.1:" + server.getAddress().getPort());
    }

    public CapturedRequest awaitRequest(long timeoutMs) {
        try {
            if (!latch.await(timeoutMs, TimeUnit.MILLISECONDS)) {
                throw new AssertionError("Timed out waiting for request");
            }
            return lastRequest.get();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new AssertionError("Interrupted waiting for request");
        }
    }

    private void captureThenHandle(HttpExchange exchange, HttpHandler handler) throws IOException {
        String body = readAll(exchange.getRequestBody());
        lastRequest.set(new CapturedRequest(
                exchange.getRequestMethod(),
                exchange.getRequestURI(),
                exchange.getRequestHeaders(),
                body
        ));
        latch.countDown();
        handler.handle(exchange);
    }

    private static String readAll(InputStream in) throws IOException {
        if (in == null) return "";
        byte[] bytes = in.readAllBytes();
        return new String(bytes, StandardCharsets.UTF_8);
    }

    @Override
    public void close() {
        server.stop(0);
    }
}

