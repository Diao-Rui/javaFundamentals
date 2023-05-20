package javaSE.basicOOP.mainTest;

/**
 * @Author Diao Rui
 * @Date 2023/5/19 17:00
 * @PackageName:javaSE.basicOOP.mainTest
 * @ClassName: MethodTest
 * @Description: TODO
 * @Version 1.0
 */
public class MethodTest {
    public static void main(String[] args) {
        MethodTest test = new MethodTest();
        //test.test1();
        System.out.println("矩形的面积为" + test.test2(10, 8));
        Circle circle = new Circle();
        System.out.println(circle.area(2));
    }

    public void test1(int m, int n) {
        for (int i = 0; i < m; i++) {
            if (i == 0 || i == m - 1) {
                for (int j = 0; j < n; j++) {
                    System.out.print('*');
                }
            } else {
                System.out.print('*');
                for (int j = 1; j < n - 1; j++) {
                    System.out.print(' ');
                }
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public int test2(int m, int n) {
        test1(m, n);
        return m * n;
    }

}

class Circle {
    double PI = 3.14;

    public double area(double r) {
        return PI * r * r;
    }
}