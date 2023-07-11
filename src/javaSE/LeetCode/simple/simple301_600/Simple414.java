package javaSE.LeetCode.simple.simple301_600;

import java.util.TreeSet;

/**
 * @Author Diao Rui
 * @Date 2023/6/12 9:44
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple414
 * @Description: TODO
 * @Version 1.0
 */
public class Simple414 {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2147483647, -2147483648}));
    }


    public static int solve(int[] nums) {
        //有序集合（没有重复元素）
        TreeSet<Integer> set = new TreeSet<Integer>();
        for (int num : nums) {
            set.add(num);
            //长度大于3就去除第一个元素
            if (set.size() > 3) {
                set.remove(set.first());
            }
        }
        return set.size() == 3 ? set.first() : set.last();
    }
}
