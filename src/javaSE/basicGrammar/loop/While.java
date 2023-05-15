package javaSE.basicGrammar;

/**
 * @Author Diao Rui
 * @Date 2023/5/5 13:54
 * @PackageName:javaSE.basicGrammar
 * @ClassName: While
 * @Description: TODO
 * @Version 1.0
 */
public class While {
    public static void main(String[] args) {
        //猜数字游戏
//        int res = (int) (Math.random() * (100 - 1 + 1) + 1);
//        Scanner cin = new Scanner(System.in);
//        int guess = 0, total = 1;
//        while (true) {
//            System.out.print("请输入一个数：");
//            guess = cin.nextInt();
//            if (guess == res)
//                break;
//            else if (guess > res)
//                System.out.println("大了");
//            else
//                System.out.println("小了");
//            total++;
//        }
//        System.out.println("猜对了，总计次数为：" + total);
//        cin.close();
        //高度为8848.68，一张纸厚度为0.1毫米，折叠多少次能够超过珠峰
        double paper = 0.1;
        double hail = 8848860;
        int total = 0;
        while (paper <= hail) {
            paper *= 2;
            total += 1;
        }
        System.out.println("总共折叠了" + total + "次，总高度为:" + paper * 1000);
    }
}
