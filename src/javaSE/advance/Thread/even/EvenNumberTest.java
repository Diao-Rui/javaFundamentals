package javaSE.advance.Thread.even;

/**
 * @Author Diao Rui
 * @Date 2023/6/8 16:17
 * @PackageName:javaSE.advance.Thread.even
 * @ClassName: EvenNumberTest
 * @Description: TODO
 * @Version 1.0
 */
public class EvenNumberTest {
    public static void main(String[] args) {
        //创建Thread子类的对象
        EvenNumber even = new EvenNumber();
        //启动线程
        even.start();

        //这里是main所在线程的操作
        //线程之间并发执行
        for (int i = 0; i < 100; i++) {
            if (i % 2 == 0)
                System.out.println(Thread.currentThread().getName() + ":" + i);
        }
    }
}
