package javaSE.advance.Thread.scurity.runableSafe;

/**
 * @Author Diao Rui
 * @Date 2023/6/9 16:48
 * @PackageName:javaSE.advance.Thread.scurity
 * @ClassName: Window
 * @Description: 使用synchronized实现同步解决问题
 * @Version 1.0
 */
public class Window implements Runnable {
    int ticket = 100;
    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
//            synchronized (obj) {//Obj是唯一的
            synchronized (this) {//this也是唯一的
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
}
