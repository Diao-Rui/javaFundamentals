package javaSE.advance.Thread.customerProductor.thread;

/**
 * @Author Diao Rui
 * @Date 2023/6/14 11:30
 * @PackageName:javaSE.advance.Thread.customerProductor.thread
 * @ClassName: Customer
 * @Description: TODO
 * @Version 1.0
 */
public class Customer extends Thread {
    private Clerk clerk;

    public Customer(Clerk clerk, String name) {
        super(name);
        this.clerk = clerk;
    }

    @Override
    public void run() {
        //消费产品
        clerk.reduce();
    }
}
