package javaSE.LeetCode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Diao Rui
 * @Date 2023/6/22 17:12
 * @PackageName:javaSE.LeetCode.medium
 * @ClassName: Medium98
 * @Description: TODO
 * @Version 1.0
 */
public class Medium98 {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3}));
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        res.add(temp);
        for(int i=0;i<nums.length;i++){
            temp=new ArrayList<>();
            temp.add(nums[i]);
            res.add(temp);
            for (int j=i;j<nums.length;j++){
                temp=new ArrayList<>();
                temp.add(nums[j]);
                res.add(temp);
            }
        }
        return res;
    }
}
