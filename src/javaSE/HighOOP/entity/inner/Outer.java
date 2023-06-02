package javaSE.HighOOP.entity.inner;

/**
 * @Author Diao Rui
 * @Date 2023/6/1 11:48
 * @PackageName:javaSE.HighOOP.entity.inner
 * @ClassName: Outer
 * @Description: 创建一个继承与Object的匿名内部类，创建一个test方法
 * @Version 1.0
 */
public class Outer {
    public static void main(String[] args) {
        //继承Object并创建自己的方法
        new Object() {
            public void test() {
                System.out.println("hello world");
            }
        }.test();

        testAbstract();
    }

    public static void testInterface() {
        //接口调用静态方法
        A.b();
        //匿名实现类的匿名对象
        new A() {
            @Override
            public void method() {
                System.out.println("匿名实现类的匿名对象:method");
            }
        }.a();

        //匿名实现类的对象
        A a = new A() {
            @Override
            public void method() {
                System.out.println("匿名实现类的对象：method方法");
            }
        };
        //实现类调用默认方法，没有重写，则调用接口的
        a.a();
        a.method();
    }

    public static void testAbstract() {
        //提供子类继承与抽象类，匿名子类的匿名对象
        new B() {
            @Override
            public void method1() {
                System.out.println("提供子类继承与抽象类，匿名子类的匿名对象:method1");
            }
        }.method1();
        //提供子类继承与抽象类，子类的匿名对象
        B b = new B() {
            @Override
            public void method1() {
                System.out.println("提供子类继承与抽象类子类的匿名对象：method1");
            }
        };
        b.method1();
        System.out.println(b.getClass());
        System.out.println(b.getClass().getSuperclass());
        C c = new C() {
        };
        System.out.println(c.getClass());
        c.method2();
        System.out.println(c.getClass().getSuperclass());
    }
}
