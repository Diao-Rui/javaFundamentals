package javaSE.advance.Thread.scurity.singleInstance;

/**
 * @Author Diao Rui
 * @Date 2023/6/12 15:53
 * @PackageName:javaSE.advance.Thread.scurity.singleInstance
 * @ClassName: BankTest
 * @Description: TODO
 * @Version 1.0
 */
public class BankTest {
    static Bank b1 = null;
    static Bank b2 = null;

    public static void main(String[] args) {

        Thread t1 = new Thread() {
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        };
        Thread t2 = new Thread() {
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        };
        t1.start();
        t2.start();
        //等子线程结束，才执行主线程
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1==b2);
    }
}
