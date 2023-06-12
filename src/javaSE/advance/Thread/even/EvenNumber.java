package javaSE.advance.Thread.even;

/**
 * @Author Diao Rui
 * @Date 2023/6/8 16:16
 * @PackageName:javaSE.advance.Thread.even
 * @ClassName: EvenNumber
 * @Description: TODO
 * @Version 1.0
 */
//创建线程类继承与Thread
public class EvenNumber extends Thread {
    //重写run方法
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName() + ":" + i);
        }

    }
}
