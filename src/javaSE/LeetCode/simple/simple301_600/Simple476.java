package javaSE.LeetCode.simple;

import javaSE.utils.ArrayUtilsStatic;

/**
 * @Author Diao Rui
 * @Date 2023/6/12 17:09
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple476
 * @Description: TODO
 * @Version 1.0
 */
public class Simple476 {
    public static void main(String[] args) {
        System.out.println(findComplement(10));
        String str="AVC";
        System.out.println(str.toLowerCase());
    }

    public static int findComplement(int num) {
        char[] str = Integer.toBinaryString(num).toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (str[i] == '1')
                str[i] = '0';
            else
                str[i] = '1';
        }
        int res = 0, flag = 0;
        for (int i = str.length - 1; i >= 0; i--) {
            int temp = str[i] - '0';
            res += temp << flag++;

        }
        return res;
    }
}
