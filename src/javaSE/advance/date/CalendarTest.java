package javaSE.advance.date;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

/**
 * @Author Diao Rui
 * @Date 2023/6/19 16:48
 * @PackageName:javaSE.advance.date
 * @ClassName: CalendarTest
 * @Description: TODO
 * @Version 1.0
 */
public class CalendarTest {
    @Test
    public void test1() {
        //实例化 由于Calendar是一个抽象类，所以我们需要创建其子类的实例，
        // 我们需要通过Calendar的静态方法getInstance
        Calendar calendar = Calendar.getInstance();
        //常用方法
        //get(int field)
        // 获取当前月的天数
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        //获取当前年份的天数
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        //add(int field,xx)
        calendar.add(Calendar.DAY_OF_YEAR, 3);
        calendar.add(Calendar.DAY_OF_YEAR, -5);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        //getTime():将Calendar转为Date
        Date time = calendar.getTime();
        System.out.println(time);
        //通过Date重置Calendar
        calendar.setTime(time);
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
    }
}
