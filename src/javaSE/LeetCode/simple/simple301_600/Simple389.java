package javaSE.LeetCode.simple.simple301_600;

/**
 * @Author Diao Rui
 * @Date 2023/5/20 13:56
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple389
 * @Description: 给定两个字符串 s 和 t ，它们只包含小写字母,
 * 字符串 t 由字符串 s 随机重排，然后在随机位置添加一个字母,请找出在 t 中被添加的字母
 * @Version 1.0
 */
public class Simple389 {
    public static void main(String[] args) {
        String s = "", t = "y";
        System.out.println(findTheDifference(s, t));
    }

    //使用累加法，先将长的一个字符串的所有字符累加在一起，然后在减去短字符串中所有字符，就得到多余的字符
    public static char findTheDifference(String s, String t) {
        int sum = 0;
        for (int i = 0; i < t.length(); i++) {
            sum += t.charAt(i);
        }
        for (int i = 0; i < s.length(); i++) {
            sum -= s.charAt(i);
        }
        return (char) sum;
    }
}
