package javaSE.LeetCode.simple;

/**
 * @Author Diao Rui
 * @Date 2023/6/3 15:44
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple2485
 * @Description: TODO
 * @Version 1.0
 */
public class Simple2485 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(pivotInteger(n));
    }

    public static int pivotInteger(int n) {
        int i = 1, j = n;
        int front = i, rear = j;
        while (i < j) {
            if (front < rear) {
                i++;
                front += i;
            } else {
                j--;
                rear += j;
            }
        }
        return front == rear ? i : -1;
    }
}
