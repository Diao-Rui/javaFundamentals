package javaSE.advance.date;

import org.junit.Test;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Date;

/**
 * @Author Diao Rui
 * @Date 2023/6/20 11:12
 * @PackageName:javaSE.advance.date
 * @ClassName: Summarize
 * @Description: TODO
 * @Version 1.0
 */
public class Summarize {
    /*
     * 使用Calendar获取当前时间，把这个时间设置为你的生日，获取100天后的日期
     * */
    @Test
    public void test1() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(1999, Calendar.DECEMBER, 8);
        Date time = calendar.getTime();
        System.out.println(time);

        calendar.add(Calendar.DAY_OF_YEAR, 100);
        Date time1 = calendar.getTime();
        System.out.println(time1);
    }

    /*
     * 使用LocalDateTime获取当前的时间，把这个时间设置为你的生日，获取100天后的日期
     * */
    @Test
    public void test2() {
        LocalDateTime now = LocalDateTime.of(1999, 12, 8, 0, 0, 0);
        System.out.println(now);
        LocalDateTime localDateTime = now.plusDays(100);
        System.out.println(localDateTime);
    }
}
