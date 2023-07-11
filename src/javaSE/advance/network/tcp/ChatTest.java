package javaSE.advance.network.tcp;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

/**
 * @Author Diao Rui
 * @Date 2023/7/10 15:06
 * @PackageName:javaSE.advance.network.tcp
 * @ClassName: ChatTest
 * @Description: TODO
 * @Version 1.0
 */
public class ChatTest {
    @Test
    public void server() {
        ServerSocket serverSocket = null;
        ByteArrayOutputStream baos = null;
        OutputStream outputStream = null;
        try {
            int port = 9999;
            serverSocket = new ServerSocket(port);
            System.out.println("服务器启动成功");
            //获取客户端连接
            Socket client = serverSocket.accept();
            System.out.println("收到了" + client.getInetAddress().getHostName() + "的连接");
            //获取输入流
            InputStream inputStream = client.getInputStream();
            //字节数组流
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            System.out.println(baos.toString());
            //发送数据给客户端
            outputStream = client.getOutputStream();
            outputStream.write("我是服务器，我收到了，你的消息".getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                if (baos != null)
                    baos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (outputStream != null)
                    outputStream.close();
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

    @Test
    public void client() {
        Socket socket = null;
        OutputStream outputStream = null;
        InputStream inputStream = null;
        ByteArrayOutputStream baos = null;
        try {
            //设置对方IP地址
            InetAddress ip = InetAddress.getByName("127.0.0.1");
            //设置对方端口号
            int port = 9999;
            //连接服务器
            socket = new Socket(ip, port);
            //获取输出流
            outputStream = socket.getOutputStream();
            outputStream.write("你好，服务器".getBytes(StandardCharsets.UTF_8));

            //表明客户端不再继续发送数据
            socket.shutdownOutput();

            //接收服务器发送来的数据
            inputStream = socket.getInputStream();
            baos = new ByteArrayOutputStream();
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                baos.write(buffer, 0, len);
            }
            System.out.println(baos.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (baos != null)
                    baos.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (socket != null)
                    socket.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
