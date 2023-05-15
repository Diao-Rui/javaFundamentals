package javaSE.basicGrammar.flowPath;

/**
 * @Author Diao Rui
 * @Date 2023/4/28 15:08
 * @PackageName:javaSE.basicGrammar
 * @ClassName: IfElseTest
 * @Description: TODO
 * @Version 1.0
 */
public class IfElseTest {
    public static void main(String[] args) {
        //心率检查
        int heartBeats = 89;
        if (heartBeats >= 60 && heartBeats <= 100) {
            System.out.println("你的心率是正常的");
        } else {
            System.out.println("你的心率有问题，建议检查");
        }
        //等级划分
        int score = 82;
        if (score >= 90) {
            System.out.println('A');
        } else if (score >= 80) {
            System.out.println('B');
        } else if (score >= 70) {
            System.out.println('C');
        } else if (score >= 60) {
            System.out.println('D');
        } else {
            System.out.println('E');
        }
        //三数排序
        int num1 = 150, num2 = 30, num3 = 25;
        if (num1 >= num2) {
            if (num1 <= num3) {
                System.out.println(num2 + "," + num1 + "," + num3);
            } else if (num2 >= num3) {
                System.out.println(num3 + "," + num2 + "," + num1);
            } else {
                System.out.println(num2 + "," + num3 + "," + num1);
            }
        }else {
            if(num2<=num3){
                System.out.println(num1 + "," + num2 + "," + num3);
            }else if(num1>=num3){
                System.out.println(num3 + "," + num1 + "," + num2);
            }else {
                System.out.println(num1 + "," + num3 + "," + num2);
            }
        }
    }
}
