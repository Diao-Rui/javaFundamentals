package javaSE.AdvancedOOP.mianTest;

import javaSE.AdvancedOOP.entity.Cat;

/**
 * @Author Diao Rui
 * @Date 2023/5/24 9:49
 * @PackageName:javaSE.AdvancedOOP.mianTest
 * @ClassName: ExtendsTest
 * @Description: TODO
 * @Version 1.0
 */
public class ExtendsTest {
    public static void main(String[] args) {
        Cat cat = new Cat();
        //调用父类的方法
        cat.eat();
        System.out.println(cat.toString());
    }
}
