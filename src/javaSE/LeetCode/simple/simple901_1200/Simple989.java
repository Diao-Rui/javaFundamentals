package javaSE.LeetCode.simple.simple901_1200;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Diao Rui
 * @Date 2023/6/28 17:02
 * @PackageName:javaSE.LeetCode.simple.simple901_1200
 * @ClassName: Simple989
 * @Description: 989. 数组形式的整数加法
 * @Version 1.0
 */
public class Simple989 {
    public static void main(String[] args) {
        System.out.println(addToArrayForm(new int[]{9, 9, 9, 9, 9, 9, 9, 9, 9, 9}, 1));
    }

    public static List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> res = new ArrayList<>();
        int i = num.length - 1, flag = 0;
        while (i >= 0 && k > 0) {
            int temp = num[i] + k % 10 + flag;
            if (temp >= 10)
                flag = 1;
            else
                flag = 0;
            res.add(0, temp % 10);
            k /= 10;
            i--;
        }
        while (i >= 0) {
            int temp = num[i] + flag;
            if (temp >= 10)
                flag = 1;
            else
                flag = 0;
            res.add(0, temp % 10);
            i--;

        }
        while (k > 0) {
            int temp = k % 10 + flag;
            if (temp >= 10)
                flag = 1;
            else
                flag = 0;
            res.add(0, temp % 10);
            k /= 10;
        }
        if (flag == 1)
            res.add(0, 1);
        return res;
    }
}
