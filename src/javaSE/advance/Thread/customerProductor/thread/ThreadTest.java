package javaSE.advance.Thread.customerProductor.thread;

/**
 * @Author Diao Rui
 * @Date 2023/6/14 11:46
 * @PackageName:javaSE.advance.Thread.customerProductor.thread
 * @ClassName: ThreadTest
 * @Description: TODO
 * @Version 1.0
 */
public class ThreadTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Productor productor = new Productor(clerk, "生产者1");
        Customer customer = new Customer(clerk, "消费者1");
        productor.start();
        customer.start();
    }
}
