package javaSE.LeetCode.simple.simple2501_3000;

/**
 * @Author Diao Rui
 * @Date 2023/5/30 17:30
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple2697
 * @Description: 2697. 字典序最小回文串
 * @Version 1.0
 */
public class Simple2697 {
    public static void main(String[] args) {
        String str = "egcfe";
        System.out.println(makeSmallestPalindrome(str));
    }

    //    public static String makeSmallestPalindrome(String s) {
//        int i = 0, j = s.length() - 1;
//        StringBuilder res = new StringBuilder(s);
//        System.out.println(res);
//        while (i < j) {
//            if (s.charAt(i) != s.charAt(j)) {
//                if (s.charAt(i) > s.charAt(j)) {
//                    res.setCharAt(i, s.charAt(j));
//                } else {
//                    res.setCharAt(j, s.charAt(i));
//                }
//            }
//            i++;
//            j--;
//        }
//        return res.toString();
//    }
    public static String makeSmallestPalindrome(String s) {
        int i = 0, j = s.length() - 1;
        //字符串转为字符数组
        char[] str = s.toCharArray();
        while (i < j) {
            if (str[i] != str[j]) {
                if (str[i] > str[j]) {
                    str[i] = str[j];
                } else {
                    str[j] = str[i];
                }
            }
            i++;
            j--;
        }
        return new String(str);
    }
}
