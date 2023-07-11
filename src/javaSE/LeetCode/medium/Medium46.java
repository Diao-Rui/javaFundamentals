package javaSE.LeetCode.medium;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Diao Rui
 * @Date 2023/7/1 16:49
 * @PackageName:javaSE.LeetCode.medium
 * @ClassName: Medium46
 * @Description: 46. 全排列
 * @Version 1.0
 */
public class Medium46 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        Medium46 solution = new Medium46();
        List<List<Integer>> lists = solution.permute(nums);
        System.out.println(lists);
    }

    public List<List<Integer>> permute(int[] nums) {
        int len = nums.length;
        // 使用一个动态数组保存所有可能的全排列
        List<List<Integer>> res = new ArrayList<>();
        if (len == 0) {
            return res;
        }
        //判断是否使用过该数字
        boolean[] used = new boolean[len];
        List<Integer> path = new ArrayList<>();
        //从第一个位置开始填
        dfs(nums, len, 0, path, used, res);
        return res;
    }

    private void dfs(int[] nums, int len, int depth,
                     List<Integer> path, boolean[] used,
                     List<List<Integer>> res) {
        //已经填满了列表
        if (depth == len) {
            res.add(new ArrayList<>(path));
            return;
        }

        /*
         * 在非叶子结点处，产生不同的分支，这一操作的语义是 ：
         * 在还未选择的数中依次选择一个元素作为下一个位置的元素，
         * 这显然得通过一个循环实现。
         * */
        for (int i = 0; i < len; i++) {
            if (!used[i]) {
                //当前位置填入未被填入的数字
                path.add(nums[i]);
                used[i] = true;
                //填当前位置的下一个位置
                dfs(nums, len, depth + 1, path, used, res);
                /*
                 * 注意：下面这两行代码发生 「回溯」，
                 * 回溯发生在从 深层结点 回到 浅层结点 的过程，代码在形式上和递归之前是对称的
                 * */
                used[i] = false;
                path.remove(path.size() - 1);
            }
        }
    }
}
