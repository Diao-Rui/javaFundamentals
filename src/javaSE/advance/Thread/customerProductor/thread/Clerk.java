package javaSE.advance.Thread.customerProductor.thread;

/**
 * @Author Diao Rui
 * @Date 2023/6/14 11:28
 * @PackageName:javaSE.advance.Thread.customerProductor
 * @ClassName: Clerk
 * @Description: TODO
 * @Version 1.0
 */
public class Clerk {
    private int product;

    //同步方法处理线程安全问题
    //此时的额同步监视器为this
    public synchronized void add() {
        while (true) {
            if (product >= 20) {
                try {
                    //当生产的产品达到20的时候就停止生产
                    //让自己进入阻塞
                    wait();
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("产品已经到达20个了，停止生成");
            } else {
                product++;
                System.out.println(Thread.currentThread().getName() + "生产第" + product + "个产品");
                //唤醒其他被阻塞的线程
                notifyAll();
            }
        }
    }

    //使用同步方法解决线程安全问题
    //同步监视器为this
    public synchronized void reduce() {
        while (true) {
            if (product <= 0) {
                try {
                    //当没有产品时进入阻塞
                    wait();
                    Thread.sleep(300);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("当前没有产品了");
            } else {
                System.out.println(Thread.currentThread().getName() + "消费第" + product + "个产品");
                product--;
                //唤醒其他线程
                notifyAll();
            }
        }

    }
}
