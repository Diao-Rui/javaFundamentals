package javaSE.advance.collection;

import org.junit.Test;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @Author Diao Rui
 * @Date 2023/6/26 9:55
 * @PackageName:javaSE.advance.collection
 * @ClassName: TreeSetTest
 * @Description: TODO
 * @Version 1.0
 */
public class TreeSetTest {
    @Test
    public void test1() {
        TreeSet treeSet = new TreeSet();

        treeSet.add("cc");
        treeSet.add("aa");
        treeSet.add("bb");
        treeSet.add("dd");
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test2() {
        TreeSet treeSet = new TreeSet();
        treeSet.add(new User("tom", 18));
        treeSet.add(new User("jerry", 35));
        treeSet.add(new User("lucy", 25));
        treeSet.add(new User("caffee", 20));
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void test3() {

        TreeSet treeSet = new TreeSet(new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof User && o2 instanceof User) {
                    User u1 = (User) o1;
                    User u2 = (User) o2;

                    return u1.getAge() - u2.getAge();
                }
                throw new RuntimeException("类型不匹配");
            }
        });
        treeSet.add(new User("tom", 18));
        treeSet.add(new User("jerry", 35));
        treeSet.add(new User("lucy", 25));
        treeSet.add(new User("caffee", 20));
        Iterator iterator = treeSet.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
