package javaSE.basicOOP.mainTest;

/**
 * @Author Diao Rui
 * @Date 2023/5/20 15:38
 * @PackageName:javaSE.basicOOP.mainTest
 * @ClassName: StringConcatTest
 * @Description: TODO
 * @Version 1.0
 */
public class StringConcatTest {
    public static void main(String[] args) {
        StringConcatTest test = new StringConcatTest();
        System.out.println(test.concat("-", "hello", "world"));
        System.out.println(test.concat("-", "hello"));
    }

    public String concat(String operator, String... strs) {
        if (strs == null || strs.length == 0)
            return "";
        String res = "";
        for (int i = 0; i < strs.length; i++) {
            if (i != strs.length - 1)
                res += strs[i] + operator;
            else
                res += strs[i];
        }
        return res;
    }
}
