package javaSE.advance.Exception.divide;

/**
 * @Author Diao Rui
 * @Date 2023/6/8 14:40
 * @PackageName:javaSE.advance.Exception.divide
 * @ClassName: Divide
 * @Description: TODO
 * @Version 1.0
 */
public class Divide {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
        } catch (NumberFormatException e) {
            System.out.println("数据类型不一致");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("缺少命令行参数");
        } catch (ArithmeticException e) {
            System.out.println("除0");
        }


    }
}
