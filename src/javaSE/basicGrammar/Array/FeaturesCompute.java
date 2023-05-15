package javaSE.basicGrammar.Array;

/**
 * @Author Diao Rui
 * @Date 2023/5/13 14:15
 * @PackageName:javaSE.basicGrammar.Array
 * @ClassName: 求最大值、最小值、平均值、总和等
 * @Description: TODO
 * @Version 1.0
 */
public class FeaturesCompute {
    public static void main(String[] args) {
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
        }
//        test1(arr);
//        test2(arr);
//        test3(10);
        //test4(10);
        reverse(arr);
    }

    public static void test1(int[] arr) {
        int max = arr[0], min = arr[0], sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
            min = min < arr[i] ? min : arr[i];
            sum += arr[i];
        }
        System.out.println("分数为：");
        Utils.showArray(arr);
        System.out.println("最大值为：" + max);
        System.out.println("最小值为：" + min);
        System.out.println("总和为：" + sum);
        System.out.println("均值为：" + sum / 10.0);
    }

    public static void test2(int[] arr) {
        int max = arr[0], min = arr[0], sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            max = max > arr[i] ? max : arr[i];
            min = min < arr[i] ? min : arr[i];
            sum += arr[i];
        }
        System.out.println("分数为：");
        Utils.showArray(arr);
        System.out.println("去掉一个最高分和一个最低分的均值为：" + (sum - max - min) / 8.0);
    }

    //计算10层杨辉三角
    public static void test3(int n) {
        int[][] arr = new int[n][];
        arr[0] = new int[]{1};
        arr[1] = new int[]{1, 1};
        for (int i = 2; i < n; i++) {
            arr[i] = new int[i + 1];
            arr[i][0] = arr[i][i] = 1;
            for (int j = 1; j < i; j++) {
                arr[i][j] = arr[i - 1][j] + arr[i - 1][j - 1];
            }
        }
        //输出杨辉三角
        Utils.showArray(arr);
    }

    //存储N个不相同的随机数
    public static void test4(int n) {
        int arr[] = new int[n];
        int i = 0;
        while (i < n) {
            int temp = (int) (Math.random() * (100 - 1 + 1) + 1);
            boolean flag = true;
            for (int j = 0; j < i; j++) {
                if (temp == arr[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                arr[i++] = temp;
            }
        }
        Utils.showArray(arr);
    }

    //数组反转
    public static void reverse(int arr[]) {
        System.out.println("原数组为：");
        Utils.showArray(arr);
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("反转后的数组为：");
        Utils.showArray(arr);
    }
}
