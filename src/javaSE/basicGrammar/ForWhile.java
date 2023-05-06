package javaSE.basicGrammar;

/**
 * @Author Diao Rui
 * @Date 2023/5/6 11:04
 * @PackageName:javaSE.basicGrammar
 * @ClassName: ForWhile
 * @Description: TODO
 * @Version 1.0
 */
public class ForWhile {
    public static void main(String[] args) {
        //99乘法表
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "=" + j * i + " ");
            }
            System.out.println();
        }
        //打印菱形
        //打印菱形上半部分
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 2 * (5 - i); j++)
                System.out.print(" ");
            for (int k = 1; k <= 2 * i - 1; k++) {
                if (k != 2 * i - 1)
                    System.out.print("* ");
                else
                    System.out.print("*");
            }

            System.out.println();
        }
        //打印菱形下半部分
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 2 * i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= 2 * (4 - i) + 1; k++) {
                if (k != 2 * (4 - i) + 1)
                    System.out.print("* ");
                else
                    System.out.print("*");
            }
            System.out.println();
        }
    }
}
