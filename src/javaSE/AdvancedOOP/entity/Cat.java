package javaSE.AdvancedOOP.entity;

/**
 * @Author Diao Rui
 * @Date 2023/5/24 9:46
 * @PackageName:javaSE.AdvancedOOP.entity
 * @ClassName: Cat
 * @Description: TODO
 * @Version 1.0
 */
public class Cat extends Animal {
    public void shut() {
        System.out.println("喵喵叫");
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
