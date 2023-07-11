package javaSE.advance.fanxing;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @Author Diao Rui
 * @Date 2023/6/27 11:28
 * @PackageName:javaSE.advance.fanxing
 * @ClassName: CompareTest
 * @Description: TODO
 * @Version 1.0
 */
public class CompareTest {
    public static void main(String[] args) {
//        //插入的元素自动按规则排序
//        TreeSet<Employee> employees = new TreeSet<>();
//        //调用compareTo方法排序
//        employees.add(new Employee("tom", "man", new MyDate(2000, 11, 12)));
//        employees.add(new Employee("jerry", "woman", new MyDate(1998, 5, 12)));
//        employees.add(new Employee("lucy", "woman", new MyDate(2005, 10, 12)));
//        employees.add(new Employee("ali", "man", new MyDate(1997, 6, 12)));

        //插入的元素自动按规则排序
        TreeSet<Employee> employees = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.compareTo(o2);
            }
        });
        //调用compareTo方法排序
        employees.add(new Employee("tom", "man", new MyDate(2000, 11, 12)));
        employees.add(new Employee("jerry", "woman", new MyDate(1998, 5, 12)));
        employees.add(new Employee("lucy", "woman", new MyDate(2005, 10, 12)));
        employees.add(new Employee("ali", "man", new MyDate(2008, 6, 12)));
        //此时元素已经按照姓名排列
        for (Employee next : employees) {
            System.out.println(next);
        }
        //定制排序

    }
}
