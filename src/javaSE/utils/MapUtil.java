package javaSE.utils;

import java.util.Map;

/**
 * @Author Diao Rui
 * @Date 2023/6/20 17:42
 * @PackageName:javaSE.utils
 * @ClassName: MapUtil
 * @Description: TODO
 * @Version 1.0
 */
public class MapUtil {
    public static void show(Map<Integer, Integer> map) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        }
    }
}
