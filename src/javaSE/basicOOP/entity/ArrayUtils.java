package javaSE.basicOOP.entity;

import java.util.Arrays;

/**
 * @Author Diao Rui
 * @Date 2023/5/19 17:16
 * @PackageName:javaSE.basicOOP.entity
 * @ClassName: ArrayUtils
 * @Description: 数组工具类
 * @Version 1.0
 */
public class ArrayUtils {
    public int max(int arr[]) {
        if (isNull(arr)) return -1;
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        return max;
    }

    //方法重载
    public double max(double arr[]) {
        if (isNull(arr)) return -1;
        double max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
        }
        return max;
    }

    public int min(int arr[]) {
        if (isNull(arr)) return -1;
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = min < arr[i] ? min : arr[i];
        }
        return min;
    }

    public double min(double arr[]) {
        if (isNull(arr)) return -1;
        double min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            min = min < arr[i] ? min : arr[i];
        }
        return min;
    }

    public int sum(int arr[]) {
        if (isNull(arr)) return -1;
        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public double sum(double arr[]) {
        if (isNull(arr)) return -1;
        double sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public double mean(int arr[]) {
        return sum(arr) / (arr.length * 1.0);
    }

    public double mean(double arr[]) {
        return sum(arr) / (arr.length * 1.0);
    }

    public void showArray(int arr[]) {
        if (isNull(arr)) return;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void showArray(double arr[]) {
        if (isNull(arr)) return;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public void copy(int a[], int b[]) {
        if (isNull(a)) return;
        b = new int[a.length];
        for (int i = 0; i < a.length; i++)
            b[i] = a[i];
    }

    public void sort(int arr[]) {
        Arrays.sort(arr);
    }

    public void reverse(int arr[]) {
        if (isNull(arr)) return;
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public void reverse(double arr[]) {
        if (isNull(arr)) return;
        int i = 0, j = arr.length - 1;
        while (i < j) {
            double temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public boolean isNull(int arr[]) {
        if (arr == null)
            return true;
        return false;
    }

    public boolean isNull(double arr[]) {
        if (arr == null)
            return true;
        return false;
    }

    public int find(int arr[], int target) {
        if (isNull(arr)) return -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                return i;
        }
        return -1;
    }

    public int binaryFind(int arr[], int target) {
        if (isNull(arr)) return -1;
        Arrays.sort(arr);
        int i = 0, j = arr.length;
        while (i <= j) {
            int mid = (i + j) / 2;
            if (arr[mid] == target)
                return mid;
            else if (arr[mid] > target)
                j = mid - 1;
            else
                i = mid + 1;
        }
        return -1;
    }

    public void showArray(Object[] object) {
        for (int i = 0; i < object.length; i++) {
            System.out.println(object.toString());
        }
    }
}
