package javaSE.advance.Thread.scurity.extendSafe;

/**
 * @Author Diao Rui
 * @Date 2023/6/9 17:19
 * @PackageName:javaSE.advance.Thread.scurity.extend
 * @ClassName: Window
 * @Description: TODO
 * @Version 1.0
 */
public class Window extends Thread {
    static final Object object = new Object();
    static int ticket = 100;

    @Override
    public void run() {
        while (true) {
//            synchronized (object) {
            synchronized (Window.class) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "窗口售票，票号:" + ticket);
                    ticket--;
                } else {
                    break;
                }
            }
        }
    }
}
