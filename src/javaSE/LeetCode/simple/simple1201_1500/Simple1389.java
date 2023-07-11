package javaSE.LeetCode.simple.simple1201_1500;

import javaSE.basicOOP.entity.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Diao Rui
 * @Date 2023/6/6 17:39
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple1389
 * @Description: TODO
 * @Version 1.0
 */
public class Simple1389 {
    public static void main(String[] args) {
        ArrayUtils utils = new ArrayUtils();
        utils.showArray(createTargetArray(new int[]{0, 1, 2, 3, 4}, new int[]{0, 1, 2, 2, 1}));
    }

    public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> res = new ArrayList<>();
        int i=0;
        for (int value : index) {
            res.add(value, nums[i++]);
        }
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }
}
