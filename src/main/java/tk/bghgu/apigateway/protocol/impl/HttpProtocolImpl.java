package tk.bghgu.apigateway.protocol.impl;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tk.bghgu.apigateway.protocol.HttpProtocol;

import java.net.URI;

/**
 * Created by ds on 2018-06-05.
 */
@Service
public class HttpProtocolImpl implements HttpProtocol {

    private static RestTemplate restTemplate = new RestTemplate();
    private static URI uri;

    @Override
    public void get(final String url) {
        uri = URI.create(url);
        System.out.println(restTemplate.getForObject(uri, String.class));
    }

    @Override
    public void post(String url, Object o) {

    }

    @Override
    public void put(String url, Object o) {
    }

    @Override
    public void delete(String url) {
    }
}
