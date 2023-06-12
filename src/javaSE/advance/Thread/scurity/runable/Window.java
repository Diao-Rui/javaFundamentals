package javaSE.advance.Thread.scurity.runable;

/**
 * @Author Diao Rui
 * @Date 2023/6/9 16:48
 * @PackageName:javaSE.advance.Thread.scurity
 * @ClassName: Window
 * @Description: TODO
 * @Version 1.0
 */
public class Window implements Runnable {
    int ticket = 100;

    @Override
    public void run() {
        while (true) {
            if (ticket > 0) {
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "售票窗口售票，票号为:" + ticket);
                ticket--;
            } else {
                break;
            }
        }
    }
}
