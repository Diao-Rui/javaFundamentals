package javaSE.advance.collection;

import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Diao Rui
 * @Date 2023/6/21 15:34
 * @PackageName:javaSE.advance.collection
 * @ClassName: HashSetTest
 * @Description: TODO
 * @Version 1.0
 */
public class HashSetTest {
    @Test
    public void test1(){
        Set hashSet = new HashSet();
        hashSet.add(12);
        hashSet.add("BB");
        hashSet.add("CC");
        hashSet.add(new Cat("lucy",5));
        hashSet.add(new Cat("lucy",5));
        System.out.println(hashSet);
    }
}
