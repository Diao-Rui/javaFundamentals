package javaSE.basicGrammar.var;

/**
 * @Author Diao Rui
 * @Date 2023/4/28 10:35
 * @PackageName:javaSE.basicGrammar
 * @ClassName: CompareTest
 * @Description: 关系运算符的应用
 * @Version 1.0
 */
public class CompareTest {
    public static void main(String[] args) {
        int m1 = 10, n1 = 20;
//        == 和 =的区别
        System.out.println(m1 == n1);
        System.out.println(m1 = n1);

        System.out.println(m1 > n1);
    }
}
