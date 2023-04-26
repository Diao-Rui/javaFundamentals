package javaSE.basicGrammar.test;

/**
 * @Author Diao Rui
 * @Date 2023/4/26 10:48
 * @PackageName:javaSE.basicGrammar.test
 * @ClassName: StringExer1
 * @Description: TODO
 * @Version 1.0
 */
public class StringExer1 {
    public static void main(String[] args) {
//        String str1 = 4;赋值必须是字符串
        String str2 = 3.5f + "";
        System.out.println(str2);
        System.out.println(3 + 4 + "hello");//7Hello
        System.out.println("hello" + 3 + 4);//hello34
        System.out.println('a' + 1 + "hello");//a1hello
        System.out.println("hello" + 'a' + 1);//helloa1


    }
}
