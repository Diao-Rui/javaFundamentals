package javaSE.basicGrammar.Array;

import javaSE.utils.ArrayUtilsStatic;

/**
 * @Author Diao Rui
 * @Date 2023/5/13 15:20
 * @PackageName:javaSE.basicGrammar.Array
 * @ClassName: ExtendArray
 * @Description: 数组的扩容和缩容
 * @Version 1.0
 */
public class ExtendArray {
    public static void main(String[] args) {
        //test1();
        test2();
    }

    public static void test1() {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        //向数组中添加10，20，30
        //新建数组并且容量是原来的一倍
        int newArr[] = new int[arr.length << 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        newArr[arr.length] = 10;
        newArr[arr.length + 1] = 20;
        newArr[arr.length + 2] = 30;
        arr = newArr;
        ArrayUtilsStatic.showArray(arr);
    }

    public static void test2() {
        int arr[] = new int[]{1, 2, 3, 4, 5};
        //删除索引为4的的元素
        int index = 4;
        for (int i = index + 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = 0;
        ArrayUtilsStatic.showArray(arr);
        index = 2;
        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }
        arr[index] = 10;
        ArrayUtilsStatic.showArray(arr);
    }
}
