package javaSE.project.companyGammer;

import java.io.*;
import java.util.Scanner;

/**
 * @Author Diao Rui
 * @Date 2023/7/7 15:04
 * @PackageName:javaSE.project.companyGammer
 * @ClassName: CompanyUtils
 * @Description: TODO
 * @Version 1.0
 */
public class CompanyUtils {
    public static void menu() {
        System.out.println("******职工管理系统******");
        System.out.println("******1.添加职员    ******");
        System.out.println("******2.查询职员    ******");
        System.out.println("******3.删除职员    ******");
        System.out.println("******4.查看所有职员******");
        System.out.println("******0.退出系统    ******");
    }

    public static void showPosition() {
        System.out.println("******职位列表  ******");
        System.out.println("******1.普通职工******");
        System.out.println("******2.技工    ******");
        System.out.println("******3.工程师  ******");
        System.out.println("******4.经理    ******");
        System.out.println("******5.总裁    ******");
    }

    public static void add(Company company, Scanner cin) {
        System.out.print("请输入员工姓名:");
        String name = cin.next();
        int age = 0;
        double salary = 0;
        Position position = null;
        do {
            System.out.print("请输入员工年龄:");
            age = cin.nextInt();
        } while (age <= 0 || age >= 150);
        do {
            System.out.print("请输入员工薪水:");
            salary = cin.nextDouble();
        } while (salary <= 0 || salary >= 100000);
        do {
            showPosition();
            System.out.print("请选择职位：");
            int chose = cin.nextInt();
            switch (chose) {
                case 1:
                    position = Position.EMPLOYEE;
                    break;
                case 2:
                    position = Position.MECHANIC;
                    break;
                case 3:
                    position = Position.ENGINEER;
                    break;
                case 4:
                    position = Position.MANAGE;
                    break;
                case 5:
                    position = Position.PRESIDENT;
                    break;
            }
        } while (position == null);
        company.entry(new Employee(name, age, salary, position));
    }

    public static void showEmployee(Company company) {
        System.out.println(company.getName() + "当前有员工:");
        for (Employee employee : company.getEmployees()) {
            System.out.println(employee);
        }
    }

    public static void saveInfo(Company company) {
        ObjectOutputStream oos = null;
        try {
            File file = new File("src/javaSE/project/companyGammer/info.txt");
            oos = new ObjectOutputStream(new FileOutputStream(file));
            oos.writeObject(company);
            oos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (oos != null)
                    oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static Company getInfo() {
        ObjectInputStream ois = null;
        Company company = null;
        try {
            File file = new File("src/javaSE/project/companyGammer/info.txt");
            ois = new ObjectInputStream(new FileInputStream(file));
            company = (Company) ois.readObject();
            return company;
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ois != null)
                    ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return company;
        }
    }
}
