package javaSE.advance.collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

/**
 * @Author Diao Rui
 * @Date 2023/6/21 14:33
 * @PackageName:javaSE.advance.collection
 * @ClassName: ArrayListTest
 * @Description: TODO
 * @Version 1.0
 */
public class ArrayListTest {
    @Test
    public void test1() {
        List list = new ArrayList();
        //新增
        list.add(2);
        list.add("hello");
        list.add(new Cat("lucy", 5));

        List list1 = new ArrayList();
        list1.add(3);
        list1.add("lili");

        //add输入集合则将整个集合当做一个元素
        //addAll会将集合中所有元素分别存入集合中
        list.add(list1);
        list.addAll(list1);
        System.out.println(list);
        //删除元素
        list.remove(list1);
        //输入的为基本数据类型为索引，需要包装类
        list.remove(2);
        list.remove(Integer.valueOf(2));
        System.out.println(list);

        //遍历
        //迭代器遍历
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        //foreach
        for (Object object : list) {
            System.out.println(object);
        }
        //普通for
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    @Test
    public void test2() {
        ArrayList list = new ArrayList();
        Random random = new Random();
        String str = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 30; i++) {
            list.add(str.charAt(random.nextInt(26)));
        }
        System.out.println(list);
        int countA = 0, countB = 0, countC = 0, countX = 0;
        for (Object o : list) {
            Character character= (Character) o;
            if (character=='a') {
                countA++;
            } else if (character=='b') {
                countB++;
            } else if (character=='c') {
                countC++;
            } else if (character=='x') {
                countX++;
            }
        }
        System.out.println(countA);
        System.out.println(countB);
        System.out.println(countC);
        System.out.println(countX);
    }
}
