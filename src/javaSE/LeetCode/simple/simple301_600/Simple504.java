package javaSE.LeetCode.simple.simple301_600;

/**
 * @Author Diao Rui
 * @Date 2023/6/12 17:44
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple504
 * @Description: TODO
 * @Version 1.0
 */
public class Simple504 {
    public static void main(String[] args) {
        System.out.println(convertToBase7(-7));
    }

    public static String convertToBase7(int num) {
        int flag = num >= 0 ? 1 : -1;
        if (num == 0)
            return "0";
        num = num * flag;
        StringBuilder str = new StringBuilder();
        while (num != 0) {
            str.insert(0, num % 7);
            num /= 7;
        }
        if (flag == -1)
            str.insert(0, '-');
        return str.toString();
    }
}
