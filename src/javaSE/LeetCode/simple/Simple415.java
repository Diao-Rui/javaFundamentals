package javaSE.LeetCode.simple;

/**
 * @Author Diao Rui
 * @Date 2023/5/23 16:15
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple415
 * @Description: 415. 字符串相加
 * @Version 1.0
 */
public class Simple415 {
    public static void main(String[] args) {
        String a = "1", b = "9";
        String str=addStrings(a, b);
        System.out.println(str);
    }

    //  8 2 1
    //9 9 9 9
    //
    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, flag = 0;
        StringBuilder res = new StringBuilder();
        while (i >= 0 && j >= 0) {
            int a = num1.charAt(i) - '0';
            int b = num2.charAt(j) - '0';
            int temp = a + b + flag;
            res.insert(0, (char) (temp % 10 + '0'));
            flag = temp >= 10 ? 1 : 0;
            i--;
            j--;
        }
        while (i >= 0) {
            int temp = (num1.charAt(i) - '0') + flag;
            res.insert(0, (char) (temp % 10 + '0'));
            flag = temp >= 10 ? 1 : 0;
            i--;
        }
        while (j >= 0) {
            int temp = (num2.charAt(j) - '0') + flag;
            res.insert(0, (char) (temp % 10 + '0'));
            flag = temp >= 10 ? 1 : 0;
            j--;
        }
        if (flag == 1)
            res.insert(0, '1');
        return res.toString();
    }
}
