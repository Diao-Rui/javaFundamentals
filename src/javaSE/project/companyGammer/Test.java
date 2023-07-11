package javaSE.project.companyGammer;

/**
 * @Author Diao Rui
 * @Date 2023/7/7 15:18
 * @PackageName:javaSE.project.companyGammer
 * @ClassName: Test
 * @Description: TODO
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Company company = new Company("DR");
        company.entry(new Employee("张三",18,15000,Position.ENGINEER));
        company.entry(new Employee("李四",20,15000,Position.ENGINEER));
        company.entry(new Employee("王五",20,15000,Position.ENGINEER));
        CompanyUtils.saveInfo(company);
        CompanyUtils.showEmployee(CompanyUtils.getInfo());
    }
}
