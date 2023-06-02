package test.oop;

import org.junit.Test;

/**
 * @Author Diao Rui
 * @Date 2023/6/2 15:26
 * @PackageName:test.oop
 * @ClassName: WrapperTest
 * @Description: TODO
 * @Version 1.0
 */
public class WrapperTest {
    /*
     * 基本数据类型---》包装类
     * 包装类---》基本数据类型
     * */
    @Test
    public void test1() {
        int a = 10;
        //使用包装类构造器
        Integer A = new Integer(a);
        System.out.println(A.toString());

        float b = 10.0f;
        Float B = new Float(b);
        System.out.println(B.toString());

        boolean c = true;
        Boolean C = new Boolean(c);
        System.out.println(C.toString());
        //第二中使用valueOF
        Integer A1 = Integer.valueOf(a);
    }

    @Test
    public void test2() {
        int a=10;
        Integer A = a;
        int b=A;
    }
    @Test
    public void test3(){
        String str="1234";
        int a=Integer.parseInt(str);
    }
}
