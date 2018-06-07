package tk.bghgu.apigateway.protocol.impl;

import org.springframework.stereotype.Service;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;

/**
 * Created by ds on 2018-06-05.
 */
@Service
public class TcpProtocolImpl {

    public void get(final String url, final int port) {
        try (Socket client = new Socket()) {
            InetSocketAddress inetSocketAddress = new InetSocketAddress(url, port);
            client.connect(inetSocketAddress);
            try (
                    DataOutputStream dataOutputStream = new DataOutputStream(client.getOutputStream());
                    DataInputStream dataInputStream = new DataInputStream(client.getInputStream())
            ) {
                String res = dataInputStream.readUTF();
                System.out.println(res);
            }
        } catch (Throwable e) {
            e.printStackTrace();
        }
    }

}
