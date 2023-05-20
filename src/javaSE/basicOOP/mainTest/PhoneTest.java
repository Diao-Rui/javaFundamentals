package javaSE.basicOOP.mainTest;

import javaSE.basicOOP.entity.Phone;

/**
 * @Author Diao Rui
 * @Date 2023/5/18 14:56
 * @PackageName:javaSE.basicOOP.mainTest
 * @ClassName: PhoneTest
 * @Description: TODO
 * @Version 1.0
 */
public class PhoneTest {
    public static void main(String[] args) {
        //创建Phone对象
        Phone p1 = new Phone();

        //通过Phone对象，调用内部声明的属性和方法
        //格式 对象.属性 或 对象.方法（）
        p1.name = "华为";
        p1.price = 6500;

        p1.call();
        p1.sendMessage("hello world");
        p1.playGame();

        //创建类的多个对象
        Phone p2=new Phone();
        p2.name="huawei";
        p2.price=6585;

        Phone p3=new Phone();
        p3.name="xiaomi";
        p3.price=6985;

        Phone p4=p3;
        p3.price=4895;
    }
}
