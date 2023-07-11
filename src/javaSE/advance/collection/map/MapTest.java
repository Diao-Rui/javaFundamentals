package javaSE.advance.collection.map;

import org.junit.Test;

import java.util.*;

/**
 * @Author Diao Rui
 * @Date 2023/6/26 14:33
 * @PackageName:javaSE.advance.collection.map
 * @ClassName: MapTest
 * @Description: TODO
 * @Version 1.0
 */
public class MapTest {

    @Test
    public void test() {
        Map<String, List<String>> map = new HashMap<>();
        ArrayList<String> sings = new ArrayList<>();
        sings.add("夜曲");
        sings.add("青花瓷");
        sings.add("稻香");
        sings.add("发如雪");
        sings.add("东风破");
        map.put("周杰伦", sings);
        ArrayList<String> list = new ArrayList<>();
        list.add("美人女");
        list.add("可惜没如果");
        list.add("背对背拥抱");
        list.add("西厢");
        map.put("林俊杰", list);

        Set<Map.Entry<String, List<String>>> entries = map.entrySet();
        for (Map.Entry<String, List<String>> entry : entries) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}
