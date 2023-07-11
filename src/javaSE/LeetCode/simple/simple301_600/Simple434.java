package javaSE.LeetCode.simple;

/**
 * @Author Diao Rui
 * @Date 2023/5/24 16:38
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple434
 * @Description: 434. 字符串中的单词数
 * @Version 1.0
 */
public class Simple434 {
    public static void main(String[] args) {
        String str = "1 1 1 1 1 1   2   3 44";
        System.out.println(countSegments(str));
    }

    public static int countSegments(String s) {
        int i = 0, j = 0;
        int count = 0;
        while (i < s.length() && j < s.length()) {
            i = j;
            //去除所有空格
            while (i < s.length() && s.charAt(i) == ' ')
                i++;
            if (i >= s.length())
                break;
            j = i;
            //寻找单词
            while (j < s.length() && s.charAt(j) != ' ')
                j++;
            count++;
        }
        return count;
    }
}
