package javaSE.project.demo1;

import java.util.Scanner;

/**
 * @Author Diao Rui
 * @Date 2023/5/6 14:25
 * @PackageName:javaSE.project.demo1
 * @ClassName: FamilyAcount
 * @Description: TODO
 * @Version 1.0
 */
public class FamilyAcount {
    public static void main(String[] args) {
        int choose;
        Scanner cin = new Scanner(System.in);
        while (true) {
            Utils.Menu();
            System.out.print("请选择（1-4）：");
            choose = cin.nextInt();
            if (choose == 4)
                break;
            switch (choose){
                case 1:

            }
        }
    }
}
