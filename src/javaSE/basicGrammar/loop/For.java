package javaSE.basicGrammar.loop;

/**
 * @Author Diao Rui
 * @Date 2023/5/5 11:26
 * @PackageName:javaSE.basicGrammar
 * @ClassName: For
 * @Description: TODO
 * @Version 1.0
 */
public class For {
    public static void main(String[] args) {
//        执行过程
        int num = 1;
        for (System.out.print('a'); num < 3; System.out.print('c'), num++) {
            System.out.print('b');//abcbc
        }
        System.out.println();
//        遍历1-100之内的偶数，记录偶数个数，并获取所有偶数和
        int sum = 0, total = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                total += 1;
                sum += i;
            }
        }
        System.out.println("1-100有" + total + "个偶数，偶数总和为：" + sum);
//        水仙花数（各个位置上的立方和之和等于本身）
        for (int i = 100; i < 1000; i++) {
            int a = i % 10;
            int b = i / 10 % 10;
            int c = i / 100;
            if (a * a * a + b * b * b + c * c * c == i)
                System.out.println(i + "是水仙花数");
        }
    }
}
