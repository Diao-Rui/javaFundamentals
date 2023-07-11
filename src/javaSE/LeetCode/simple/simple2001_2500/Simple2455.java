package javaSE.LeetCode.simple;

/**
 * @Author Diao Rui
 * @Date 2023/5/29 10:04
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple2455
 * @Description: 2455. 可被三整除的偶数的平均值
 * @Version 1.0
 */
public class Simple2455 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 4, 7, 10};
        System.out.println(averageValue(nums));
    }

    public static int averageValue(int[] nums) {
        int count = 0;
        int res = 0;
        for (int num : nums) {
            if (num % 3 == 0 && num % 2 == 0) {
                count++;
                res += num;
            }
        }
        return count > 0 ? (res / count) : 0;
    }
}
