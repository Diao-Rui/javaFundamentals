package javaSE.AdvancedOOP.entity.account;

/**
 * @Author Diao Rui
 * @Date 2023/5/24 16:08
 * @PackageName:javaSE.AdvancedOOP.entity.account
 * @ClassName: Account
 * @Description: TODO
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public double getMonthlyInterest() {
        return annualInterestRate / 12;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("存款金额有误");
        } else {
            balance += amount;
            System.out.println(amount + ",存款成功");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("存款金额有误");
        } else if (amount > balance) {
            System.out.println("取款金额不足");
        } else {
            balance -= amount;
            System.out.println(amount + ",取款成功");
        }
    }
}
