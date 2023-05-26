package javaSE.AdvancedOOP.entity.account;

/**
 * @Author Diao Rui
 * @Date 2023/5/24 16:23
 * @PackageName:javaSE.AdvancedOOP.entity.account
 * @ClassName: AccountTest
 * @Description: TODO
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        AccountTest test = new AccountTest();
        test.testCheckAccount();
    }

    public void testAccount() {
        Account account = new Account(1001, 5000, 2.5);
        account.deposit(1000);
        account.withdraw(7000);
        System.out.println("年利率为：" + account.getAnnualInterestRate());
        System.out.println("剩余金额为：" + account.getBalance());
    }

    public void testCheckAccount() {
        CheckAccount account = new CheckAccount(1001, 5000, 2.5, 20000);
        account.deposit(1000);
        account.withdraw(7000);
        System.out.println("年利率为：" + account.getAnnualInterestRate());
        System.out.println("剩余金额为：" + account.getBalance());
    }
}
