package javaSE.dataStructure.test;

import javaSE.basicOOP.entity.ArrayUtils;
import javaSE.dataStructure.list.MyList;
import javaSE.dataStructure.list.MyVector;

/**
 * @Author Diao Rui
 * @Date 2023/5/25 11:36
 * @PackageName:javaSE.dataStructure.test
 * @ClassName: ListTest
 * @Description: TODO
 * @Version 1.0
 */
public class ListTest {
    public static void main(String[] args) {

        ArrayUtils utils = new ArrayUtils();
        testVector(utils);
    }

    public static void testList(ArrayUtils utils) {
        MyList list = new MyList(10);

        utils.showArray(list.getArr());
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * (100) + 1));
        }
        utils.showArray(list.getArr());
        System.out.println(list.indexOf(5));
        System.out.println(list.remove(5));
        utils.showArray(list.getArr());
    }

    public static void testVector(ArrayUtils utils) {
        MyVector vector = new MyVector();
        utils.showArray(vector.getArr());
        for (int i = 0; i < 20; i++) {
            vector.add((int) (Math.random() * (100) + 1));
        }
        utils.showArray(vector.getArr());
        System.out.println(vector.indexOf(5));
        System.out.println(vector.remove(5));
        utils.showArray(vector.getArr());
    }
}
