package tk.bghgu.apigateway.protocol.impl;

import org.springframework.stereotype.Service;
import tk.bghgu.apigateway.model.Contents;
import tk.bghgu.apigateway.model.Page;
import tk.bghgu.apigateway.model.Pageable;
import tk.bghgu.apigateway.model.Sort;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ds on 2018-06-09.
 */

@Service
public class ContentsTcpProtocol implements tk.bghgu.apigateway.protocol.ContentsTcpProtocol {

    @Override
    public List<Contents> findAll() {
        return null;
    }

    @Override
    public List<Contents> findAll(Sort var1) {
        return null;
    }

    @Override
    public Page<Contents> findAll(Pageable var1) {
        return null;
    }

    @Override
    public List<Contents> findAll(Iterable<String> var1) {
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

    @Override
    public <S extends Contents> S save(S var1) {
        return null;
    }

    @Override
    public <S extends Contents> List<S> save(Iterable<S> var1) {
        return null;
    }

    @Override
    public Contents findOne(String var1) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public <S extends Contents> S saveAndFlush(S var1) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Contents> var1) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Contents getOne(String var1) {
        return null;
    }
}
