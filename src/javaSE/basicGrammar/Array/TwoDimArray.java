package javaSE.basicGrammar.Array;

/**
 * @Author Diao Rui
 * @Date 2023/5/13 13:40
 * @PackageName:javaSE.basicGrammar.Array
 * @ClassName: TwoDimArray
 * @Description: TODO
 * @Version 1.0
 */
public class TwoDimArray {
    public static void main(String[] args) {
        String arr1[][] = new String[3][2];
        int[][] arr2 = new int[4][];
        arr2[1] = new int[5];
        arr2[1][1] = 1;
        //报空指针异常，没有指向一维数组的地址
        //arr2[2][2] = 1;

        //重现分配空间，先前的指向会被全部销毁（被垃圾回收机制处理掉）
        arr2 = new int[3][];

        int arr[][] = new int[][]{{1, 2, 3}, {4, 5}, {6, 7}, {8, 9, 10}};
        sum(arr);
    }

    public static void sum(int arr[][]) {
        int res = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                res += arr[i][j];
            }
        }
        System.out.println("所有元素和为:" + res);
    }
}
