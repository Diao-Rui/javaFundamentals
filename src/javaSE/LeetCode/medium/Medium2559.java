package javaSE.LeetCode.medium;

import javaSE.basicOOP.entity.ArrayUtils;

/**
 * @Author Diao Rui
 * @Date 2023/6/2 16:32
 * @PackageName:javaSE.LeetCode.medium
 * @ClassName: Medium2559
 * @Description: 2559. 统计范围内的元音字符串数
 * @Version 1.0
 */
public class Medium2559 {
    public static void main(String[] args) {
        String[] words = new String[]{"aba", "bcb", "ece", "aa", "e"};
        int[][] queries = new int[][]{{0, 2}, {1, 4}, {1, 1}};
        ArrayUtils utils = new ArrayUtils();
        Medium2559 test = new Medium2559();
        utils.showArray(test.vowelStrings(words, queries));
    }

    /*
     * 使用前缀和求解，先设计前缀数组（长度为目标数组+1）。然后从1开始判断（默认0是0），
     * 判断元素是否满足要求，下一个位置的结果为前一个位置的结果+当前位置的结果
     * 求某一区间的结果，只需要又区间的下一个位置-左区间的位置即可
     * */
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n = words.length;
        //前缀和
        int[] prefixSums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            //判断当前字符串是否为元音字符串
            int value = isVowel(words[i]) ? 1 : 0;
            prefixSums[i + 1] = prefixSums[i] + value;
        }
        int q = queries.length;
        int[] ans = new int[q];
        for (int i = 0; i < q; i++) {
            int start = queries[i][0], end = queries[i][1];
            ans[i] = prefixSums[end + 1] - prefixSums[start];
        }
        return ans;
    }

    //判断首位是否为元音字符
    public boolean isVowel(String word) {
        return isVowelLetter(word.charAt(0)) && isVowelLetter(word.charAt(word.length() - 1));
    }

    //判断是否为元音字符
    public boolean isVowelLetter(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

}
