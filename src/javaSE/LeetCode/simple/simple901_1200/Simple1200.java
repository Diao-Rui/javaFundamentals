package javaSE.LeetCode.simple.simple901_1200;

import javaSE.utils.ArrayUtilsStatic;
import org.junit.Test;

import java.util.*;

/**
 * @Author Diao Rui
 * @Date 2023/6/20 16:46
 * @PackageName:javaSE.LeetCode.simple.simple901_1200
 * @ClassName: Simple1200
 * @Description: 1200. 最小绝对差
 * @Version 1.0
 */
public class Simple1200 {
    public static void main(String[] args) {
        System.out.println(new Simple1200().minimumAbsDifference(new int[]{4, 2, 1, 3}));
    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        //排序
        Arrays.sort(arr);
        ArrayUtilsStatic.showArray(arr);
        int min = Integer.MAX_VALUE;
        int temp = 0;
        //寻找最小值
        //一正一负相加，两正两负相减
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < arr.length - 1; i++) {
            temp = Math.abs(arr[i + 1] - arr[i]);
            if (temp < min) {
                //更新最小值
                min = temp;
                //清空结果
                res.clear();
                List<Integer> first = new ArrayList<>();
                first.add(arr[i]);
                first.add(arr[i + 1]);
                res.add(first);
            } else if (temp == min) {
                List<Integer> first = new ArrayList<>();
                first.add(arr[i]);
                first.add(arr[i + 1]);
                res.add(first);
            }
        }
        return res;
    }
}
