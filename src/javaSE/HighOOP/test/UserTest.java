package javaSE.HighOOP.test;

import javaSE.HighOOP.entity.User;

/**
 * @Author Diao Rui
 * @Date 2023/5/29 16:00
 * @PackageName:javaSE.HighOOP.test
 * @ClassName: UserTest
 * @Description: TODO
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User user = new User("user", "123456");
        System.out.println(user.getInfo());
    }
}
