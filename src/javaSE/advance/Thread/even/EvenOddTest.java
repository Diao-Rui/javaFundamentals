package javaSE.advance.Thread.even;

/**
 * @Author Diao Rui
 * @Date 2023/6/8 16:27
 * @PackageName:javaSE.advance.Thread.even
 * @ClassName: EvenOddTest
 * @Description: TODO
 * @Version 1.0
 */
public class EvenOddTest {
    public static void main(String[] args) {
        EvenNumber even = new EvenNumber();
        even.start();
        OddNumber odd = new OddNumber();
        odd.start();
        //方式2
        //创建Thread的匿名子类的匿名对象
        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    if (i % 2 == 0)
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    if (i % 2 == 1)
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }.start();
    }
}
