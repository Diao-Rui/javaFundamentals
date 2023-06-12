package javaSE.basicGrammar.Array;

import javaSE.utils.ArrayUtilsStatic;

/**
 * @Author Diao Rui
 * @Date 2023/5/12 9:55
 * @PackageName:javaSE.basicGrammar.Array
 * @ClassName: OneDimArray
 * @Description: TODO
 * @Version 1.0
 */
public class OneDimArray {
    public static void main(String[] args) {
        //创建数组的同时给数组元素赋值
        int[] arr = new int[]{1, 2, 3};
        ArrayUtilsStatic.showArray(arr);
        //创建数组不赋值
        double[] prices = new double[5];
        //创建数组并赋值
        float arrs[] = {1, 2, 3};

        int arr1[] = new int[4];
        arr1[0] = 10;
        arr1[2] = 20;
        String[] arr2 = new String[2];
        arr2[1] = "周杰伦";
        arr2 = new String[3];
    }

}
