package javaSE.HighOOP.entity.circle;

/**
 * @Author Diao Rui
 * @Date 2023/5/31 16:16
 * @PackageName:javaSE.HighOOP.entity.circle
 * @ClassName: CircleTest
 * @Description: TODO
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        CompareCircle c1 = new CompareCircle(12);
        CompareCircle c2 = new CompareCircle(120);
        int compare = c1.compareTo(c2);
        switch (compare) {
            case -1:
                System.out.println("第二个大");
                break;
            case 0:
                System.out.println("一样大");
                break;
            case 1:
                System.out.println("第一个大");
                break;
            default:
                System.out.println("输入有误");
                break;
        }
    }
}
