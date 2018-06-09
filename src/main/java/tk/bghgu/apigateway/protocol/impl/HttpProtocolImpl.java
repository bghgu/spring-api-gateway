package tk.bghgu.apigateway.protocol.impl;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import tk.bghgu.apigateway.model.Page;
import tk.bghgu.apigateway.model.Pageable;
import tk.bghgu.apigateway.model.Sort;
import tk.bghgu.apigateway.protocol.lib.HttpProtocol;

import java.io.Serializable;
import java.net.URI;

/**
 * Created by ds on 2018-06-05.
 */

@Service
public class HttpProtocolImpl implements HttpProtocol {

    private static RestTemplate restTemplate = new RestTemplate();
    private static URI uri;

    public void get(final String url) {
        uri = URI.create(url);
        System.out.println(restTemplate.getForObject(uri, String.class));
    }

    @Override
    public Iterable findAll(Sort var1) {
        return null;
    }

    @Override
    public Page findAll(Pageable var1) {
        return null;
    }

    @Override
    public Object save(Object var1) {
        return null;
    }

    @Override
    public Iterable save(Iterable var1) {
        return null;
    }

    @Override
    public Object findOne(Serializable var1) {
        return null;
    }

    @Override
    public Iterable findAll() {
        return null;
    }

    @Override
    public Iterable findAll(Iterable var1) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Serializable var1) {

    }

    @Override
    public void delete(Object var1) {

    }

    @Override
    public void delete(Iterable var1) {

    }

    @Override
    public void deleteAll() {

    }
}
