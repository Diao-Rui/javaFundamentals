package javaSE.HighOOP.test;

import javaSE.HighOOP.entity.Account;

/**
 * @Author Diao Rui
 * @Date 2023/5/29 14:15
 * @PackageName:javaSE.HighOOP.test
 * @ClassName: AccountTest
 * @Description: TODO
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account a1=new Account("123456",2000);
        System.out.println(a1);
        System.out.println("年利率为："+Account.getInterestRate());
        System.out.println("最小余额为："+Account.getMinBalance());
        Account a2=new Account("123456",5000);
        System.out.println(a2);
        System.out.println("年利率为："+Account.getInterestRate());
        System.out.println("最小余额为："+Account.getMinBalance());
    }
}
