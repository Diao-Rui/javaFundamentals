package javaSE.basicOOP.mainTest;

import javaSE.basicOOP.entity.Employee;

import java.util.Scanner;

/**
 * @Author Diao Rui
 * @Date 2023/5/23 10:07
 * @PackageName:javaSE.basicOOP.mainTest
 * @ClassName: EmployeeTest
 * @Description: TODO
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.print("输入员工数量:");
        int len = cin.nextInt();
        Employee[] employees = new Employee[len];
        EmployeeTest test = new EmployeeTest();
        test.inputs(employees, len);
        test.show(employees);
    }

    public void inputs(Employee[] employees, int len) {
        Scanner cin = new Scanner(System.in);
        for (int i = 0; i < len; i++) {
            System.out.println("添加第" + (i + 1) + "个员工");
            employees[i] = new Employee();
            System.out.print("请输入姓名:");
            employees[i].setName(cin.next());
            System.out.print("请输入性别:");
            employees[i].setGender(cin.next().charAt(0));
            System.out.print("请输入年龄:");
            employees[i].setAge(cin.nextInt());
            System.out.print("请输入电话:");
            employees[i].setTelPhoneNumber(cin.next());
        }
    }

    public void show(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.toString());
        }
    }
}
