package javaSE.LeetCode.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author Diao Rui
 * @Date 2023/7/7 10:27
 * @PackageName:javaSE.LeetCode.medium
 * @ClassName: 3. 无重复字符的最长子串
 * @Description: TODO
 * @Version 1.0
 */
public class Medium3 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("aaabacdaa"));
    }

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> ans = new HashSet<>();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            int j = i;
            while (j < s.length() && !ans.contains(s.charAt(j))) {
                ans.add(s.charAt(j));
                j++;
            }
            max = Math.max(max, ans.size());
            ans.clear();
        }
        return max;
    }

    public static int method(String s) {
        Map<Character, Integer> ans = new HashMap<>();
        int max = 0, left = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ans.containsKey(s.charAt(i))) {
                left = Math.max(left, ans.get(s.charAt(i)) + 1);
            }
            ans.put(s.charAt(i), i);
            max = Math.max(max, i - left + 1);
        }
        return max;
    }
}
