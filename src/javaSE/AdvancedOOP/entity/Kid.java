package javaSE.AdvancedOOP.entity;

/**
 * @Author Diao Rui
 * @Date 2023/5/24 10:39
 * @PackageName:javaSE.AdvancedOOP.entity
 * @ClassName: Kid
 * @Description: TODO
 * @Version 1.0
 */
public class Kid extends ManKind {
    private int yearOld;

    public Kid(int yearOld) {
        this.yearOld = yearOld;
    }

    public Kid(int sex, int salary, int yearOld) {
        //调用父类构造器
//        super(sex, salary);
        setSalary(salary);
        setSex(sex);
        this.yearOld = yearOld;
    }

    public int getYearOld() {
        return yearOld;
    }

    public void setYearOld(int yearOld) {
        this.yearOld = yearOld;
    }

    public void printAge() {
        System.out.println("年纪为:" + yearOld);
    }
}
