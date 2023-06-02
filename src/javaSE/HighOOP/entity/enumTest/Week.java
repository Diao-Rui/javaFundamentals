package javaSE.HighOOP.entity.enumTest;

/**
 * @Author Diao Rui
 * @Date 2023/6/1 14:37
 * @PackageName:javaSE.HighOOP.entity.enumTest
 * @ClassName: Week
 * @Description: TODO
 * @Version 1.0
 */
//jdk5之后的枚举类
public enum Week {
    //对象必须声明在开头，可以有多个对象。对象之间有，隔开
    MONDAY("星期一"),
    TUESDAY("星期二"),
    WEDNESDAY("星期三"),
    THURSDAY("星期四"),
    Friday("星期五"),
    Saturday("星期六"),
    SUNDAY("星期日");
    private final String WEEK_NAME;


    Week(String WEEK_NAME) {
        this.WEEK_NAME = WEEK_NAME;
    }

    public String getWEEK_NAME() {
        return WEEK_NAME;
    }
}
