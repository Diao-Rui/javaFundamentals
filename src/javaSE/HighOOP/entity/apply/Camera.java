package javaSE.HighOOP.entity.apply;

/**
 * @Author Diao Rui
 * @Date 2023/5/31 15:33
 * @PackageName:javaSE.HighOOP.entity.apply
 * @ClassName: Camera
 * @Description: TODO
 * @Version 1.0
 */
public class Camera implements USB {
    @Override
    public void start() {
        System.out.println("相机开始工作");
    }

    @Override
    public void end() {
        System.out.println("相机结束工作");
    }
}
