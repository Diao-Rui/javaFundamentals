package javaSE.basicGrammar;

/**
 * @Author Diao Rui
 * @Date 2023/4/26 9:14
 * @PackageName:javaSE.basicGrammar
 * @ClassName: CharTest
 * @Description: 字符型数据的基本操作
 * @Version 1.0
 */
public class CharTest {
    public static void main(String[] args) {
        /*不能定义空字符
        char c1='';
         */
//        可以直接给字符，也可以直接给数字
        char c1 = 'a';
        char c2 = 97;
        System.out.println(c1);
        System.out.println(c2);
//        使用Unicode编码
        char c3 = '\u0023';
        System.out.println(c3);
        char b1 = 1;//1
        char b2 = '1';//49
        System.out.println(b1 == b2);
    }
}
