package javaSE.advance.Thread.odd;

/**
 * @Author Diao Rui
 * @Date 2023/6/8 16:36
 * @PackageName:javaSE.advance.Thread.odd
 * @ClassName: OddNumber
 * @Description: TODO
 * @Version 1.0
 */
public class OddNumber implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1)
                System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
