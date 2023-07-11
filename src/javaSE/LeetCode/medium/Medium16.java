package javaSE.LeetCode.medium;

import java.util.Arrays;

/**
 * @Author Diao Rui
 * @Date 2023/7/10 10:00
 * @PackageName:javaSE.LeetCode.medium
 * @ClassName: Medium16
 * @Description: 16. 最接近的三数之和
 * @Version 1.0
 */
public class Medium16 {
    public static void main(String[] args) {
        System.out.println(threeSumClosest(new int[]{-1, 2, 1, -4}, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int len = nums.length;
        Arrays.sort(nums);
        int min = 10000, res = 0;
        for (int i = 0; i < len; i++) {
            int left = i + 1;
            int right = len - 1;
            while (left < right) {
                int temp = nums[i] + nums[left] + nums[right];
                if (temp == target) {
                    return target;
                }
                if (Math.abs(target - temp) < min) {
                    min = Math.abs(target - temp);
                    res = temp;
                }
                if (temp > target)
                    right--;
                else
                    left++;
            }
        }
        return res;
    }
}
