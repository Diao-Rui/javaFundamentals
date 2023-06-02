package javaSE.HighOOP.entity.inner;

/**
 * @Author Diao Rui
 * @Date 2023/6/1 13:54
 * @PackageName:javaSE.HighOOP.entity.inner
 * @ClassName: A
 * @Description: TODO
 * @Version 1.0
 */
public interface A {
    //jdk8新特性默认方法
    static void b() {
        System.out.println("接口静态方法");
    }

    //jdk8新特性静态方法
    default void a() {
        System.out.println("接口默认方法");
    }

    //抽象方法
    void method();
}
