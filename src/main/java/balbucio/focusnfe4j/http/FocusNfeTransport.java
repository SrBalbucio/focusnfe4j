package balbucio.focusnfe4j.http;

import java.io.IOException;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public interface FocusNfeTransport {
    HttpResponse<String> send(HttpRequest request) throws IOException, InterruptedException;
}

