package javaSE.advance.Thread.deadLock;

/**
 * @Author Diao Rui
 * @Date 2023/6/12 16:35
 * @PackageName:javaSE.advance.Thread.deadLock
 * @ClassName: DeadLock
 * @Description: TODO
 * @Version 1.0
 */
public class DeadLock {
    public static void main(String[] args) {
        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        new Thread() {
            @Override
            public void run() {
                synchronized (str1) {
                    str1.append("a");
                    str2.append("1");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (str2) {
                        str1.append("b");
                        str2.append("2");
                        System.out.println(str1);
                        System.out.println(str2);
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                synchronized (str2) {
                    str1.append("c");
                    str2.append("3");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (str1) {
                        str1.append("d");
                        str2.append("4");
                        System.out.println(str1);
                        System.out.println(str2);
                    }
                }
            }
        }.start();
    }
}
