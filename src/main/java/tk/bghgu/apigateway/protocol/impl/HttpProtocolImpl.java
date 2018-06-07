package tk.bghgu.apigateway.protocol.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * Created by ds on 2018-06-05.
 */

@Service
public class HttpProtocolImpl{

    private static RestTemplate restTemplate = new RestTemplate();
    private static URI uri;

    public void get(final String url) {
        uri = URI.create(url);
        System.out.println(restTemplate.getForObject(uri, String.class));
    }

}
