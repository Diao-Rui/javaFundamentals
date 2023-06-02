package javaSE.HighOOP.entity.enumTest;

/**
 * @Author Diao Rui
 * @Date 2023/6/1 14:24
 * @PackageName:javaSE.HighOOP.entity.enumTest
 * @ClassName: Season
 * @Description: TODO
 * @Version 1.0
 */
//jdk5之前定义枚举类
public class Season {
    //提供给外界使用的固定对象
    //这些对象不能被修改，只能查看所以必须是静态常量对象
    public static final Season SPRING = new Season("春天", "春暖花开");
    public static final Season SUMMER = new Season("夏天", "夏日炎炎");
    public static final Season AUTUMN = new Season("秋天", "秋高气爽");
    public static final Season WINTER = new Season("冬天", "白雪皑皑");
    //为了不能被修改属性设置为常量
    private final String SEASON_NAME;
    private final String SEASON_DESC;

    public Season(String SEASON_NAME, String SEASON_DESC) {
        this.SEASON_NAME = SEASON_NAME;
        this.SEASON_DESC = SEASON_DESC;
    }

    public String getSEASON_NAME() {
        return SEASON_NAME;
    }

    public String getSEASON_DESC() {
        return SEASON_DESC;
    }

    @Override
    public String toString() {
        return "Season{" +
                "SEASON_NAME='" + SEASON_NAME + '\'' +
                ", SEASON_DESC='" + SEASON_DESC + '\'' +
                '}';
    }
}
