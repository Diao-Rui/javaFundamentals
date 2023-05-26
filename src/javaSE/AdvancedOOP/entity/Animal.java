package javaSE.AdvancedOOP.entity;

/**
 * @Author Diao Rui
 * @Date 2023/5/24 9:45
 * @PackageName:javaSE.AdvancedOOP.entity
 * @ClassName: Animal
 * @Description: TODO
 * @Version 1.0
 */
public class Animal {
    private String name;
    private int age;

    public void eat() {
        System.out.println("可以吃饭");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
