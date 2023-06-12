package javaSE.advance.Exception;

/**
 * @Author Diao Rui
 * @Date 2023/6/7 17:38
 * @PackageName:javaSE.advance.Exception
 * @ClassName: MyException
 * @Description: TODO
 * @Version 1.0
 */
public class MyException extends RuntimeException {
    public static final long serialVersionUID = -7034897190745766939L;

    public MyException() {
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
