package javaSE.LeetCode.simple;

/**
 * @Author Diao Rui
 * @Date 2023/6/14 16:35
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple766
 * @Description: 766. 托普利茨矩阵
 * @Version 1.0
 */
public class Simple766 {
    public static void main(String[] args) {
        System.out.println(new Simple766().isToeplitzMatrix(new int[][]{{1, 2}, {2, 2}}));
    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        //行向量和列向量托普利茨矩阵
        if (matrix.length == 1 || matrix[0].length == 1)
            return true;
        int m = matrix.length - 1, n = matrix[0].length - 1;
        for (int i = m; i > 0; i--) {
            for (int j = 0; j < n; j++) {
                if (matrix[i - 1][j] != matrix[i][j + 1])
                    return false;
            }
        }
        return true;
    }

    public int[] diStringMatch(String s) {
        //对于每个位置都是用贪心的思想
        //如果是I那么用当前最小值，然后把最小值+1（代表已经使用过了）
        //如果是D那么用当前最大值，然后把最大值-1（代码已经使用过了）
        //最后一个位置上使用min和max都行，因为此时他们俩相同
        int n = s.length(), min = 0, max = n;
        int[] perm = new int[n + 1];
        for (int i = 0; i < n; ++i) {
            perm[i] = s.charAt(i) == 'I' ? min++ : max--;
        }
        perm[n] = min; // 最后剩下一个数，此时 min == max
        return perm;
    }
}
