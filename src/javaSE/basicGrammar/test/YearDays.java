package javaSE.basicGrammar.test;

import java.util.Scanner;

/**
 * @Author Diao Rui
 * @Date 2023/5/5 10:41
 * @PackageName:javaSE.basicGrammar.test
 * @ClassName: YearDays
 * @Description: 天数计算（输入月份和当月的日期输出为该年第几天）
 * @Version 1.0
 */
public class YearDays {
    public static void main(String[] args) {
        int month, day;
        int days = 0;
//    创建一个scanner对象
        Scanner cin = new Scanner(System.in);
        System.out.print("请输入月份：");
        month = cin.nextInt();
        System.out.print("请输入当月天数：");
        day = cin.nextInt();
        /*
        switch (month) {
            case 2:
                days += 31;
                break;
            case 3:
                days += 31 + 28;
                break;
            case 4:
                days += 31 + 28 + 31;
                break;
            case 5:
                days += 31 + 28 + 31 + 30;
                break;
            case 6:
                days += 31 + 31 + 28 + 31 + 30 + 31;
                break;
            case 7:
                days += 31 + 31 + 28 + 31 + 30 + 31 + 30;
                break;
            case 8:
                days += 31 + 31 + 28 + 31 + 30 + 31 + 30 + 31;
                break;
            case 9:
                days += 31 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
                break;
            case 10:
                days += 31 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
                break;
            case 11:
                days += 31 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
                break;
            case 12:
                days += 31 + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
                break;
        }*/
        switch (month) {
            case 12:
                days += 30;
            case 11:
                days += 31;
            case 10:
                days += 30;
            case 9:
                days += 31;
            case 8:
                days += 31;
            case 7:
                days += 30;
            case 6:
                days += 31;
            case 5:
                days += 30;
            case 4:
                days += 31;
            case 3:
                days += 28;
            case 2:
                days += 31;
            case 1:
                days += day;
        }
        System.out.println("今天是2023年的第" + days + "天");
        //防止内存泄露
        cin.close();
    }
}
