package javaSE.basicGrammar.test;

import java.util.Scanner;

/**
 * @Author Diao Rui
 * @Date 2023/5/5 11:46
 * @PackageName:javaSE.basicGrammar.test
 * @ClassName: ForTest
 * @Description: 最大公约数，最小公倍数
 * @Version 1.0
 */
public class ForTest {
    public static void main(String[] args) {
        int num1, num2;
        Scanner cin = new Scanner(System.in);
        System.out.print("输入一个整数：");
        num1 = cin.nextInt();
        System.out.print("输入一个整数：");
        num2 = cin.nextInt();
        cin.close();

//        过去两数中的最小数
        int min = num1 > num2 ? num2 : num1;
//        方法1正序查找
        int res = 1;
        for (int i = 1; i <= min; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                res = i;
            }
        }
        System.out.println(num1 + "和" + num2 + "的最大公约数为：" + res);
        //方法二逆序查找（找到第一个公约数）
        for (int i = min; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                System.out.println(num1 + "和" + num2 + "的最大公约数为：" + res);
                break;
            }
        }
        //最小公倍数
        int max = num1 > num2 ? num1 : num2;
        for (int i = max; i <= num1 * num2; i++) {
            if (i % num1 == 0 && i % num2 == 0) {
                System.out.println(num1 + "和" + num2 + "的最小公倍数为：" + i);
                break;
            }
        }
    }
}
