package javaSE.LeetCode.simple;

/**
 * @Author Diao Rui
 * @Date 2023/6/16 13:48
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple961
 * @Description: 961. 在长度 2N 的数组中找出重复 N 次的元素
 * @Version 1.0
 */
public class Simple961 {
    public static void main(String[] args) {
        System.out.println(new Simple961().repeatedNTimes(new int[]{5,1,5,2,5,3,5,4}));
    }

    public int repeatedNTimes(int[] nums) {
        int res = nums[0], count = 1;
        for (int num : nums) {
            if (res == num) {
                count++;
            } else {
                if (count > 0)
                    count--;
                else {
                    count = 1;
                    res = num;
                }
            }
        }
        return res;
    }
}
