package javaSE.AdvancedOOP.entity.circle;

/**
 * @Author Diao Rui
 * @Date 2023/5/24 14:47
 * @PackageName:javaSE.AdvancedOOP.entity.circle
 * @ClassName: Circle
 * @Description: TODO
 * @Version 1.0
 */
public class Circle {
    public double Pi = 3.14;
    private double radius;
    public Circle(){
        System.out.println("Circle constructor...");
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Pi * radius * radius;
    }

    public double findVolume() {
        return 4 / 3.0 * Pi * radius * radius * radius;
    }
}
