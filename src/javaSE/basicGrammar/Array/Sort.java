package javaSE.basicGrammar.Array;

/**
 * @Author Diao Rui
 * @Date 2023/5/12 17:19
 * @PackageName:javaSE.basicGrammar.Array
 * @ClassName: Sort
 * @Description: TODO
 * @Version 1.0
 */
public class Sort {
    public static void main(String[] args) {
        int arr[] = {12, 25, 14, 23, 75, 26, 45};
        //bubbleSort(arr);
        quickSort(arr, 0, arr.length - 1);
        Utils.showArray(arr);
    }
    //冒泡排序
    public static void bubbleSort(int[] array) {
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            //添加哨兵，减少不必要的循环
            boolean flag = false;
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    // swap elements
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                    flag = true;
                }
            }
            Utils.showArray(array);
            //当着一趟排序没有元素交换，说明整体已有序
            if (flag == false)
                break;
        }
    }
    //快速排序
    public static void quickSort(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        //以第一个数为基准
        int pivot = arr[left];
        int i = left, j = right;
        while (i <= j) {
            //从前往后找第一个比基准大的数
            while (arr[i] < pivot) {
                i++;
            }
            //从后往前找第一个比基准小的数
            while (arr[j] > pivot) {
                j--;
            }
            //交换这两个数
            if (i <= j) {
                int tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        //快排左边
        quickSort(arr, left, j);
        //快排右边
        quickSort(arr, i, right);
    }
    //选择排序
    public static void selectionSort(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }
    }
    //插入排序

}
