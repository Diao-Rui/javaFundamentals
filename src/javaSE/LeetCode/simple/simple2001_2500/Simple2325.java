package javaSE.LeetCode.simple.simple2001_2500;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Diao Rui
 * @Date 2023/6/26 17:44
 * @PackageName:javaSE.LeetCode.simple.simple2001_2500
 * @ClassName: Simple2325
 * @Description: TODO
 * @Version 1.0
 */
public class Simple2325 {
    public static void main(String[] args) {
        System.out.println(decodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

    public static String decodeMessage(String key, String message) {
        char temp = 'a';
        Map<Character, Character> map = new HashMap<>();
        for (int i = 0; i < key.length(); i++) {
            if (key.charAt(i) == ' ')
                continue;

            if (!map.containsKey(key.charAt(i))) {
                map.put(temp++, key.charAt(i));
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char t = message.charAt(i);
            if (t == ' ')
                res.append(t);
            else {
                res.append(map.get(message.charAt(i)));
            }
        }
        return res.toString();
    }
}
