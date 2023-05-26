package javaSE.AdvancedOOP.entity.circle;

/**
 * @Author Diao Rui
 * @Date 2023/5/24 14:57
 * @PackageName:javaSE.AdvancedOOP.entity.circle
 * @ClassName: CircleTest
 * @Description: TODO
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(2);
        System.out.println("圆的面积为：" + circle.findArea());
        System.out.println("圆的体积为：" + circle.findVolume());
        Cylinder cylinder = new Cylinder();
        cylinder.setRadius(2);
        cylinder.setHeight(2);
        System.out.println("圆柱的面积为：" + cylinder.findArea());
        System.out.println("圆柱的体积为：" + cylinder.findVolume());
    }
}
