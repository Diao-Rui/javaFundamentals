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

    public static void quickSort(int arr[], int left, int right) {
        int part = partion(arr, left, right);
        //排序基准左边
        quickSort(arr, left, part - 1);
        //排序基准右边
        quickSort(arr, part + 1, right);
    }

    private static int partion(int[] arr, int left, int right) {
        int part = arr[left];
        while (left < right) {
            //从右往左找一个比基准小得数
            while (left < right && arr[right] >= part)
                right--;
            //从左往右找一个比基准大的数
            while (left < right && arr[left] <= part)
                left++;
            if (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }
        }
        arr[left] = part;
        return left;
    }


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
}
