package javaSE.advance.date;

import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

/**
 * @Author Diao Rui
 * @Date 2023/6/20 10:48
 * @PackageName:javaSE.advance.date
 * @ClassName: localTimeDate
 * @Description: TODO
 * @Version 1.0
 */
public class localTimeDate {

    @Test
    public void test1() {
        //now()：获取当前时间对应的对象
        LocalDate localDate = LocalDate.now();
        LocalTime localTime = LocalTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println(localDate);
        System.out.println(localTime);
        System.out.println(localDateTime);

        //获取指定的日期、时间对应的实例
        LocalDate localDate1 = LocalDate.of(2022, 12, 13);
        LocalTime localTime1 = LocalTime.of(14, 25, 25);
        LocalDateTime localDateTime1 = LocalDateTime.of(2022, 12, 13, 13, 13, 25);
        System.out.println(localDate1);
        System.out.println(localTime1);
        System.out.println(localDateTime1);

        //get相关操作
        LocalDateTime localDateTime2 = LocalDateTime.now();
        System.out.println(localDateTime2.getDayOfMonth());
        //体现不可变性
        //with相关操作（set）
        LocalDateTime localDateTime3 = localDateTime2.withDayOfMonth(15);
        System.out.println(localDateTime2);
        System.out.println(localDateTime3);


    }

    @Test
    public void test2() {
        Instant instant = Instant.now();
        System.out.println(instant);
        //获取我们时区的时间戳
        OffsetDateTime offsetDateTime = instant.atOffset(ZoneOffset.ofHours(8));
        System.out.println(offsetDateTime);

        //获取当前毫秒数
        System.out.println(instant.toEpochMilli());
        Instant instant1 = Instant.ofEpochMilli(instant.toEpochMilli());
    }

    @Test
    public void test5(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        //将日期时间格式化为自定义字符串
        String format = dateTimeFormatter.format(now);
        System.out.println(format);
        //将字符串转为时间日期
        TemporalAccessor parse = dateTimeFormatter.parse("2022-11-25 22:33:15");
        String format1 = dateTimeFormatter.format(parse);
        System.out.println(format1);
    }
}
