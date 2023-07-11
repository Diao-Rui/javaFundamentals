package javaSE.LeetCode.simple.simple1201_1500;

/**
 * @Author Diao Rui
 * @Date 2023/7/1 14:16
 * @PackageName:javaSE.LeetCode.simple.simple1201_1500
 * @ClassName: Simple1266
 * @Description: 1266. 访问所有点的最小时间
 * @Version 1.0
 */
public class Simple1266 {
    public static void main(String[] args) {
        System.out.println(minTimeToVisitAllPoints(new int[][]{{1,1},{3,4},{-1,0}}));
    }

    public static int minTimeToVisitAllPoints(int[][] points) {
        int res = 0;
        for (int i = 1; i < points.length; i++) {
            int x = points[i - 1][0], y = points[i - 1][1];
            int targetJ = points[i][0], targetK = points[i][1];
            while (x != targetJ || y != targetK) {
                if (x == targetJ) {
                    res += Math.abs(y - targetK);
                    break;
                } else if (y == targetK) {
                    res += Math.abs(x - targetJ);
                    break;
                } else {
                    if (targetJ > x) {
                        x++;
                    } else {
                        x--;
                    }
                    if (targetK > y) {
                        y++;
                    } else {
                        y--;
                    }
                    res++;
                }
            }
        }
        return res;
    }
}
