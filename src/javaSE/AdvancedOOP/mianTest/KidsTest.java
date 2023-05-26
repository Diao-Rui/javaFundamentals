package javaSE.AdvancedOOP.mianTest;

import javaSE.AdvancedOOP.entity.Kid;

/**
 * @Author Diao Rui
 * @Date 2023/5/24 10:38
 * @PackageName:javaSE.AdvancedOOP.mianTest
 * @ClassName: KidsTest
 * @Description: TODO
 * @Version 1.0
 */
public class KidsTest {
    public static void main(String[] args) {
        Kid kid = new Kid(0, 100, 18);
        kid.printAge();
        kid.manOrEWoman();
        kid.employee();
    }
}
