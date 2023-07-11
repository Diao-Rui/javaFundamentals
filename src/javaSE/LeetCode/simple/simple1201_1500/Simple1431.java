package javaSE.LeetCode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Diao Rui
 * @Date 2023/6/7 10:48
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple1431
 * @Description: 1431. 拥有最多糖果的孩子
 * @Version 1.0
 */
public class Simple1431 {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();
        int max = candies[0];
        for (int i = 1; i < candies.length; i++)
            max = max > candies[i] ? max : candies[i];
        for (int candy : candies)
            res.add((candy + extraCandies) >= max);
        return res;
    }
}
