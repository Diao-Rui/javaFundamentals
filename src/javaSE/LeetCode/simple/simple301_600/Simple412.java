package javaSE.LeetCode.simple;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author Diao Rui
 * @Date 2023/5/24 17:50
 * @PackageName:javaSE.LeetCode.simple
 * @ClassName: Simple412
 * @Description: 412. Fizz Buzz
 * @Version 1.0
 */
public class Simple412 {
    public static void main(String[] args) {
        int n = 15;
        System.out.println(fizzBuzz(n));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                list.add("FizzBuzz");
            else if (i % 3 == 0)
                list.add("Fizz");
            else if (i % 5 == 0)
                list.add("Buzz");
            else
                list.add(i + "");
        }
        return list;
    }
}
