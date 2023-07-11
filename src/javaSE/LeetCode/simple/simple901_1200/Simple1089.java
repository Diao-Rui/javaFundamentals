package javaSE.LeetCode.simple.simple901_1200;

import java.util.Arrays;

/**
 * @Author Diao Rui
 * @Date 2023/6/28 17:34
 * @PackageName:javaSE.LeetCode.simple.simple901_1200
 * @ClassName: Simple1089
 * @Description: TODO
 * @Version 1.0
 */
public class Simple1089 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] temp = new int[n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            if (k >= n) {
                break;
            }
            if (arr[i] == 0) {
                temp[k++] = 0;
                if (k < n) {
                    temp[k++] = 0;
                }
            } else {
                temp[k++] = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
    }
}
