package javaSE.basicGrammar.flowPath;

/**
 * @Author Diao Rui
 * @Date 2023/5/5 10:24
 * @PackageName:javaSE.basicGrammar
 * @ClassName: SwitchCase
 * @Description: TODO
 * @Version 1.0
 */
public class SwitchCase {


    public static void main(String[] args) {
        int month = (int) (Math.random() * (12 - 1 + 1) + 1);
        switch (month){
            case 1:
            case 2:
            case 3:
                System.out.println("spring");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("summer");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("autum");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("winter");
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}
