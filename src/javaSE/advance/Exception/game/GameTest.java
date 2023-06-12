package javaSE.advance.Exception.game;

import org.junit.Test;

/**
 * @Author Diao Rui
 * @Date 2023/6/8 14:28
 * @PackageName:javaSE.advance.Exception.game
 * @ClassName: GameTest
 * @Description: TODO
 * @Version 1.0
 */
public class GameTest {
    @Test
    public void test1() {
        try {
            Person person = new Person();
            person.setHealthValue(12);
            person.setHealthValue(-12);
            System.out.println(person.getHealthValue());
        } catch (NoLifeValueException e) {
            e.printStackTrace();
        }


    }
}
