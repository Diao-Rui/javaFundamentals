package javaSE.LeetCode.simple.simple901_1200;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Diao Rui
 * @Date 2023/6/16 13:48
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple961
 * @Description: 961. 在长度 2N 的数组中找出重复 N 次的元素
 * 题目中谈到有n+1个不同的元素，那么就只有重复的元素会出现N次，找到重复元素即可
 * @Version 1.0
 */
public class Simple961 {
    public static void main(String[] args) {
        System.out.println(new Simple961().repeatedNTimes(new int[]{1, 2, 2, 1, 1, 3, 3}));
    }

    public int repeatedNTimes(int[] nums) {
        Set<Integer> found = new HashSet<Integer>();
        for (int num : nums) {
            if (!found.add(num)) {
                return num;
            }
        }
        // 不可能的情况
        return -1;
    }
}
