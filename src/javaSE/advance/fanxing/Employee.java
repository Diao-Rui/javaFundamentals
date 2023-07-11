package javaSE.advance.fanxing;

/**
 * @Author Diao Rui
 * @Date 2023/6/27 11:29
 * @PackageName:javaSE.advance.fanxing
 * @ClassName: Employee
 * @Description: TODO
 * @Version 1.0
 */
public class Employee implements Comparable<Employee> {
    private String name;
    private String sex;
    private MyDate myDate;

    public Employee(String name, String sex, MyDate myDate) {
        this.name = name;
        this.sex = sex;
        this.myDate = myDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public MyDate getMyDate() {
        return myDate;
    }

    public void setMyDate(MyDate myDate) {
        this.myDate = myDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", myDate=" + myDate +
                '}';
    }

    /*
     * 根据姓名从大到小排序
     * */
    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.getName());
    }
}
