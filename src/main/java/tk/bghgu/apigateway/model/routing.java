package tk.bghgu.apigateway.model;

/**
 * Created by ds on 2018-06-07.
 */

public class routing {

    private String address;
    private int port;
    private String url;
    private Protocol Protocol;
    private Method method;

    public routing(final String address, final int port, final String url, final Protocol Protocol, final Method method) {
        this.address = address;
        this.port = port;
        this.url = url;
        this.Protocol = Protocol;
        this.method = method;
    }

    public routing(final String address, final int port, final Protocol Protocol, final Method method) {
        this.address = address;
        this.port = port;
        this.Protocol = Protocol;
        this.method = method;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String uri) {
        this.url = uri;
    }

    public Protocol getProtocol() {
        return Protocol;
    }

    public void setProtocol(Protocol protocol) {
        Protocol = protocol;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }
}
