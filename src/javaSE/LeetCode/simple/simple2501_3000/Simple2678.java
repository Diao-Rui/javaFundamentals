package javaSE.LeetCode.simple;

/**
 * @Author Diao Rui
 * @Date 2023/5/30 17:11
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple2678
 * @Description: TODO
 * @Version 1.0
 */
public class Simple2678 {
    public static void main(String[] args) {
        String[] details = new String[]{"7868190130M7522", "5303914400F9211", "9273338290F4010"};
        System.out.println(countSeniors(details));
    }

    public static int countSeniors(String[] details) {
        int res = 0;
        for (String str : details) {
            if ((str.charAt(11) - '0') * 10 + (str.charAt(12) - '0') > 60)
                res++;
        }
        return res;
    }
}
