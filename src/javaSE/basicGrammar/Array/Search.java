package javaSE.basicGrammar.Array;

/**
 * @Author Diao Rui
 * @Date 2023/5/13 15:18
 * @PackageName:javaSE.basicGrammar.Array
 * @ClassName: Search
 * @Description: TODO
 * @Version 1.0
 */
public class Search {
    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 7, 9, 11, 15}, target = 7;
        linearSearch(arr, target);
        binarySearch(arr, 11);
    }

    //线性查找
    public static void linearSearch(int arr[], int target) {
        int res = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                res = i + 1;
                break;
            }
        }
        if (res == -1) {
            System.out.println("数组中没有" + target);
        } else {
            System.out.println(target + "是数组的第" + res + "个元素");
        }
    }

    //二分查找
    public static void binarySearch(int arr[], int target) {
        int i = 0, j = arr.length - 1, res = -1;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == target) {
                res = mid + 1;
                break;
            } else if (arr[mid] > target)
                j = mid - 1;
            else
                i = mid + 1;
        }
        if (res == -1) {
            System.out.println("数组中没有" + target);
        } else {
            System.out.println(target + "是数组的第" + res + "个元素");
        }
    }
}
