package javaSE.LeetCode.medium;

/**
 * @Author Diao Rui
 * @Date 2023/6/14 9:26
 * @PackageName:javaSE.LeetCode.medium
 * @ClassName: Medium1375
 * @Description: 在第I次翻转后，希望【1，I】全为1，相当于1到前I次的最大值之间全为1
 * 对数组进行遍历，记录最大值，然后判断当前的索引是否为最大值，如果是则答案+1，因为
 * 数组是从0开始的然而题目中说的是1-N所以判断时需要+1
 * @Version 1.0
 */
public class Medium1375 {
    public static void main(String[] args) {
        System.out.println(new Medium1375().numTimesAllBlue(new int[]{3, 2, 4, 1, 5}));
    }

    public int numTimesAllBlue(int[] flips) {
        int len = flips.length;
        int[] res = new int[len];
        int count = 0, max = 0;
        for (int flip : flips) {
            res[flip - 1] = 1;
            max = Math.max(max, flip);
            count += isValid(max, res) ? 1 : 0;
        }
        return count;
    }

    public boolean isValid(int j, int[] res) {
        int i = 0;
        while (i < j) {
            if (res[i] == 0)
                return false;
            i++;
        }
        return true;
    }

    public int solve(int[] flips) {
        int len = flips.length;
        int res = 0, max = 0;
        for (int i = 0; i < len; i++) {
            max = Math.max(max, flips[i]);
            //索引到了最大值，说明前面的都已经翻转过了
            if (max == i + 1)
                res++;
        }
        return res;
    }
}
