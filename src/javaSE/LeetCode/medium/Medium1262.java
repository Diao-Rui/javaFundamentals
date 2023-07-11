package javaSE.LeetCode.medium;

import javaSE.utils.ArrayUtilsStatic;

import java.util.Arrays;

/**
 * @Author Diao Rui
 * @Date 2023/6/19 10:36
 * @PackageName:javaSE.LeetCode.medium
 * @ClassName: Medium1262
 * @Description: 1262. 可被三整除的最大和
 * @Version 1.0
 */
public class Medium1262 {
    public static void main(String[] args) {
        System.out.println(new Medium1262().maxSumDivThree(new int[]{3,6,5,1,8}));
    }

    public int maxSumDivThree(int[] nums) {
        int[] f = {0, Integer.MIN_VALUE, Integer.MIN_VALUE};
        for (int num : nums) {
            int[] g = new int[3];
            System.arraycopy(f, 0, g, 0, 3);
            for (int i = 0; i < 3; ++i) {
                g[(i + num % 3) % 3] = Math.max(g[(i + num % 3) % 3], f[i] + num);
            }
            f = g;
        }
        return f[0];
    }
}
