package javaSE.LeetCode.simple.simple2001_2500;

import java.util.Arrays;

/**
 * @Author Diao Rui
 * @Date 2023/6/27 9:45
 * @PackageName:javaSE.LeetCode.simple.simple2001_2500
 * @ClassName: Simple2500
 * @Description: TODO
 * @Version 1.0
 */
public class Simple2500 {
    public static void main(String[] args) {
        System.out.println(deleteGreatestValue(new int[][]{{1, 2, 4}, {3, 3, 1}}));
    }

    public static int deleteGreatestValue(int[][] grid) {
        // 每行从小到大排序（操作的是他的地址，是可以修改成功的）
        for (int[] m : grid) {
            Arrays.sort(m);
        }

        int res = 0;
        // 按列倒序遍历，找到每列的最大值，相加
        for (int i = grid[0].length - 1; i >= 0; i--) {
            int maxVal = 0;
            for (int[] ints : grid) {
                if (ints[i] > maxVal) {
                    maxVal = ints[i];
                }
            }
            res += maxVal;
        }

        return res;
    }
}
