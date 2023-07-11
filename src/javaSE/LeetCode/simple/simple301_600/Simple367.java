package javaSE.LeetCode.simple.simple301_600;

/**
 * @Author Diao Rui
 * @Date 2023/5/25 16:17
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple367
 * @Description: 367. 有效的完全平方数
 * @Version 1.0
 */
public class Simple367 {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (isPerfectSquare(i))
                System.out.print(i+" ");
        }
    }

    public static boolean isPerfectSquare(int num) {
        int left = 0;
        int right = num;

        if (num == 1) {
            return true;
        }

        while (left < right) {
            int middle = (right - left) / 2 + left;
            int result = num / middle;
            if (middle > result) {
                right = middle;
            } else if (middle < result) {
                left = middle + 1;
            } else {
                return middle * middle == num;
            }
        }
        return false;
    }
}
