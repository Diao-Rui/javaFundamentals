package javaSE.LeetCode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Diao Rui
 * @Date 2023/6/3 15:58
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple2544
 * @Description: 2544. 交替数字和
 * @Version 1.0
 */
public class Simple2544 {
    public static void main(String[] args) {
        int n = 886996;
        System.out.println(alternateDigitSum(n));
    }

    public static int alternateDigitSum(int n) {
        List<Integer> vector = new ArrayList<>();
        while (n > 0) {
            vector.add(n % 10);
            n /= 10;
        }
        int res = 0, flag = 1;
        for (int i = vector.size() - 1; i >= 0; i--) {
            res += vector.get(i) * flag;
            flag *= -1;
        }
        return res;
    }
}
