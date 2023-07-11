package javaSE.advance.collection.map;

import javaSE.advance.collection.User;
import org.junit.Test;

import java.util.*;

/**
 * @Author Diao Rui
 * @Date 2023/6/26 10:39
 * @PackageName:javaSE.advance.collection.map
 * @ClassName: HashMapTest
 * @Description: TODO
 * @Version 1.0
 */
public class HashMapTest {

    @Test
    public void test1() {
        Map map = new HashMap();
        map.put("aa", 65);
        map.put(67, "bb");
        map.put("user", new User("tom", 18));

        //遍历map的key
        Set set = map.keySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //遍历map的value
        Collection values = map.values();
        for (Object value : values) {
            System.out.println(value);
        }

        //获取键值对
        Set set1 = map.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator1.next();
            System.out.println("<" + entry.getKey() + "," + entry.getValue() + ">");
        }
    }
}
