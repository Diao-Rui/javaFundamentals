package javaSE.HighOOP.entity.annotation;

/**
 * @Author Diao Rui
 * @Date 2023/6/2 14:23
 * @PackageName:javaSE.HighOOP.entity.annotation
 * @ClassName: Person
 * @Description: TODO
 * @Version 1.0
 */
@MyAnnotation(value = "class")
public class Person {
    private String name;
    private int age;

    @Deprecated
    @MyAnnotation(value = "constructor")
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @MyAnnotation("method")
    @SuppressWarnings(value = "123")
    public String getName() {
        return name;
    }

}
