package javaSE.LeetCode.simple.simple2501_3000;

/**
 * @Author Diao Rui
 * @Date 2023/6/1 16:40
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple2710
 * @Description: 2710. 移除字符串中的尾随零
 * @Version 1.0
 */
public class Simple2710 {
    public static void main(String[] args) {
        String s = "51230100";
        System.out.println(removeTrailingZeros(s));
    }

    public static String removeTrailingZeros(String num) {
        int i = num.length() - 1;
        while (i >= 0) {
            if (num.charAt(i) != '0')
                break;
            i--;
        }
        return num.substring(0, i + 1);
    }
}
