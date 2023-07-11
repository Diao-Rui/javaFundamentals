package javaSE.LeetCode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Diao Rui
 * @Date 2023/5/29 16:26
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple500
 * @Description: TODO
 * @Version 1.0
 */
public class Simple500 {
    public static void main(String[] args) {
        String[] words = new String[]{"Aasdfghjkl", "Qwertyuiop", "zZxcvbnm"};
        show(findWords(words));
    }

    public static String[] findWords(String[] words) {
        List<String> res = new ArrayList<>();
        String s1 = "qwertyuiop", s2 = "asdfghjkl", s3 = "zxcvbnm";
        for (String word : words) {
            String temp = word.toLowerCase();
            if (s1.contains(temp.charAt(0) + "")) {
                add(res, s1, word, temp);
            } else if (s2.contains(temp.charAt(0) + "")) {
                add(res, s2, word, temp);
            } else if (s3.contains(temp.charAt(0) + "")) {
                add(res, s3, word, temp);
            }
        }
        return res.toArray(new String[res.size()]);
    }

    public static void add(List<String> res, String s1, String temp, String words) {
        int j = 1;
        while (j < words.length()) {
            if (!s1.contains(words.charAt(j) + ""))
                break;
            j++;
        }
        if (j >= words.length())
            res.add(temp);
    }

    public static void show(String[] strs) {
        for (String str : strs) {
            System.out.println(str);
        }
    }
}
