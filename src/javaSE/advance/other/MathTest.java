package javaSE.advance.other;

import org.junit.Test;

/**
 * @Author Diao Rui
 * @Date 2023/6/20 15:40
 * @PackageName:javaSE.advance.other
 * @ClassName: MathTest
 * @Description: TODO
 * @Version 1.0
 */
public class MathTest {
    @Test
    public void test1() {
        System.out.println(Math.floor(12.5));
        System.out.println(Math.floor(-12.5));
        System.out.println(Math.round(12.5));
        System.out.println(Math.round(-12.3));
        System.out.println(Math.round(-12.5));
    }
}
