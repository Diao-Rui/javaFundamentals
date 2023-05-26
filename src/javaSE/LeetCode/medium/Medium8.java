package javaSE.LeetCode.medium;

/**
 * @Author Diao Rui
 * @Date 2023/5/25 16:56
 * @PackageName:javaSE.LeetCode.medium
 * @ClassName: Medium8
 * @Description: TODO
 * @Version 1.0
 */
public class Medium8 {
    public static void main(String[] args) {
        String str = "   -+98745415 +++645645661";
        System.out.println(myAtoi(str));
    }

    public static int myAtoi(String s) {
        //判断正负数
        boolean flag = true;
        long res = 0;
        int i = 0;
        //寻找第一个字符
        while (i < s.length()) {
            if (s.charAt(i) == '+' || s.charAt(i) == '-') {
                if (i + 1 < s.length() && !(s.charAt(i + 1) >= '0' && s.charAt(i + 1) <= '9')) {
                    return 0;
                }
                if (s.charAt(i) == '-')
                    flag = false;
            } else {
                if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    break;
                }
                if (s.charAt(i) != ' ' && s.charAt(i) != '-' && s.charAt(i) != '+')
                    return 0;
            }
            i++;
        }
        while (i < s.length()) {
            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                res = res * 10 + (s.charAt(i) - '0');
                if (res > Integer.MAX_VALUE) {
                    return flag ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
            } else break;
            i++;
        }
        return (int) (flag ? res : -1 * res);
    }
}
