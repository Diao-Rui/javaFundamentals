package javaSE.AdvancedOOP.entity.organism;

/**
 * @Author Diao Rui
 * @Date 2023/5/26 13:53
 * @PackageName:javaSE.AdvancedOOP.entity.organism
 * @ClassName: PolymorphicTest
 * @Description: TODO
 * @Version 1.0
 */
public class PolymorphicTest {
    public static void main(String[] args) {
        //将子类对象赋值给父类变量
        //也称为向上转型
        Animal animal = new Dog();
        animal.shout();
        animal.eat();
        //不能使用没有被重写的方法（子类特有的方法）
        //animal.work();
        //为了能够使用子类特有的属性和方法需要使用类型转换
        //向下转型
        Dog dog = (Dog) animal;
        dog.work();
        test(new Cat());
        test(new Dog());
    }

    /*
     * 多态性的应用，减少代码的冗余，提高了可扩展性，符合开闭原则
     * 因为以后在增加animal的子类也不用修改这里的方法
     * */
    public static void test(Animal animal) {
        animal.eat();
        animal.shout();
    }
}
