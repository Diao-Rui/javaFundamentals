package javaSE.utils;

/**
 * @Author Diao Rui
 * @Date 2023/6/8 14:34
 * @PackageName:javaSE.utils
 * @ClassName: ArrayUtilsStatic
 * @Description: TODO
 * @Version 1.0
 */
public class ArrayUtilsStatic {
    public static void showArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void showArray(char[] arr) {
        for (char value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void showArray(int[][] arr) {
        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    public static void showArray(String[] arr) {
        for (String obj : arr) {
            System.out.println(obj);
        }
    }
}
