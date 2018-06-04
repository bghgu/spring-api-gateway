package tk.bghgu.apigateway.protocol;

import org.springframework.http.ResponseEntity;

/**
 * Created by ds on 2018-06-05.
 */
public interface HttpProtocol {
    ResponseEntity get(final String url);
    ResponseEntity post(final String url, final Object o);
    ResponseEntity put(final String url, final Object o);
    ResponseEntity delete(final String url);
}
