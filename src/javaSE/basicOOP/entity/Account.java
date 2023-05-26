package javaSE.basicOOP.entity;

/**
 * @Author Diao Rui
 * @Date 2023/5/23 10:46
 * @PackageName:javaSE.basicOOP.entity
 * @ClassName: Account
 * @Description: TODO
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {

    }

    public Account(int i, double b, double a) {
        id = i;
        balance = b;
        annualInterestRate = a;
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

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("您的余额不足");
        } else {
            balance -= amount;
            System.out.println("已取出" + amount + ",还剩余" + balance);
        }
    }

    public void deposit(int amount) {
        if (amount < 0) {
            System.out.println("存款金额有问题");
        } else {
            balance += amount;
            System.out.println("存款成功");
        }

    }
}
