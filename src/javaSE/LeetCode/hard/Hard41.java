package javaSE.LeetCode.hard;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Diao Rui
 * @Date 2023/6/14 17:34
 * @PackageName:javaSE.LeetCode.hard
 * @ClassName: Hard41
 * @Description: 41. 缺失的第一个正数
 * @Version 1.0
 */
public class Hard41 {
    public static void main(String[] args) {
        System.out.println(new Hard41().firstMissingPositive(new int[]{7,8,9,11,12}));
    }
    public int firstMissingPositive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        int i = 1;
        while (true) {
            if (!set.contains(i))
                return i;
            i++;
        }
    }
}
