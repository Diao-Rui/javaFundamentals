package javaSE.advance.Thread.scurity.singleInstance;

/**
 * @Author Diao Rui
 * @Date 2023/6/12 15:50
 * @PackageName:javaSE.advance.Thread.scurity.singleInstance
 * @ClassName: Bank
 * @Description: TODO
 * @Version 1.0
 */
public class Bank {
    //为了避免指令重排，将instance设置为volatile
    private static volatile Bank instance = null;

    private Bank() {
    }

    //第一种方式：同步方法
    //静态同步方法为该类
//    public static synchronized Bank getInstance() {
//        if (instance == null) {
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
//            instance = new Bank();
//        }
//        return instance;
//    }
    //第二种方式：同步代码块
//    public static Bank getInstance() {
//        synchronized (Bank.class) {
//            if (instance == null) {
//                try {
//                    Thread.sleep(1000);
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }
//                instance = new Bank();
//            }
//        }
//        return instance;
//    }
    //第三种方式：双端检索（同步代码块）
    //相比于其他两种性能更高
    public static Bank getInstance() {
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
