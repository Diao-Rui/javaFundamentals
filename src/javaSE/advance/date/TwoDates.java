package javaSE.advance.date;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author Diao Rui
 * @Date 2023/6/19 16:28
 * @PackageName:javaSE.advance.date
 * @ClassName: TwoDates
 * @Description: TODO
 * @Version 1.0
 */
public class TwoDates {
    @Test
    public void test1() {
        //创建一个当前系统时间的date实例
        Date date = new Date();
        System.out.println(date.toString());
        //获取当前是时间对应的毫秒数
        long time = date.getTime();
        System.out.println(time);
        //根据时间戳创建时间对象
        Date date1 = new Date(time);
        System.out.println(date1);
    }

    @Test
    public void test2() {
        java.sql.Date date = new java.sql.Date(1234156789L);
        System.out.println(date.toString());
        System.out.println(date.getTime());
    }

    @Test
    public void test3() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat();
        //将日期转为字符串
        String format = sdf.format(new Date());
        System.out.println(format);
        //将字符串转为日期
        Date parse = sdf.parse("2022-12-05 下午3:45");
        System.out.println(sdf.format(parse));
        //自定义格式
        sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss EEE");
        System.out.println(sdf.format(new Date()));
    }

    @Test
    public void test4() {
        Date date = new Date();
        //通过时间戳转换
        java.sql.Date date1 = new java.sql.Date(date.getTime());
    }

    @Test
    public void test5() throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
        String pattern = "2023-12-13";
        Date date = sdf.parse(pattern);
        java.sql.Date date1 = new java.sql.Date(date.getTime());
    }
}
