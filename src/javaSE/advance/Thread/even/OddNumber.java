package javaSE.advance.Thread.even;

/**
 * @Author Diao Rui
 * @Date 2023/6/8 16:26
 * @PackageName:javaSE.advance.Thread.even
 * @ClassName: OddNumber
 * @Description: TODO
 * @Version 1.0
 */
public class OddNumber extends Thread {
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 1)
                System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
