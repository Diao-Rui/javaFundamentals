package javaSE.advance.Reflection;

/**
 * @Author Diao Rui
 * @Date 2023/7/11 10:49
 * @PackageName:javaSE.advance.Reflection
 * @ClassName: Bird
 * @Description: TODO
 * @Version 1.0
 */
public class Bird {
    public int age;
    private String name;

    public Bird() {

    }

    public Bird(String name) {
        this.name = name;
    }

    private Bird(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println(toString());
    }

    private void showType(String type) {
        System.out.println(type);
    }

    @Override
    public String toString() {
        return "Bird{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
