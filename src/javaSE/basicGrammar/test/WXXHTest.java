package javaSE.basicGrammar.test;

import java.util.Scanner;

/**
 * @Author Diao Rui
 * @Date 2023/5/6 10:50
 * @PackageName:javaSE.basicGrammar.test
 * @ClassName: WXXHTest
 * @Description: TODO
 * @Version 1.0
 */
public class WXXHTest {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int num, positiveNumber = 0, negativeNumber = 0;
        while (true) {
            System.out.print("请输入一个数：");
            num = cin.nextInt();
            if (num == 0)
                break;
            if (num > 0)
                positiveNumber++;
            else
                negativeNumber++;
        }
        System.out.println("输入的整数有" + positiveNumber + "个，负数有" + negativeNumber + "个");
    }
}
