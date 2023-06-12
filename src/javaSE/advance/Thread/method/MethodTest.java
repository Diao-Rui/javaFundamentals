package javaSE.advance.Thread.method;

/**
 * @Author Diao Rui
 * @Date 2023/6/9 16:05
 * @PackageName:javaSE.advance.Thread.method
 * @ClassName: MethodTest
 * @Description: TODO
 * @Version 1.0
 */
public class MethodTest {
    public static void main(String[] args) {
        //创建子线程
        NumberThread thread = new NumberThread();
        //线程设置名字
        thread.setName("子线程");
        //启动子线程
        thread.start();

        Thread.currentThread().setName("主线程");
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                try {
                    //设置休眠时间
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "-" + i);
            }
        }
        System.out.println("子线程是否还存或：" + thread.isAlive());
    }
}
