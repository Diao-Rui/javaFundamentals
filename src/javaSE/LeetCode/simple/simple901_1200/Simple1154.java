package javaSE.LeetCode.simple.simple901_1200;

/**
 * @Author Diao Rui
 * @Date 2023/6/17 21:09
 * @PackageName:javaSE.LeetCode.simple.simple901_1200
 * @ClassName: Simple1154
 * @Description: TODO
 * @Version 1.0
 */
public class Simple1154 {
    public static void main(String[] args) {
        System.out.println(new Simple1154().dayOfYear("2019-01-09"));
    }

    public int dayOfYear(String date) {
        String[] dates = date.split("-");
        int days = Integer.parseInt(dates[2]);
        switch (Integer.parseInt(dates[1])) {
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
                int temp = Integer.parseInt(dates[0]);
                if (temp % 4 == 0 && temp % 100 != 0 || temp % 400 == 0)
                    days += 29;
                else
                    days += 28;
            case 2:
                days += 31;
        }
        return days;
    }
}
