package javaSE.utils;

import java.util.List;

/**
 * @Author Diao Rui
 * @Date 2023/6/15 14:41
 * @PackageName:javaSE.utils
 * @ClassName: ListUtils
 * @Description: TODO
 * @Version 1.0
 */
public class ListUtils {
    public static void showInteger(List<Integer> list) {
        for (int value : list) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void showBoolean(List<Boolean> list) {
        for (boolean value : list) {
            System.out.print(value + " ");
        }
        System.out.println();

    }

    public static void showString(List<String> list) {
        for (String value : list) {
            System.out.println(value);
        }
    }
}
