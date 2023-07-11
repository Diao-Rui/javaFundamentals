package javaSE.project.companyGammer;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

/**
 * @Author Diao Rui
 * @Date 2023/7/5 9:42
 * @PackageName:javaSE.project.companyGammer
 * @ClassName: Employee
 * @Description: TODO
 * @Version 1.0
 */
public class Employee implements Serializable {
    private UUID ID;
    private String name;
    private int age;
    private double salary;
    private Position position;

    public Employee(String name, int age, double salary, Position position) {
        this.ID = UUID.randomUUID();
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.position = position;
    }

    public UUID getID() {
        return ID;
    }

    public void setID(UUID ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("比较函数被调用");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(ID, employee.ID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, name, age, salary, position);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", position=" + position.getName() +
                '}';
    }
}
