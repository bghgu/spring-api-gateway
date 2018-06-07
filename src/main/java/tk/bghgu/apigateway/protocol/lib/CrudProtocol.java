package tk.bghgu.apigateway.protocol.lib;

import java.io.Serializable;

/**
 * Created by ds on 2018-06-07.
 */

public interface CrudProtocol<T, ID extends Serializable> extends Protocol<T, ID> {
    <S extends T> S save(S var1);

    <S extends T> Iterable<S> save(Iterable<S> var1);

    T findOne(ID var1);
    
    Iterable<T> findAll();

    Iterable<T> findAll(Iterable<ID> var1);

    long count();

    void delete(ID var1);

    void delete(T var1);

    void delete(Iterable<? extends T> var1);

    void deleteAll();
}
