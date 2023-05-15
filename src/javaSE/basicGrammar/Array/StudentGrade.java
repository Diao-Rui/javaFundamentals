package javaSE.basicGrammar.Array;

import java.util.Scanner;

/**
 * @Author Diao Rui
 * @Date 2023/5/12 14:40
 * @PackageName:javaSE.basicGrammar.Array
 * @ClassName: StudentGrade
 * @Description: TODO
 * @Version 1.0
 */
public class StudentGrade {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        int n = 5, max = -32767;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("请输入学生成绩:");
            arr[i] = cin.nextInt();
            max = max > arr[i] ? max : arr[i];
        }
        System.out.println("最高分为：" + max);
        char grade = 'A';
        for (int i = 0; i < n; i++) {
            if (arr[i] >= (max - 10)) {
                grade = 'A';
            } else if (arr[i] >= (max - 20)) {
                grade = 'B';
            } else if (arr[i] >= (max - 30)) {
                grade = 'C';
            } else {
                grade = 'D';
            }
            System.out.println("student " + (i + 1) + " score is " + arr[i] + " grade is " + grade);
        }
    }
}
