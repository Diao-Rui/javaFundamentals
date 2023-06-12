package javaSE.advance.Thread.scurity;

/**
 * @Author Diao Rui
 * @Date 2023/6/9 16:51
 * @PackageName:javaSE.advance.Thread.scurity
 * @ClassName: WindowTest
 * @Description: TODO
 * @Version 1.0
 */
public class WindowTest {
    public static void main(String[] args) {
        Window window = new Window();
        new Thread(window).start();
        new Thread(window).start();
        new Thread(window).start();
    }
}
