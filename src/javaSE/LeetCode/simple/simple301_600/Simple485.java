package javaSE.LeetCode.simple.simple301_600;

/**
 * @Author Diao Rui
 * @Date 2023/5/29 10:12
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple485
 * @Description: 485. 最大连续 1 的个数
 * @Version 1.0
 */
public class Simple485 {
    public static void main(String[] args) {
        int[] nums=new int[]{0,0,0,0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count = 0, max = 0;
        for (int num : nums) {
            if (num == 1) {
                count++;
                max = count > max ? count : max;
            } else {
                count = 0;
            }
        }
        return max;
    }
}
