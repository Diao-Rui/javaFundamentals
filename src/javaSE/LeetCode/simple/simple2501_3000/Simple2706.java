package javaSE.LeetCode.simple.simple2501_3000;

/**
 * @Author Diao Rui
 * @Date 2023/5/31 16:54
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple2706
 * @Description: TODO
 * @Version 1.0
 */
public class Simple2706 {
    public static void main(String[] args) {
        int[] prices = new int[]{2,2,2};
        int money = 3;
        System.out.println(buyChoco(prices, money));
    }

    public static int buyChoco(int[] prices, int money) {
        for (int i = 0; i < 2; i++) {
            int min = prices[i];
            int t = i;
            for (int j = i + 1; j < prices.length; j++) {
                if (prices[j] < min) {
                    min = prices[j];
                    t = j;
                }
            }
            if (t != i) {
                int temp = prices[i];
                prices[i] = prices[t];
                prices[t] = temp;
            }
        }
        return (prices[0] + prices[1]) <= money ? money - (prices[0] + prices[1]) : money;
    }
}
