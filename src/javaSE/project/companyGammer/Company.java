package javaSE.project.companyGammer;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @Author Diao Rui
 * @Date 2023/7/5 9:44
 * @PackageName:javaSE.project.companyGammer
 * @ClassName: Company
 * @Description: TODO
 * @Version 1.0
 */
public class Company implements Serializable {
    private UUID ID;
    private String name;
    private List<Employee> employees;

    public Company(String name) {
        ID = UUID.randomUUID();
        this.name = name;
        employees = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void entry(Employee e) {
        employees.add(e);
    }

    public void depart(Employee e) {
        employees.remove(e);
    }

    public boolean contains(Employee e) {
        return employees.contains(e);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void show() {
        System.out.println("公司名称:" + name);
        System.out.println("所有员工如下");
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
}
