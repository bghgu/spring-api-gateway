package tk.bghgu.apigateway.protocol;

/**
 * Created by ds on 2018-06-05.
 */
public interface TcpProtocol {
    void get(final String url, final int port);
    void post(final String url, final int port, final Object o);
    void put(final String url, final int port, final Object o);
    void delete(final String url, final int port);
}
