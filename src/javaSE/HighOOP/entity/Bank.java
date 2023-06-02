package javaSE.HighOOP.entity;

/**
 * @Author Diao Rui
 * @Date 2023/5/29 14:50
 * @PackageName:javaSE.HighOOP.entity
 * @ClassName: Bank
 * @Description: TODO
 * @Version 1.0
 */
//饿汉式
public class Bank {
    //静态实例（内存中唯一的一个对象）
    //属性为该类的对象
    private static Bank instance = new Bank();

    //私有构造器
    private Bank() {
    }

    //静态方法获取该对象
    public static Bank getInstance() {
        return instance;
    }
}

//懒汉式
class Friend {
    private static Friend friend;

    private Friend() {

    }

    public static Friend getFriend() {
        if (friend == null) {
            friend = new Friend();
        }
        return friend;
    }
}