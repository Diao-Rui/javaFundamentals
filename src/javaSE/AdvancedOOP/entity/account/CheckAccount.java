package javaSE.AdvancedOOP.entity.account;

/**
 * @Author Diao Rui
 * @Date 2023/5/24 16:14
 * @PackageName:javaSE.AdvancedOOP.entity.account
 * @ClassName: CheckAccount
 * @Description: TODO
 * @Version 1.0
 */
public class CheckAccount extends Account {
    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        //调用父类构造器
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            //调用父类被重写的方法
            super.withdraw(amount);
        } else if (amount <= getBalance() + overdraft) {
            setBalance(0);
            overdraft -= amount;
            System.out.println(amount + ",取款成功，剩余额度为" + overdraft);
        } else {
            System.out.println("透支余额不足，取款失败");
        }
    }
}
