package javaSE.HighOOP.entity.geometry;

/**
 * @Author Diao Rui
 * @Date 2023/5/30 16:43
 * @PackageName:javaSE.HighOOP.entity.geometry
 * @ClassName: Rectangle
 * @Description: TODO
 * @Version 1.0
 */
public class Rectangle extends GeometricObject {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double findArea() {
        return width * length;
    }

    @Override
    public double findPerimeter() {
        return 2 * (length + width);
    }
}
