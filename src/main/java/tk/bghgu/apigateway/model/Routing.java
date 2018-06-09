package tk.bghgu.apigateway.model;

/**
 * Created by ds on 2018-06-07.
 */

public class Routing {

    private String address;
    private int port;
    private String url;

    public Routing(final String address, final int port, final String url) {
        this.address = address;
        this.port = port;
        this.url = url;
    }

    public Routing(final String address, final int port) {
        this.address = address;
        this.port = port;
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
}
