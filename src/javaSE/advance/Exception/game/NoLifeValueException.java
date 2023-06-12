package javaSE.advance.Exception.game;

/**
 * @Author Diao Rui
 * @Date 2023/6/8 14:20
 * @PackageName:javaSE.advance.Exception.game
 * @ClassName: NoLifeValueException
 * @Description: TODO
 * @Version 1.0
 */
public class NoLifeValueException extends RuntimeException {
    static final long serialVersionUID = -7034897190745766939L;

    public NoLifeValueException() {
    }

    public NoLifeValueException(String message) {
        super(message);
    }

    public NoLifeValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoLifeValueException(Throwable cause) {
        super(cause);
    }

    public NoLifeValueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
