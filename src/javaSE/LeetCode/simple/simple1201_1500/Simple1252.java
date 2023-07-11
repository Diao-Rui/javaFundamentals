package javaSE.LeetCode.simple.simple1201_1500;

/**
 * @Author Diao Rui
 * @Date 2023/6/21 17:12
 * @PackageName:javaSE.LeetCode.simple.simple1201_1500
 * @ClassName: Simple1252
 * @Description: TODO
 * @Version 1.0
 */
public class Simple1252 {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] dp = new int[m][n];
        int res = 0;
        for (int[] index : indices) {
            for (int j = 0; j < n; j++)
                dp[index[0]][j]++;
            for (int j = 0; j < m; j++)
                dp[j][index[1]]++;
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++)
                if (dp[i][j] % 2 == 1)
                    res++;
        }
        return res;
    }
}
