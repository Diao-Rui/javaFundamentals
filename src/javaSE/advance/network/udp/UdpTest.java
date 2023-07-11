package javaSE.advance.network.udp;

import org.junit.Test;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.nio.charset.StandardCharsets;

/**
 * @Author Diao Rui
 * @Date 2023/7/10 14:29
 * @PackageName:javaSE.advance.network.udp
 * @ClassName: UdpTest
 * @Description: TODO
 * @Version 1.0
 */
public class UdpTest {
    @Test
    public void send() {
        DatagramSocket socket = null;
        try {
            //发送方只需要空参数构造器
            socket = new DatagramSocket();
            byte[] buffer = "我是发送端，我给你发消息了".getBytes(StandardCharsets.UTF_8);
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            int port = 9090;
            //数据报（需要准备数据，目的地址，目的端口等）
            DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length, ip, port);
            //发送数据报
            socket.send(packet);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null)
                socket.close();
        }
    }

    @Test
    public void receive() {
        DatagramSocket socket = null;
        try {
            //最大64KB
            byte[] buffer = new byte[1024 * 64];
            //接收数据报（只需要接收数据及其长度即可）
            DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length);
            int port = 9090;
            //接收方需要指明端口，才能收到数据报
            socket = new DatagramSocket(port);
            socket.receive(packet);
            String message = new String(buffer, 0, packet.getLength());
            System.out.println(message);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null)
                socket.close();
        }
    }
}
