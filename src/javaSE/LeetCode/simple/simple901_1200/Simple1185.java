package javaSE.LeetCode.simple.simple901_1200;

/**
 * @Author Diao Rui
 * @Date 2023/6/20 16:10
 * @PackageName:javaSE.LeetCode.simple.simple901_1200
 * @ClassName: Simple1185
 * @Description: TODO
 * @Version 1.0
 */
public class Simple1185 {
    public static void main(String[] args) {
        System.out.println(new Simple1185().dayOfTheWeek(31, 8, 2019));
    }

    public String dayOfTheWeek(int day, int month, int year) {
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        int[] monthDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
        /* 输入年份之前的年份的天数贡献 */
        int days = 365 * (year - 1971) + (year - 1969) / 4;
        /* 输入年份中，输入月份之前的月份的天数贡献 */
        for (int i = 0; i < month - 1; ++i) {
            days += monthDays[i];
        }
        if ((year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) && month >= 3) {
            days += 1;
        }
        /* 输入月份中的天数贡献 */
        days += day;
        return week[(days + 3) % 7];
    }

}
