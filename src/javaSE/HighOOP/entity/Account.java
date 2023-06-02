package javaSE.HighOOP.entity;

/**
 * @Author Diao Rui
 * @Date 2023/5/29 14:08
 * @PackageName:javaSE.HighOOP.entity
 * @ClassName: Account
 * @Description: TODO
 * @Version 1.0
 */
public class Account {
    private static double interestRate;
    private static double minBalance;
    private static int init = 10001;
    private int id;
    private String password;
    private double balance;

    public Account() {
        this.id = init++;
        this.password = "000000";
        interestRate = 2.5;
        minBalance = 500;
    }

    public Account(String password, double balance) {
        this();
        this.password = password;
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
