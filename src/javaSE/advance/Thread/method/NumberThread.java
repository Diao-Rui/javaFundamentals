package javaSE.advance.Thread.method;

/**
 * @Author Diao Rui
 * @Date 2023/6/9 16:03
 * @PackageName:javaSE.advance.Thread.method
 * @ClassName: NumberThread
 * @Description: TODO
 * @Version 1.0
 */
public class NumberThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.println(getName() + "-" + i);
            }
        }
    }
}
