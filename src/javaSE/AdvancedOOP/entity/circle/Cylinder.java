package javaSE.AdvancedOOP.entity.circle;

/**
 * @Author Diao Rui
 * @Date 2023/5/24 14:52
 * @PackageName:javaSE.AdvancedOOP.entity.circle
 * @ClassName: Cylinder
 * @Description: TODO
 * @Version 1.0
 */
public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        //调用父类构造器
        super();
        System.out.println("Cylinder constructor...");
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double findArea() {
        return Pi * getRadius() * getRadius() * 2 + 2 * Pi * getRadius() * getHeight();
    }

    @Override
    public double findVolume() {
        return Pi * getRadius() * getRadius() * getHeight();
    }
}
