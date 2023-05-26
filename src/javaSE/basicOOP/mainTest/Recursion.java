package javaSE.basicOOP.mainTest;

/**
 * @Author Diao Rui
 * @Date 2023/5/22 14:50
 * @PackageName:javaSE.basicOOP.mainTest
 * @ClassName: Recursion
 * @Description: TODO
 * @Version 1.0
 */
public class Recursion {
    public static void main(String[] args) {
        Recursion recursion = new Recursion();
        System.out.println(recursion.sum(10));
        System.out.println(recursion.mui(5));
        System.out.println(recursion.fib(5));
        System.out.println(recursion.fun1(2));
        System.out.println(recursion.fun2(21));
    }

    public int sum(int n) {
        if (n == 1)
            return 1;
        return n + sum(n - 1);
    }

    public int mui(int n) {
        if (n == 1)
            return 1;
        else
            return n * mui(n - 1);
    }

    public int fib(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fib(n - 1) + fib(n - 2);
    }

    //非递归方法
    public int fun1(int n) {
        if (n == 0) return 1;
        int[] arr = new int[n + 1];
        arr[0] = 1;
        arr[1] = 4;
        for (int i = 0; i <= n - 2; i++) {
            arr[i + 2] = arr[i] + 2 * arr[i + 1];
        }
        return arr[n];
    }

    //递归方法
    public int fun11(int n) {
        if (n == 0)
            return 1;
        else if (n == 1)
            return 4;
        else
            return fun22(n - 2) + 2 * fun22(n - 1);
    }

    //非递归写法
    public int fun2(int n) {
        int[] arr = new int[n + 1];
        arr[21] = 4;
        arr[20] = 1;
        for (int i = 19; i >= 0; i--) {
            arr[i] = arr[i + 2] - 2 * arr[i + 1];
            System.out.println(arr[i]);
        }
        return arr[10];
    }

    //递归写法
    public int fun22(int n) {
        if (n == 21)
            return 4;
        else if (n == 20)
            return 1;
        else
            return fun22(n + 2) - 2 * fun22(n + 1);
    }

    //走台阶
    public int steps(int n) {
        if (n == 1)
            return 1;
        else if (n == 2)
            return 2;
        else
            return steps(n - 1) + steps(n - 2);
    }
}