package javaSE.basicOOP.entity;

/**
 * @Author Diao Rui
 * @Date 2023/5/19 16:53
 * @PackageName:javaSE.basicOOP.entity
 * @ClassName: Person
 * @Description: TODO
 * @Version 1.0
 */
public class Person {
    String name;
    int age;
    char gender;

    public static void main(String[] args) {
        Person person = new Person();
        person.study();
        person.addAge(15);
        System.out.println(person.showAge());
    }

    public void study() {
        System.out.println("studying");
    }

    public int showAge() {
        return age;
    }

    public void addAge(int addAge) {
        age = addAge;
    }

}
