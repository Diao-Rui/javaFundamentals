package javaSE.AdvancedOOP.entity.organism;

/**
 * @Author Diao Rui
 * @Date 2023/5/26 13:52
 * @PackageName:javaSE.AdvancedOOP.entity.organism
 * @ClassName: Cat
 * @Description: TODO
 * @Version 1.0
 */
public class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }

    @Override
    public void shout() {
        System.out.println("喵喵叫");
    }

    public void work() {
        System.out.println("抓老鼠");
    }
}
