package javaSE.AdvancedOOP.entity.man;

/**
 * @Author Diao Rui
 * @Date 2023/5/26 14:48
 * @PackageName:javaSE.AdvancedOOP.entity.man
 * @ClassName: Man
 * @Description: TODO
 * @Version 1.0
 */
public class Man extends Person {
    @Override
    public void eat() {
        System.out.println("男人吃饭");
    }

    @Override
    public void toilet() {
        System.out.println("男人上厕所");
    }

    public void smoking() {
        System.out.println("男人吸烟");
    }

}
