package javaSE.LeetCode.simple.simple2501_3000;

/**
 * @Author Diao Rui
 * @Date 2023/6/2 16:24
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple2656
 * @Description: 2656. K 个元素的最大和
 * @Version 1.0
 */
public class Simple2656 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5};
        int k=3;
        System.out.println(maximizeSum(nums,k));
    }

    public static int maximizeSum(int[] nums, int k) {
        int max = nums[0], res = 0;
        for (int i = 1; i < nums.length; i++) {
            max = max > nums[i] ? max : nums[i];
        }
        for (int i = 0; i < k; i++) {
            res += max++;
        }
        return res;
    }
}
