package javaSE.basicGrammar.test;

/**
 * @Author Diao Rui
 * @Date 2023/4/25 17:19
 * @PackageName:javaSE.basicGrammar.test
 * @ClassName: 定义圆周率为3.14，现有3个圆半径分别为1.2、2.5、6，求他们的面积
 * @Description: TODO
 * @Version 1.0
 */
public class FloatDoubleExer {
    public static void main(String[] args) {
        float pi = 3.14f;
        float r1 = 1.2f, r2 = 2.5f, r3 = 6f;
        float area1 = pi * r1 * r1;
        float area2 = pi * r2 * r2;
        float area3 = pi * r3 * r3;
        System.out.println(area1);
        System.out.println(area2);
        System.out.println(area3);

    }

}
