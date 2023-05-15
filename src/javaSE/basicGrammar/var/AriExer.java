package javaSE.basicGrammar.var;

/**
 * @Author Diao Rui
 * @Date 2023/4/27 14:56
 * @PackageName:javaSE.basicGrammar
 * @ClassName: AriExer
 * @Description: 求一个三位的每一位
 * @Version 1.0
 */
public class AriExer {
    public static void main(String[] args) {
        int num = 987;
        int i = num % 10, j = num / 10 % 10, k = num / 100 % 10;
        System.out.println("个位为：" + i + ",十位为：" + j + ",百位为：" + k);

        int hours = 89;
        int days = hours / 24;
        int hour = hours % 24;
        System.out.println("共" + days + "天，零" + hour + "小时");
    }
}
