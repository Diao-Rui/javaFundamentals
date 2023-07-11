package javaSE.LeetCode.simple.simple301_600;

/**
 * @Author Diao Rui
 * @Date 2023/5/25 16:36
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple520
 * @Description: TODO
 * @Version 1.0
 */
public class Simple520 {
    public static void main(String[] args) {
        String word = "false";
        System.out.println(detectCapitalUse(word));
    }
    public static boolean detectCapitalUse(String word) {
        if (word.length() == 1)
            return true;
        int len = 0;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
                len++;
        }
        //全大写或全小写
        if (len == word.length() || len == 0)
            return true;
            //判断首字母是否大写
        else
            return len == 1 && (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z');
    }
}
