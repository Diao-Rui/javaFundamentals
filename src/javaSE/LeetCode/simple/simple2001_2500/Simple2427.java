package javaSE.LeetCode.simple.simple2001_2500;

/**
 * @Author Diao Rui
 * @Date 2023/6/1 16:47
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple2427
 * @Description: TODO
 * @Version 1.0
 */
public class Simple2427 {
    public static void main(String[] args) {
        int a = 12, b = 6;
        System.out.println(commonFactors(a, b));
    }

    public static int commonFactors(int a, int b) {
        int len = a > b ? a : b;
        int count = 1;
        for (int i = 2; i <= len; i++) {
            if (a % i == 0 && b % i == 0)
                count++;
        }
        return count;
    }
}
