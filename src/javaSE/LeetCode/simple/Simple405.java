package javaSE.LeetCode.simple;

/**
 * @Author Diao Rui
 * @Date 2023/5/22 13:50
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple405
 * @Description: TODO
 * @Version 1.0
 */
public class Simple405 {
    public static void main(String[] args) {
        int num = -1;
        System.out.println(toHex(num));
    }

    public static String toHex(int num) {
        if (num == 0) return "0";
        StringBuilder res = new StringBuilder();
        String str = "0123456789abcdef";
        long _num = num;
        //将负数转为补码的正数（从后往前数）
        if (_num < 0) {
            _num += Math.pow(2, 32);
        }
        while (_num > 0) {
            res.insert(0, str.charAt((int) (_num % 16)));
            _num /= 16;
        }
        return res.toString();
    }
}
