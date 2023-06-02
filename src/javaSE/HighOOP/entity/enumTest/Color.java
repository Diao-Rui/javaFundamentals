package javaSE.HighOOP.entity.enumTest;

/**
 * @Author Diao Rui
 * @Date 2023/6/1 15:59
 * @PackageName:javaSE.HighOOP.entity.enumTest
 * @ClassName: Color
 * @Description: TODO
 * @Version 1.0
 */
public enum Color {
    RED(255, 0, 0, "红色"),
    ORANGE(255, 128, 0, "橙色"),
    YELLOW(255, 255, 0, "黄色"),
    GREEN(0, 255, 0, "绿色"),
    CYAN(0, 255, 255, "青色"),
    BLUE(0, 0, 255, "蓝色"),
    PURPLE(128, 0, 255, "紫色");
    private final int red;
    private final int green;
    private final int blue;
    private final String desc;

    Color(int red, int green, int blue, String desc) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.desc = desc;
    }

    @Override
    public String toString() {
        //enum类的toString返回的是对象名称
        return super.toString() + "(" + red + "," + green + "," + blue + ")==>" + desc;
    }
}
