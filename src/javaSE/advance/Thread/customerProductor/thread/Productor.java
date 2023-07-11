package javaSE.advance.Thread.customerProductor.thread;

/**
 * @Author Diao Rui
 * @Date 2023/6/14 11:29
 * @PackageName:javaSE.advance.Thread.customerProductor.thread
 * @ClassName: Productor
 * @Description: TODO
 * @Version 1.0
 */
public class Productor extends Thread {
    private Clerk clerk;

    public Productor(Clerk clerk, String name) {
        super(name);
        this.clerk = clerk;
    }

    @Override
    public void run() {
        //生产产品
        clerk.add();
    }
}
