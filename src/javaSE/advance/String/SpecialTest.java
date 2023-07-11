package javaSE.advance.String;

import org.junit.Test;

/**
 * @Author Diao Rui
 * @Date 2023/6/19 16:14
 * @PackageName:javaSE.advance.String
 * @ClassName: SpecalTest
 * @Description: TODO
 * @Version 1.0
 */
public class SpecialTest {
    @Test
    public void test1() {
        String str = null;
        StringBuilder builder = new StringBuilder();
        builder.append(str);
        System.out.println(builder.length());
        System.out.println(builder);

        StringBuilder builder1 = new StringBuilder(str);
        System.out.println(builder1);
    }

    @Test
    public void test2() {
        String str="hello";
        StringBuilder builder = new StringBuilder("world");
        change(str,builder);
        System.out.println(str);
        System.out.println(builder);
    }

    public void change(String str, StringBuilder builder) {
        builder.append(str);
        //因为对象的引用改变了，修改String的值会引起新的对象创建
        str += builder;
    }
}
