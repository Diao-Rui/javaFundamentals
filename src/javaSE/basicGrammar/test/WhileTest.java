package javaSE.basicGrammar.test;

import java.util.Scanner;

/**
 * @Author Diao Rui
 * @Date 2023/5/5 14:22
 * @PackageName:javaSE.basicGrammar.test
 * @ClassName: WhileTest
 * @Description: 声明一个变量balance并初始化为0，用以表示银行账户的余额，ATM拥有的功能存款取款等
 * @Version 1.0
 */
public class WhileTest {
    public static void main(String[] args) {
        int choose = 0;
        double balance = 0.0, price = 0.0;
        Scanner cin = new Scanner(System.in);
        do {
            System.out.println("========ATM===========");
            System.out.println("========1.存款===========");
            System.out.println("========2.取款===========");
            System.out.println("========3.显示余额===========");
            System.out.println("========4.退出===========");
            System.out.print("请选择（1-4）：");
            choose = cin.nextInt();
            switch (choose) {
                case 1:
                    System.out.print("请输入存款余额");
                    price = cin.nextDouble();
                    balance += price;
                    System.out.println("存款成功");
                    break;
                case 2:
                    System.out.print("请输入取款余额");
                    price = cin.nextDouble();
                    if (balance >= price) {
                        balance -= price;
                        System.out.println("取款成功");
                    } else
                        System.out.println("你没有那么多钱，取款失败");
                    break;
                case 3:
                    System.out.println("您当前的余额为：" + balance);
                    break;
            }
        } while (choose != 4);
        cin.close();
    }
}
