package javaSE.basicGrammar.Array;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @Author Diao Rui
 * @Date 2023/5/13 16:43
 * @PackageName:javaSE.basicGrammar.Array
 * @ClassName: ArraysTest
 * @Description: TODO
 * @Version 1.0
 */
public class ArraysTest {
    public static void main(String[] args) {
        int a[] = new int[]{1, 2, 3, 4};
        int b[] = new int[]{1, 2, 3, 4};
        //比较两个数组
        boolean flag = Arrays.equals(a, b);
        //把数组元素转为字符串输出
        System.out.println(Arrays.toString(a));
        //将指定值填充到数组中
        Arrays.fill(b, 10);
        System.out.println(Arrays.toString(b));
        //数组排序（快速排序）
        int arr[] = new int[]{5, 7, 9, 4, 3, 2, 15};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //二分查找
        a = new int[]{2, 7, 8, 18, 45, 55};
        int index = Arrays.binarySearch(a, 18);
        System.out.println(index);
    }
}
