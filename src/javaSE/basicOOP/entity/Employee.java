package javaSE.basicOOP.entity;

/**
 * @Author Diao Rui
 * @Date 2023/5/23 10:02
 * @PackageName:javaSE.basicOOP.entity
 * @ClassName: Employee
 * @Description: TODO
 * @Version 1.0
 */
public class Employee {
    private String name;
    private char gender;
    private int age;
    private String telPhoneNumber;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getTelPhoneNumber() {
        return telPhoneNumber;
    }

    public void setTelPhoneNumber(String telPhoneNumber) {
        this.telPhoneNumber = telPhoneNumber;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", telPhoneNumber='" + telPhoneNumber + '\'' +
                '}';
    }
}
