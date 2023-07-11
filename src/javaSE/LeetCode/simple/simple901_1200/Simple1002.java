package javaSE.LeetCode.simple.simple901_1200;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author Diao Rui
 * @Date 2023/6/16 14:17
 * @PackageName:javaSE.LeetCode.simple.simple901_1200
 * @ClassName: Simple1002
 * @Description: 1002. 查找共用字符
 * @Version 1.0
 */
public class Simple1002 {
    public static void main(String[] args) {

    }

    public List<String> commonChars(String[] words) {
        Set<Character> set = new HashSet<>();
        List<String> res = new ArrayList<>();
        //将第一个字符串的所有元素放入集合中
        for (int i = 0; i < words.length; i++) {
            set.add(words[0].charAt(i));
        }
        return null;
    }
}
