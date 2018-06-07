package tk.bghgu.apigateway.protocol.lib;

import tk.bghgu.apigateway.model.Page;
import tk.bghgu.apigateway.model.Pageable;
import tk.bghgu.apigateway.model.Sort;

import java.io.Serializable;
/**
 * Created by ds on 2018-06-07.
 */

public interface PagingAndSoringProtocol<T, ID extends Serializable> extends CrudProtocol<T, ID> {
    Iterable<T> findAll(Sort var1);

    Page<T> findAll(Pageable var1);
}
