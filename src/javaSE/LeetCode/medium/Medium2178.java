package javaSE.LeetCode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Diao Rui
 * @Date 2023/7/6 9:55
 * @PackageName:javaSE.LeetCode.medium
 * @ClassName: Medium2178
 * @Description: 2178. 拆分成最多数目的正偶数之和
 * @Version 1.0
 */
public class Medium2178 {
    public static void main(String[] args) {
        System.out.println(maximumEvenSplit(12));
    }

    public static List<Long> maximumEvenSplit(long finalSum) {
        //奇数肯定不行
        if (finalSum % 2 != 0)
            return new ArrayList<>();
        List<Long> ans = new ArrayList<>();
        for (long i = 2; i <= finalSum; i+=2) {
            ans.add(i);
            finalSum -= i;
        }
        ans.set(ans.size() - 1, ans.get(ans.size() - 1) + finalSum);
        return ans;
    }
}
