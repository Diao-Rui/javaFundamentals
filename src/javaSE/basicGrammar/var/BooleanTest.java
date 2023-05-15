package javaSE.basicGrammar.var;

/**
 * @Author Diao Rui
 * @Date 2023/4/26 9:31
 * @PackageName:javaSE.basicGrammar
 * @ClassName: BooleanTest
 * @Description: TODO
 * @Version 1.0
 */
public class BooleanTest {
    public static void main(String[] args) {
        boolean bo1 = true;
        boolean bo2 = false;
        /*
        在Java中不能用0和非0
        boolean bo3=0;

         */
        boolean flag = true;
        if (flag) {
            System.out.println("放假了");
        } else {
            System.out.println("还没放假");
        }
    }
}
