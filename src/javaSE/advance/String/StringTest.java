package javaSE.advance.String;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * @Author Diao Rui
 * @Date 2023/6/16 15:08
 * @PackageName:javaSE.advance.String
 * @ClassName: StringTest
 * @Description: TODO
 * @Version 1.0
 */
public class StringTest {
    @Test
    public void test1() {
        //字面量创建方法
        String s1 = "hello";
        String s2 = "hello";
        //new 创建方法
        String s3 = new String("hello");
        String s4 = new String("hello");

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1 == s4);
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));
    }

    @Test
    public void test2() {
        String s1 = "hello";
        String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);
        System.out.println(s6 == s5);
        System.out.println(s5 == s7);
    }

    @Test
    public void test3() {
        final String s1 = "hello";
        final String s2 = "world";

        String s3 = "helloworld";
        String s4 = "hello" + "world";
        String s5 = s1 + "world";
        String s6 = "hello" + s2;
        String s7 = s1 + s2;
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
        System.out.println(s3 == s6);
        System.out.println(s3 == s7);
        System.out.println(s6 == s5);
        System.out.println(s5 == s7);
    }

    @Test
    public void test4() throws UnsupportedEncodingException {
        String str = new String("hello");
        //字符串转为字符数组
        char[] chars = str.toCharArray();
        //字符串转为byte数组
        /*
         * 默认编码为utf-8字符集（一个汉字占3个字节，一个字母占一个字节）
         * GBK字符集（一个汉字占2个字节，一个字母占1个字节）
         * 编码、解码
         * 编码：String---》字节或字节数组
         * 解码：字节或字节数组---》String
         * utf-8或gbk都向下兼容ASCII码
         * 要求：解码时使用的字符集必须与编码时使用的一致。不一致就会乱码
         * */
        byte[] bytes = str.getBytes();
        byte[] bytes1 = str.getBytes("gbk");

    }

    @Test
    public void test5() {
        String s1 = "";
        String s2 = new String("");
        String s3 = new String();
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s3.isEmpty());
        String s4 = "123456";
        String s5 = "abcdef";
        System.out.println("获取字符串长度:" + s4.length());
        System.out.println(s4 + "+" + s5 + "=" + s4.concat(s5));
        //比较字符串是否相等
        System.out.println(s4 + "==" + s5 + "=" + s4.equals(s5));
        //比较字符串是否相等（忽略大小写）
        System.out.println(s4 + "==" + s5 + "=" + s4.equalsIgnoreCase(s5));
        //比较字符串的大小（返回不同字符的差值，正数第一个字符串比第二个大，反之负数第二个大，返回0则一样大）
        System.out.println(s5.compareTo(s4));
        //小写转大写
        System.out.println(s5.toUpperCase());
    }
}
