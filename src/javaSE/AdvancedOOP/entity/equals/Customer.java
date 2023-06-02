package javaSE.AdvancedOOP.entity.equals;

import java.util.Objects;

/**
 * @Author Diao Rui
 * @Date 2023/5/26 16:13
 * @PackageName:javaSE.AdvancedOOP.entity.equals
 * @ClassName: Customer
 * @Description: TODO
 * @Version 1.0
 */
public class Customer extends Account {
    private String name;
    private int age;

    public Customer(double balance, String name, int age) {
        super(balance);
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
    public boolean equals(Object o) {
        //判断是否为同一对象
        if (this == o) return true;
        //判断是否为空并且是同一种对象
        if (o == null || getClass() != o.getClass()) return false;
        //判断父类的属性是否相同
        if (!super.equals(o)) return false;
        Customer customer = (Customer) o;
        return age == customer.age &&
                Objects.equals(name, customer.name);
    }

}
