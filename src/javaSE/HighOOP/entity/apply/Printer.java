package javaSE.HighOOP.entity.apply;

/**
 * @Author Diao Rui
 * @Date 2023/5/31 15:32
 * @PackageName:javaSE.HighOOP.entity.apply
 * @ClassName: Printer
 * @Description: TODO
 * @Version 1.0
 */
public class Printer implements USB {
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void end() {
        System.out.println("打印机结束工作了");
    }
}
