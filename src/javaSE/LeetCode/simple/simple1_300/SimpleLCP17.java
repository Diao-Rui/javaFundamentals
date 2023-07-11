package javaSE.LeetCode.simple;

/**
 * @Author Diao Rui
 * @Date 2023/6/1 16:34
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: SimpleLCP17
 * @Description: LCP 17. 速算机器人
 * @Version 1.0
 */
public class SimpleLCP17 {
    public static void main(String[] args) {
        String s = "";
        System.out.println(calculate(s));
    }

    public static int calculate(String s) {
        int x = 1, y = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A') {
                x = 2 * x + y;
            } else {
                y = 2 * y + x;
            }
        }
        return x + y;
    }
}
