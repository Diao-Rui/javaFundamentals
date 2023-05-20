package javaSE.basicOOP.entity;

/**
 * @Author Diao Rui
 * @Date 2023/5/20 14:33
 * @PackageName:javaSE.basicOOP.entity
 * @ClassName: Student
 * @Description: TODO
 * @Version 1.0
 */
public class Student {
    public String name;
    public int age;
    public char gender;
    public double score;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", score=" + score +
                '}';
    }
}
