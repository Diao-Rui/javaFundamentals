package javaSE.basicGrammar.Array;

/**
 * @Author Diao Rui
 * @Date 2023/5/13 14:23
 * @PackageName:javaSE.basicGrammar.Array
 * @ClassName: Utils
 * @Description: TODO
 * @Version 1.0
 */
public class Utils {
    public static void showArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void showArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
