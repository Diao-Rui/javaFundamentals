package javaSE.advance.collection.map;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author Diao Rui
 * @Date 2023/7/1 15:03
 * @PackageName:javaSE.advance.collection.map
 * @ClassName: Simple1
 * @Description: 1. 两数之和
 * @Version 1.0
 */
public class Simple1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
