package javaSE.AdvancedOOP.entity.man;

/**
 * @Author Diao Rui
 * @Date 2023/5/26 14:49
 * @PackageName:javaSE.AdvancedOOP.entity.man
 * @ClassName: Woman
 * @Description: TODO
 * @Version 1.0
 */
public class Woman extends Person {
    @Override
    public void eat() {
        System.out.println("女人吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("女人去上厕所");
    }

    public void makeup() {
        System.out.println("女人化妆");
    }
}
