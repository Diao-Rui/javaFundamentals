package javaSE.HighOOP.entity.apply;

/**
 * @Author Diao Rui
 * @Date 2023/5/31 15:33
 * @PackageName:javaSE.HighOOP.entity.apply
 * @ClassName: Computer
 * @Description: TODO
 * @Version 1.0
 */
public class Computer {
    public static void main(String[] args) {
        Computer computer = new Computer();
        //普通调用方法
        Printer printer = new Printer();
        computer.transferData(printer);
        //创建匿名实现类
        USB usb = new USB() {
            @Override
            public void start() {
                System.out.println("手机开始工作");
            }

            @Override
            public void end() {
                System.out.println("手机结束工作");
            }
        };
        computer.transferData(usb);
        //创建匿名实现类的匿名对象
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("印刷机开始工作");
            }

            @Override
            public void end() {
                System.out.println("印刷机结束工作");
            }
        });
    }

    public void transferData(USB usb) {
        System.out.println("设备连接成功...");
        usb.start();
        System.out.println("数据传输细节....");
        usb.end();
    }
}
