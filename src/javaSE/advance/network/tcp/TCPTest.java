package javaSE.advance.network.tcp;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Diao Rui
 * @Date 2023/7/5 14:12
 * @PackageName:javaSE.advance.network
 * @ClassName: TCPTest
 * @Description: 客户端发送信息给服务端
 * @Version 1.0
 */
public class TCPTest {
    @Test
    public void client() {
        Socket socket = null;
        OutputStream os = null;
        try {
            //创建Socket
            //声明对方主机IP地址
            InetAddress inetAddress = InetAddress.getByName("10.10.11.91");
            //声明对方端口号
            int port = 8989;
            socket = new Socket(inetAddress, port);
            //发送数据
            os = socket.getOutputStream();
            os.write("你好，我是客户端".getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭Socket
            try {
                if (os != null)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void server() {
        ServerSocket serverSocket = null;
        Socket accept = null;
        InputStream inputStream = null;
        try {
            //创建一个serverSocket
            int port = 8989;
            serverSocket = new ServerSocket(port);
            //调用accept(),接收客户端Socket
            accept = serverSocket.accept();
            System.out.println("服务器端已开启");

            System.out.println("收到了来自于：" + accept.getInetAddress().getHostAddress() + "的连接");
            //接收数据
            inputStream = accept.getInputStream();
            byte[] buffer = new byte[1024];
            int len;
            //正确的方法
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            while ((len = inputStream.read(buffer)) != -1) {
                //可能会出现乱码
                //System.out.println(new String(buffer, 0, len));
                baos.write(buffer, 0, len);
            }
            System.out.println(baos.toString());
            System.out.println("数据接收完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭Socket，serverSocket
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (accept != null)
                    accept.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (serverSocket != null)
                    serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
