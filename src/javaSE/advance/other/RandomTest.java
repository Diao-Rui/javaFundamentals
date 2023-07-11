package javaSE.advance.other;

import org.junit.Test;

import java.util.Random;

/**
 * @Author Diao Rui
 * @Date 2023/6/20 15:40
 * @PackageName:javaSE.advance.other
 * @ClassName: RandomTest
 * @Description: TODO
 * @Version 1.0
 */
public class RandomTest {
    @Test
    public void test1(){
        Random random =new Random();
        //[0,100-1]
        System.out.println(random.nextInt(100));
    }
}
