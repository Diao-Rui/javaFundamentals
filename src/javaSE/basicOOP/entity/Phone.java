package javaSE.basicOOP.entity;

/**
 * @Author Diao Rui
 * @Date 2023/5/18 14:53
 * @PackageName:javaSE.basicOOP.entity
 * @ClassName: Phone
 * @Description: TODO
 * @Version 1.0
 */
//定义类
public class Phone {
    //属性
    public String name;
    public double price;

    //方法
    public void call() {
        System.out.println("手机能够拨打电话");
    }

    public void sendMessage(String message) {
        System.out.println("发送消息：" + message);
    }

    public void playGame() {
        System.out.println("手机可以打游戏");
    }

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
