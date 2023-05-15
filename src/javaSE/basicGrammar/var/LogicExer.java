package javaSE.basicGrammar.var;

/**
 * @Author Diao Rui
 * @Date 2023/4/28 11:00
 * @PackageName:javaSE.basicGrammar
 * @ClassName: LogicExer
 * @Description:
 * @Version 1.0
 */
public class LogicExer {
    public static void main(String[] args) {
//        定义a和b都为20
        int a = 20, b = 20;
//        判断++a能否被3整除并且判断a++能否被7整除
        boolean bo1 = ++a % 3 == 0 && a++ % 7 == 0;//true
//        输出a和bo1的值
        System.out.println("a = " + a);
        System.out.println("bo1 = " + bo1);
//        判断b++能否被3整除并且++b能否被7整除
        boolean bo2 = b++ % 3 == 0 && ++b % 7 == 0;//false
//        输出b和bo2的值
        System.out.println("b = " + b);
        System.out.println("bo2 = " + bo2);

//        条件表达式
        int max = a >= b ? a : b;
        System.out.println("max = " + max);
        int m = 15, n = 20, q = 16;
//        求三个数最大值
        max = (m > n ? m : n) > q ? (m > n ? m : n) : q;
        System.out.println(max);

        int day = 4;
        day += 10;
        int week = day % 7;
        week = week == 0 ? 7 : week;
        System.out.println("今天是周" + day + ",10天后为周" + week);
    }
}
