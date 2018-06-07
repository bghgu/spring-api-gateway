package tk.bghgu.apigateway.protocol.lib;

import java.io.Serializable;

/**
 * Created by ds on 2018-06-05.
 */

public interface HttpProtocol<T, ID extends Serializable> extends PagingAndSoringProtocol<T, ID> {

}
