package javaSE.HighOOP.entity;

/**
 * @Author Diao Rui
 * @Date 2023/5/29 13:59
 * @PackageName:javaSE.HighOOP.entity
 * @ClassName: Circle
 * @Description: TODO
 * @Version 1.0
 */
public class Circle {
    private static int total;
    private static int init = 1001;
    private double radius;
    private int id;

    public Circle() {
        this.id = init;
        init++;
        total++;
    }

    public Circle(double radius) {
        this();
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", id=" + id +
                '}';
    }

    public static int getTotal() {
        return total;
    }
}
