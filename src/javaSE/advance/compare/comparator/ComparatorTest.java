package javaSE.advance.compare.comparator;

import javaSE.advance.compare.comparable.Phone;
import javaSE.utils.ArrayUtilsStatic;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author Diao Rui
 * @Date 2023/6/20 14:52
 * @PackageName:javaSE.advance.compare.comparator
 * @ClassName: ComparatorTest
 * @Description: TODO
 * @Version 1.0
 */
public class ComparatorTest {

    @Test
    public void test1() {
        Phone[] phones = new Phone[4];
        phones[0] = new Phone("Hua wei", 6999);
        phones[1] = new Phone("Xiao mi", 4999);
        phones[2] = new Phone("Iphone", 8999);
        phones[3] = new Phone("Vivo", 5999);

        //创建一个comparator接口大的实现类的对象
        Comparator comparator = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Phone && o2 instanceof Phone) {
                    Phone p1 = (Phone) o1;
                    Phone p2 = (Phone) o2;
                    int compare = Double.compare(p1.getPrice(), p2.getPrice());
                    if (compare == 0) {
                        return p1.getName().compareTo(p2.getName());
                    }
                    return compare;
                }
                throw new RuntimeException("类型不匹配");
            }
        };
        Arrays.sort(phones, comparator);
        for (Phone phone : phones) {
            System.out.println(phone);
        }
    }

    @Test
    public void test() {
        //非自定义排序
        String[] arr = new String[]{"Tom", "Jerry", "Lucy", "LiLi"};

        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof String && o2 instanceof String) {
                    String s1 = (String) o1;
                    String s2 = (String) o1;

                    return -s1.compareTo(s2);
                }
                throw new RuntimeException("类型不匹配");
            }
        });
        ArrayUtilsStatic.showArray(arr);
    }
}
