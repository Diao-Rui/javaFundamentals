package javaSE.LeetCode.medium;

import javaSE.utils.ListUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Diao Rui
 * @Date 2023/6/15 14:24
 * @PackageName:javaSE.LeetCode.medium
 * @ClassName: Medium1177
 * @Description: TODO
 * @Version 1.0
 */
public class Medium1177 {
    public static void main(String[] args) {
        List<Boolean> list = new Medium1177().canMakePaliQueries("abcda", new int[][]{{3, 3, 0}, {1, 2, 0}, {0, 3, 1}, {0, 3, 2}, {0, 4, 1}});
        ListUtils.showBoolean(list);
    }

//    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
//        List<Boolean> res = new ArrayList<>();
//        for (int[] query : queries) {
//            res.add(isValid(s.substring(query[0], query[1] + 1), query[2]));
//        }
//        return res;
//    }

    public boolean isValid(String str, int k) {
        System.out.println(str + " " + k);
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                if (k > 0)
                    k--;
                else
                    break;
            }
            i++;
            j--;
        }
        return i >= j;
    }

    public List<Boolean> canMakePaliQueries(String s, int[][] queries) {
        int n = s.length();
        //前缀和
        //abcda
        //0 1
        //0 1 3 5 4
        int[] count = new int[n + 1];
        for (int i = 0; i < n; i++) {
            count[i + 1] = count[i] ^ (1 << (s.charAt(i) - 'a'));
        }
        List<Boolean> res = new ArrayList<>();
        for (int[] query : queries) {
            int l = query[0], r = query[1], k = query[2];
            int bits = 0, x = count[r + 1] ^ count[l];
            while (x > 0) {
                x &= x - 1;
                bits++;
            }
            res.add(bits <= k * 2 + 1);
        }
        return res;
    }

}
