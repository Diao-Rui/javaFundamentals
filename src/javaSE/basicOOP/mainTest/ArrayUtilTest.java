package javaSE.basicOOP.mainTest;


import javaSE.basicOOP.entity.ArrayUtils;

/**
 * @Author Diao Rui
 * @Date 2023/5/20 13:41
 * @PackageName:javaSE.basicOOP.mainTest
 * @ClassName: ArrayUtilTest
 * @Description: 数组工具类测试类
 * @Version 1.0
 */
public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtils utils = new ArrayUtils();
        int arr[] = {5, 87, -8, -9, 215, 15, 36, -7, 69, -52};
        utils.showArray(arr);
        System.out.println("max=" + utils.max(arr));
        System.out.println("min=" + utils.min(arr));
        System.out.println("sum=" + utils.sum(arr));
        System.out.println("mean=" + utils.mean(arr));
        System.out.println("数组反转：");
        utils.reverse(arr);
        utils.showArray(arr);
        int index = utils.find(arr, 5);
        show(index);
        index = utils.binaryFind(arr, 5);
        show(index);

    }

    public static void show(int index) {
        if (index == -1)
            System.out.println("没有这个数");
        else
            System.out.println("这个数在第" + index + "位置上");
    }



}
