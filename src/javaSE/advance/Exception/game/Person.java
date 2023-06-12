package javaSE.advance.Exception.game;

/**
 * @Author Diao Rui
 * @Date 2023/6/8 14:17
 * @PackageName:javaSE.advance.Exception.game
 * @ClassName: Person
 * @Description: TODO
 * @Version 1.0
 */
public class Person {
    private String name;
    private int healthValue;

    public Person() {
    }

    public Person(String name, int healthValue) {
        setHealthValue(healthValue);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealthValue() {
        return healthValue;
    }

    public void setHealthValue(int healthValue) {
        if (healthValue < 0) {
            throw new NoLifeValueException("生命值不能为负数：" + healthValue);
        }
        //不需要else因为throw下面的代码不会执行
        this.healthValue = healthValue;
    }
}
