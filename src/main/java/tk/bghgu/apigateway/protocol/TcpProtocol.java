package tk.bghgu.apigateway.protocol;

/**
 * Created by ds on 2018-06-05.
 */
public interface TcpProtocol {
    void get(final String url);
    void post(final String url, final Object o);
    void put(final String url, final Object o);
    void delete(final String url);
}
