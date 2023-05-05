package javaSE.basicGrammar.test;

import java.util.Scanner;

/**
 * @Author Diao Rui
 * @Date 2023/5/4 13:21
 * @PackageName:javaSE.basicGrammar.test
 * @ClassName: ScannerTest
 * @Description: TODO
 * @Version 1.0
 */
public class ScannerTest {
    public static void main(String[] args) {
//        创建一个Scanner实例
        Scanner cin = new Scanner(System.in);
        System.out.print("请输入你的用户名：");
//        获取字符串
        String username = cin.next();
//        获取正数
        System.out.print("请输入你的年龄：");
//        获取字符串
        int age = cin.nextInt();
        System.out.print("是否单身：");
//        获取字符串
        boolean isSingle = cin.nextBoolean();
        System.out.println("用户名：" + username);
        System.out.println("年龄：" + age);
        System.out.println("是否单是：" + (isSingle ? '是' : '否'));
    }
}
