package javaSE.HighOOP.entity.enumTest;

/**
 * @Author Diao Rui
 * @Date 2023/6/1 14:54
 * @PackageName:javaSE.HighOOP.entity.enumTest
 * @ClassName: WeekTest
 * @Description: TODO
 * @Version 1.0
 */
public class WeekTest {
    public static void main(String[] args) {
        System.out.println(Week.MONDAY.getWEEK_NAME());
        //toString
        System.out.println(Week.MONDAY.toString());
        //name
        System.out.println(Week.Friday.name());
        //values
        Week[] weeks = Week.values();
        for (Week week : weeks) {
            System.out.println(week.toString());
        }
        //valueOf（name）:返回当前枚举类中名称为name的枚举对象
        //如果枚举对象不存在，则报错
        //Week.valueOf("week");
        Week monday = Week.valueOf("MONDAY");
        System.out.println(monday);

    }
}
