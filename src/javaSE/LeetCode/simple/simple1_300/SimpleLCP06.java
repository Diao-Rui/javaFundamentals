package javaSE.LeetCode.simple;

/**
 * @Author Diao Rui
 * @Date 2023/5/31 17:48
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: SimpleLCP06
 * @Description: LCP 06. 拿硬币
 * @Version 1.0
 */
public class SimpleLCP06 {
    public static void main(String[] args) {
        int[]coins=new int[]{1,1,1};
        System.out.println(minCount(coins));
    }

    public static int minCount(int[] coins) {
        int count = 0;
        for (int coin : coins) {
            count += coin % 2 == 0 ? coin / 2 : coin / 2 + 1;
        }
        return count;
    }
}
