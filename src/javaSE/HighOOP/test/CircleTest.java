package javaSE.HighOOP.test;

import javaSE.HighOOP.entity.Circle;

/**
 * @Author Diao Rui
 * @Date 2023/5/29 14:03
 * @PackageName:javaSE.HighOOP.test
 * @ClassName: CircleTest
 * @Description: TODO
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(12);
        System.out.println(c1);
        System.out.println(Circle.getTotal());
        Circle c2 = new Circle(13);
        System.out.println(c2);
        System.out.println(Circle.getTotal());
    }
}
