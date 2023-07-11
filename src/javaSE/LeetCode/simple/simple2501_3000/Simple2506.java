package javaSE.LeetCode.simple.simple2501_3000;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Diao Rui
 * @Date 2023/6/30 14:18
 * @PackageName:javaSE.LeetCode.simple.simple2501_3000
 * @ClassName: Simple2506
 * @Description: 2506. 统计相似字符串对的数目
 * @Version 1.0
 */
public class Simple2506 {
    public static void main(String[] args) {
        System.out.println(new Simple2506().similarPairs(new String[]{"aabb", "ab", "ba"}));
    }

    public int similarPairs(String[] words) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        for (String word : words) {
            int temp = sum(word);
            if (set.contains(temp)) {
                res++;
            }
            set.add(temp);
        }
        return set.size() == 1 ? res + 1 : res;
    }

    public int sum(String word) {
        Set<Character> set = new HashSet<>();
        int sum = 0;
        for (int i = 0; i < word.length(); i++) {
            set.add(word.charAt(i));
        }
        for (Character c : set) {
            sum += c;
        }
        return sum;
    }
}
