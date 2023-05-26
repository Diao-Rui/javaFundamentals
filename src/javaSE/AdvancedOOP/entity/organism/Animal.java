package javaSE.AdvancedOOP.entity.organism;

/**
 * @Author Diao Rui
 * @Date 2023/5/26 13:45
 * @PackageName:javaSE.AdvancedOOP.entity.organism
 * @ClassName: Animal
 * @Description: TODO
 * @Version 1.0
 */
public class Animal {
    private String name;
    private int age;

    public Animal() {
    }

    public Animal(String name, int age) {
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
    public void shout(){
        System.out.println("生物能叫");
    }
    public void eat(){
        System.out.println("生物能吃");
    }
}
