package javaSE.basicGrammar.Array;

import java.util.Scanner;

/**
 * @Author Diao Rui
 * @Date 2023/5/12 14:32
 * @PackageName:javaSE.basicGrammar.Array
 * @ClassName: Weekday
 * @Description: 从键盘中输入1-7显示对应的单词
 * @Version 1.0
 */
public class Weekday {
    public static void main(String[] args) {
        //完整写法
        //String[] weekday = new String[]{"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"}
        //简写方式
        String[] weekday = {"sunday", "monday", "tuesday", "wednesday", "thursday", "friday", "saturday"};
        Scanner cin = new Scanner(System.in);
        System.out.print("请输入当前星期:");
        int day = cin.nextInt();
        System.out.println(weekday[day % 7]);
    }
}
