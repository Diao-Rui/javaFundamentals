package javaSE.advance.compare.comparable;

import javaSE.utils.ArrayUtilsStatic;
import org.junit.Test;

import java.util.Arrays;

/**
 * @Author Diao Rui
 * @Date 2023/6/20 14:27
 * @PackageName:javaSE.advance.compare.comparable
 * @ClassName: ComparableTets
 * @Description: TODO
 * @Version 1.0
 */
public class ComparableTest {

    @Test
    public void test() {
        //非自定义排序
        String[] arr = new String[]{"Tom", "Jerry", "Lucy", "LiLi"};

        Arrays.sort(arr);
        ArrayUtilsStatic.showArray(arr);
    }

    /*
     * 自定义排序
     * */
    @Test
    public void test1() {
        Phone[] phones = new Phone[4];
        phones[0] = new Phone("Hua wei", 6999);
        phones[1] = new Phone("Xiao mi", 4999);
        phones[2] = new Phone("Iphone", 8999);
        phones[3] = new Phone("Vivo", 5999);
        Arrays.sort(phones);
        for (Phone phone : phones) {
            System.out.println(phone);
        }
    }
}
