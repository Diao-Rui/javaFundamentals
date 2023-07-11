package javaSE.LeetCode.simple.simple601_900;

import java.util.HashSet;
import java.util.Set;

/**
 * @Author Diao Rui
 * @Date 2023/6/7 10:20
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple771
 * @Description: TODO
 * @Version 1.0
 */
public class Simple771 {

    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> set = new HashSet<>();
        int res = 0;
        for (int i = 0; i < jewels.length(); i++)
            set.add(jewels.charAt(i));
        for (int i = 0; i < stones.length(); i++) {
            if (set.contains(stones.charAt(i)))
                res++;
        }
        return res;
    }
}
