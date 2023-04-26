package javaSE.basicGrammar.test;

/**
 * @Author Diao Rui
 * @Date 2023/4/25 17:28
 * @PackageName:javaSE.basicGrammar.test
 * @ClassName: 华氏温度转为摄氏温度 C=(F-32)/1.8
 * @Description: TODO
 * @Version 1.0
 */
public class FloatDoubleExe2 {
    public static void main(String[] args) {
        double F = 80.0;
        double C = (F - 32) / 1.8;
        System.out.println(F + ' ' + C);
    }
}
