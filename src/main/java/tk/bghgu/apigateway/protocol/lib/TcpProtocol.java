package tk.bghgu.apigateway.protocol.lib;

import tk.bghgu.apigateway.model.Sort;

import java.io.Serializable;
import java.util.List;

/**
 * Created by ds on 2018-06-05.
 */

public interface TcpProtocol<T, ID extends Serializable> extends PagingAndSoringProtocol<T, ID> {
    List<T> findAll();

    List<T> findAll(Sort var1);

    List<T> findAll(Iterable<ID> var1);

    <S extends T> List<S> save(Iterable<S> var1);

    void flush();

    <S extends T> S saveAndFlush(S var1);

    void deleteInBatch(Iterable<T> var1);

    void deleteAllInBatch();

    T getOne(ID var1);
}
