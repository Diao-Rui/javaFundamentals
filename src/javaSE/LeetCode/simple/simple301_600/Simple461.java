package javaSE.LeetCode.simple;

/**
 * @Author Diao Rui
 * @Date 2023/5/26 17:18
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple461
 * @Description: TODO
 * @Version 1.0
 */
public class Simple461 {
    public static void main(String[] args) {
        int x = 1, y = 4;
        System.out.println(hammingDistance(x, y));

    }

    public static int hammingDistance(int x, int y) {
        //首先进行异或就可以得到两个数中二进制位置上不一样的数，
        // 因为不一样的数会变为1，一样的会变为0，从而只需要异或后的数中的二进制中1的个数即可
        return Integer.bitCount(x ^ y);
    }
    
}
