package javaSE.LeetCode.simple.simple1201_1500;

import javaSE.basicOOP.entity.ArrayUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/**
 * @Author Diao Rui
 * @Date 2023/6/6 17:16
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple1313
 * @Description: TODO
 * @Version 1.0
 */
public class Simple1313 {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4};
        ArrayUtils utils = new ArrayUtils();
        utils.showArray(decompressRLElist(nums));
    }

    public static int[] decompressRLElist(int[] nums) {
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < nums.length; i += 2) {
            System.out.println(nums[i]);
            for (int j = 0; j < nums[i]; j++) {
                res.add(nums[i + 1]);
            }
        }
        //集合转基本数据类型数组
        return res.stream().mapToInt(Integer::valueOf).toArray();
    }
}
