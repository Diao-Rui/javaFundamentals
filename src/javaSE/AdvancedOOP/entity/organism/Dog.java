package javaSE.AdvancedOOP.entity.organism;

/**
 * @Author Diao Rui
 * @Date 2023/5/26 13:48
 * @PackageName:javaSE.AdvancedOOP.entity.organism
 * @ClassName: Dog
 * @Description: TODO
 * @Version 1.0
 */
public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("狗吃骨头");
    }

    @Override
    public void shout() {
        System.out.println("汪汪叫");
    }
    public void work(){
        System.out.println("看门");
    }
}
