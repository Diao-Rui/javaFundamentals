package javaSE.advance.fileIo.xlh;

import java.io.Serializable;

/**
 * @Author Diao Rui
 * @Date 2023/7/4 14:32
 * @PackageName:javaSE.advance.fileIo.xlh
 * @ClassName: Dog
 * @Description: TODO
 * @Version 1.0
 */
public class Dog implements Serializable {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
