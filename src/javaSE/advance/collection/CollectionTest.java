package javaSE.advance.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * @Author Diao Rui
 * @Date 2023/6/21 11:13
 * @PackageName:javaSE.advance.collection
 * @ClassName: CollectionTest
 * @Description: TODO
 * @Version 1.0
 */
public class CollectionTest {

    @Test
    public void test1() {
        Collection collection = new ArrayList();
        //添加元素
        collection.add(123);//自动装箱
        collection.add("jnu");
        collection.add(new Cat("lucy", 18));
        //添加集合
        Collection coll = new ArrayList();
        coll.add(456);
        coll.add("hell0");
        collection.addAll(coll);
        System.out.println(collection);
        //移除元素
        collection.remove(123);
        //collection.removeAll(coll);
        System.out.println(collection);
        //判断元素是否在集合中
        System.out.println(collection.contains(456));
        System.out.println(collection.contains(new Cat("lucy", 18)));
        //数组转换
        Object[] objects = collection.toArray();
        System.out.println(Arrays.toString(objects));
    }

    @Test
    public void test2() {
        Collection collection = new ArrayList();
        //添加元素
        collection.add(123);//自动装箱
        collection.add("jnu");
        collection.add(new Cat("lucy", 18));
        //获取迭代器
        //hasNext()判断是否还有下一个元素
        for (Object o : collection) {
            //获取下一个元素
            System.out.println(o);
        }
    }
}
