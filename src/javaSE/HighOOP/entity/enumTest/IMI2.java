package javaSE.HighOOP.entity.enumTest;

/**
 * @Author Diao Rui
 * @Date 2023/6/1 15:10
 * @PackageName:javaSE.HighOOP.entity.enumTest
 * @ClassName: IMI2
 * @Description: TODO
 * @Version 1.0
 */
public enum IMI2 implements INFO {
    INFO("info") {
        @Override
        public void info() {
            System.out.println("info");
        }
    };

    IMI2(String name) {
    }

    public static void main(String[] args) {
        IMI2.INFO.info();
    }
}
