package javaSE.advance.Reflection;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author Diao Rui
 * @Date 2023/7/11 10:49
 * @PackageName:javaSE.advance.Reflection
 * @ClassName: ReflectionTest
 * @Description: TODO
 * @Version 1.0
 */
public class ReflectionTest {

    @Test
    public void test() throws Exception {
        //调用反射
        Class<Bird> birdClass = Bird.class;
        //使用反射创建对象（调用无参数构造器）
        Bird bird = birdClass.newInstance();
        //通过反射获取对象的属性
        Field age = birdClass.getField("age");
        //通过反射给属性赋值
        age.set(bird, 18);
        System.out.println(bird);
        //通过反射获取方法
        Method show = birdClass.getMethod("show");
        //通过反射调用方法
        show.invoke(bird);
        //通过反射调用有参数构造器
        Constructor<Bird> tom = birdClass.getConstructor(String.class);
        Bird tom1 = tom.newInstance("tom");
        System.out.println(tom1);
    }
    /*
    * 获取私有属性
    * */
    @Test
    public void test1()throws Exception{
        Class<Bird> birdClass = Bird.class;
        Constructor<Bird> constructor = birdClass.getDeclaredConstructor(String.class, int.class);
        //允许调用私有构造器
        constructor.setAccessible(true);
        Bird bird = constructor.newInstance("tom",18);
        System.out.println(bird);
        //允许调用私有属性
        Field name = birdClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(bird,"jerry");
        System.out.println(bird);
        //访问私有方法
        Method showType = birdClass.getDeclaredMethod("showType", String.class);
        showType.setAccessible(true);
        showType.invoke(bird,"china");
    }
}
