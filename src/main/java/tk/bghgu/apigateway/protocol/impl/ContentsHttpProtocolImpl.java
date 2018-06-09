package tk.bghgu.apigateway.protocol.impl;

import org.springframework.stereotype.Service;
import tk.bghgu.apigateway.model.Contents;
import tk.bghgu.apigateway.model.Page;
import tk.bghgu.apigateway.model.Pageable;
import tk.bghgu.apigateway.model.Sort;
import tk.bghgu.apigateway.protocol.ContentsHttpProtocol;

import java.io.Serializable;

/**
 * Created by ds on 2018-06-09.
 */

@Service
public class ContentsHttpProtocolImpl implements ContentsHttpProtocol {

    @Override
    public Iterable<Contents> findAll(Sort var1) {
        return null;
    }

    @Override
    public Page<Contents> findAll(Pageable var1) {
        return null;
    }

    @Override
    public <S extends Contents> S save(S var1) {
        return null;
    }

    @Override
    public <S extends Contents> Iterable<S> save(Iterable<S> var1) {
        return null;
    }

    @Override
    public Contents findOne(String var1) {
        return null;
    }

    @Override
    public Iterable<Contents> findAll() {
        return null;
    }

    @Override
    public Iterable<Contents> findAll(Iterable<String> var1) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(String var1) {

    }

    @Override
    public void delete(Contents var1) {

    }

    @Override
    public void delete(Iterable<? extends Contents> var1) {

    }

    @Override
    public void deleteAll() {

    }
}
