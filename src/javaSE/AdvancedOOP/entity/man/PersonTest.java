package javaSE.AdvancedOOP.entity.man;

/**
 * @Author Diao Rui
 * @Date 2023/5/26 14:51
 * @PackageName:javaSE.AdvancedOOP.entity.man
 * @ClassName: PersonTest
 * @Description: TODO
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {
        meeting(new Man(), new Person(), new Woman());
        String str = "123";
        String str1 = "123";
        System.out.println(str == str1);
        System.out.println(str.equals(str1));
    }

    /*
     * 可变参数列表
     * */
    public static void meeting(Person... persons) {
        for (int i = 0; i < persons.length; i++) {
            persons[i].eat();
            persons[i].toilet();
            if (persons[i] instanceof Man) {
                //向下转型
                Man man = (Man) persons[i];
                man.smoking();
            } else if (persons[i] instanceof Woman) {
                Woman woman = (Woman) persons[i];
                woman.makeup();
            }
        }
    }
}
