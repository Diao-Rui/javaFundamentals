package javaSE.AdvancedOOP.entity.equals;

/**
 * @Author Diao Rui
 * @Date 2023/5/26 16:11
 * @PackageName:javaSE.AdvancedOOP.entity.equals
 * @ClassName: Account
 * @Description: TODO
 * @Version 1.0
 */
public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Double.compare(account.balance, balance) == 0;
    }

}
