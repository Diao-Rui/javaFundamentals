package javaSE.advance.network.tcp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author Diao Rui
 * @Date 2023/7/5 14:35
 * @PackageName:javaSE.advance.network
 * @ClassName: TCPTest1
 * @Description: 客户端给服务器发送文件
 * @Version 1.0
 */
public class TCPTest1 {
    @Test
    public void client() {
        //创建Socket
        //客户端套接字，用于连接服务器
        Socket socket = null;
        //输入流用于将数据从文件中读到内存中
        FileInputStream inputStream = null;
        //输出流将读取的数据发送到服务器
        OutputStream outputStream = null;
        try {
            InetAddress inetAddress = InetAddress.getByName("10.10.11.91");
            socket = new Socket(inetAddress, 8989);
            //创建File实例，和文件流
            File file = new File("src/javaSE/advance/network/tcp/cat.jpg");
            inputStream = new FileInputStream(file);
            //通过Socket获取输出流
            outputStream = socket.getOutputStream();
            //输出传输
            byte[] buffer = new byte[1024];
            int len;
            while ((len = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }
            System.out.println("数据发送完毕");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭Socket和文件流
            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (inputStream != null)
                    inputStream.close();
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
        //服务器套接字，用于接收客户端请求
        ServerSocket server = null;
        //客户端套接字，用于连接客户端并数据传输
        Socket client = null;
        //输入流，将客户端的数据发送的数据读出
        InputStream inputStream = null;
        //输出流，读取的数据写出到文件
        FileOutputStream outputStream = null;
        try {
            //创建serverSocket
            int port = 8989;
            server = new ServerSocket(port);
            //接收来自于客户端的连接
            client = server.accept();
            System.out.println("收到来自" + client.getInetAddress().getHostAddress() + "连接");
            //接收数据
            inputStream = client.getInputStream();
            //写出数据到文件
            File file = new File("src/javaSE/advance/network/tcp/catCopy.jpg");
            outputStream = new FileOutputStream(file);
            int len;
            byte[] buffer = new byte[1024];
            while ((len = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, len);
            }
            System.out.println("数据接收完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭Socket和流
            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (client != null)
                    client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (server != null)
                    server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
