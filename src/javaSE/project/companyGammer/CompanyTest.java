package javaSE.project.companyGammer;

import java.util.Scanner;

/**
 * @Author Diao Rui
 * @Date 2023/7/5 9:50
 * @PackageName:javaSE.project.companyGammer
 * @ClassName: CompanyTest
 * @Description: TODO
 * @Version 1.0
 */
public class CompanyTest {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        Company company = CompanyUtils.getInfo();
        int choose = 0;
        while (true) {
            CompanyUtils.menu();
            System.out.print("请选择需要的操作：");
            choose = cin.nextInt();
            System.out.println(choose);
            if (choose == 0)
                break;
            switch (choose) {
                case 1:
                    CompanyUtils.add(company, cin);
                    break;
                case 2:
                    CompanyUtils.add(company, cin);
                    break;
                case 3:
                    CompanyUtils.add(company, cin);
                    break;
                case 4:
                    CompanyUtils.showEmployee(company);
                    break;
            }
        }
        CompanyUtils.saveInfo(company);
        System.out.println("再见，欢迎下次使用");
        cin.close();
    }


}
