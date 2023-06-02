package javaSE.HighOOP.entity.wrapper;

import java.util.Scanner;
import java.util.Vector;

/**
 * @Author Diao Rui
 * @Date 2023/6/2 16:06
 * @PackageName:javaSE.HighOOP.entity.wrapper
 * @ClassName: ScoreTest
 * @Description: TODO
 * @Version 1.0
 */
public class ScoreTest {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int max = 0;
        Vector v = new Vector();
        while (true) {
            System.out.print("请输入分数（-1结束）：");
            int input = cin.nextInt();
            if (input == -1)
                break;
            //自动装箱
            v.add(input);
            max = max < input ? input : max;
        }
        for (int i = 0; i < v.size(); i++) {
            Integer score = (Integer) v.elementAt(i);
            char grade = 'A';
            if (score > max)
                grade = 'A';
            else if (score == max)
                grade = 'B';
            else
                grade = 'C';
            System.out.println("student " + (i + 1) + " score is " + score + ",grade is " + grade);
        }
    }
}
