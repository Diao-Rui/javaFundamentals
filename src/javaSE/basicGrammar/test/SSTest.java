package javaSE.basicGrammar.test;

/**
 * @Author Diao Rui
 * @Date 2023/5/6 13:37
 * @PackageName:javaSE.basicGrammar.test
 * @ClassName: SSTest
 * @Description: 100以内的素数，1000以内的素数
 * @Version 1.0
 */
public class SSTest {
    public static void main(String[] args) {
        int count = 0;
        /*for (int i = 2; i <= 1000; i++) {
            int temp = 2;
            while (temp <= Math.sqrt(i)) {
                if (i % temp == 0)
                    break;
                temp++;
            }
            if (temp > Math.sqrt(i)) {
                count++;
                if (count % 20 == 0)
                    System.out.println();
                System.out.print(i + " ");
            }
        }*/
        //获取系统当前时间
        long start = System.currentTimeMillis();
        for (int i = 2; i < 1e5; i++) {
            boolean flag = true;
            //如果设置为将j<i时间复杂度为0（n^2）
            //如果设置为j<sqrt(i)时间复杂度为o(n*logn)
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                count++;
            }
        }
        System.out.println(count);
        //获取当前时间
        long end = System.currentTimeMillis();
        long res = end - start;
        System.out.println("花费的时间为：" + res);
    }
}
