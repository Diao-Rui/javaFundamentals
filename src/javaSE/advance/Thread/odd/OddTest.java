package javaSE.advance.Thread.odd;

/**
 * @Author Diao Rui
 * @Date 2023/6/8 16:37
 * @PackageName:javaSE.advance.Thread.odd
 * @ClassName: OddTest
 * @Description: TODO
 * @Version 1.0
 */
public class OddTest {
    public static void main(String[] args) {
        //创建当前实现类的对象
        OddNumber oddNumber = new OddNumber();
        //将对象作为参数传递到Thread类的构造器中，创建Thread类的实例
        Thread thread = new Thread(oddNumber);
        thread.start();
        //匿名实现类的匿名对象作为参数
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 100; i++) {
                    if (i % 2 == 1)
                        System.out.println(Thread.currentThread().getName() + ":" + i);
                }
            }
        }).start();
    }
}
