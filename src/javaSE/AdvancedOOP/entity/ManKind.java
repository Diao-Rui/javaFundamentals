package javaSE.AdvancedOOP.entity;

/**
 * @Author Diao Rui
 * @Date 2023/5/24 10:33
 * @PackageName:javaSE.AdvancedOOP.entity
 * @ClassName: ManKind
 * @Description: TODO
 * @Version 1.0
 */
public class ManKind {
    public int sex;
    public int salary;

    public ManKind() {

    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public ManKind(int sex, int salary) {
        this.salary = salary;
        this.sex = sex;
    }

    public void manOrEWoman() {
        if (sex == 0)
            System.out.println("woman");
        else if (sex == 1)
            System.out.println("man");
        else
            System.out.println("性别有误");
    }

    public void employee() {
        if (salary == 0)
            System.out.println("no job");
        else if (salary > 0)
            System.out.println("job");
        else
            System.out.println("工资有误");
    }
}
