package javaSE.LeetCode.simple;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author Diao Rui
 * @Date 2023/5/27 14:58
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple448
 * @Description: 448. 找到所有数组中消失的数字
 * @Version 1.0
 */
public class Simple448 {
    public static void main(String[] args) {
        int[] nums = new int[]{1};
        System.out.println(findDisappearedNumbers(nums));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int num : nums) set.add(num);
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i))
                res.add(i);
        }
        return res;
    }
}
