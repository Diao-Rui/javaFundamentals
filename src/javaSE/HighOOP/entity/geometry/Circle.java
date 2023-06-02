package javaSE.HighOOP.entity.geometry;

/**
 * @Author Diao Rui
 * @Date 2023/5/30 16:39
 * @PackageName:javaSE.HighOOP.entity.geometry
 * @ClassName: Circle
 * @Description: TODO
 * @Version 1.0
 */
public class Circle extends GeometricObject {
    //静态（所有对象共用）常量（不能被修改）
    private final static double PI = 3.14;
    private double radius;

    /*
     * 抽象类也有构造器
     * 因为子类创建对象时一定会调用父类的构造器加载父类的属性和方法
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /*
     * 必须实现所有的抽象方法，不然该类依然是抽象类，
     * 因为子类会继承父类所有的属性和方法
     * */
    @Override
    public double findArea() {
        return PI * radius * radius;
    }

    @Override
    public double findPerimeter() {
        return 2 * PI * radius;
    }
}
