package javaSE.advance.network;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author Diao Rui
 * @Date 2023/7/5 11:27
 * @PackageName:javaSE.advance.network
 * @ClassName: InetAddressTest
 * @Description: TODO
 * @Version 1.0
 */
public class InetAddressTest {
    @Test
    public void test1() {
        try {
            //获取指定主机的IP地址对象
            InetAddress byName = InetAddress.getByName("192.168.15.2");
            //获取本机的IP地址对象
            InetAddress localHost = InetAddress.getLocalHost();
            //根据域名解析地址
            InetAddress byName1 = InetAddress.getByName("www.baidu.com");
            System.out.println(byName);
            System.out.println(localHost);
            System.out.println(byName1);
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
    }
}
