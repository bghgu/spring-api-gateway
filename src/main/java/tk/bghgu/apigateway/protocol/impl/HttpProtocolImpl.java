package tk.bghgu.apigateway.protocol.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tk.bghgu.apigateway.protocol.HttpProtocol;

/**
 * Created by ds on 2018-06-05.
 */
@Service
public class HttpProtocolImpl implements HttpProtocol {

    private static RestTemplate restTemplate;

    @Override
    public ResponseEntity get(String url) {
        restTemplate = new RestTemplate();
        return restTemplate.getForEntity(url, String.class);
    }

    @Override
    public ResponseEntity post(String url, Object o) {
        return restTemplate.getForEntity(url, String.class);
    }

    @Override
    public ResponseEntity put(String url, Object o) {
        return restTemplate.getForEntity(url, String.class);
    }

    @Override
    public ResponseEntity delete(String url) {
        return restTemplate.getForEntity(url, String.class);
    }
}
