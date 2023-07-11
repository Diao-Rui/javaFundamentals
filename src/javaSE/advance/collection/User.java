package javaSE.advance.collection;

/**
 * @Author Diao Rui
 * @Date 2023/6/26 10:19
 * @PackageName:javaSE.advance.collection
 * @ClassName: User
 * @Description: TODO
 * @Version 1.0
 */
public class User implements Comparable {
    private String name;
    private int age;

    public User(String name, int age) {
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

    /*
     * 年龄从小到大排序
     * */
    @Override
    public int compareTo(Object o) {
        if (this == o)
            return 0;
        if (o instanceof User) {
            User user = (User) o;
            return this.age - user.getAge();
        }
        throw new RuntimeException("类型不匹配");
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
