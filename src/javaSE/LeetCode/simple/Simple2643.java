package javaSE.LeetCode.simple;

/**
 * @Author Diao Rui
 * @Date 2023/6/3 16:14
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple2643
 * @Description: 2643. 一最多的行
 * @Version 1.0
 */
public class Simple2643 {
    public static void main(String[] args) {

    }

    public static int[] rowAndMaximumOnes(int[][] mat) {
        int[] res = new int[]{0, 0};
        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int value : mat[i]) {
                count += value;
            }
            if (count > res[1]) {
                res[0] = i;
                res[1] = count;
            }
        }
        return res;
    }
}
