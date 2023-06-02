package javaSE.HighOOP.entity.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @Author Diao Rui
 * @Date 2023/6/2 14:22
 * @PackageName:javaSE.HighOOP.entity.annotation
 * @ClassName: MyAnnotation
 * @Description: 自定义注解
 * @Version 1.0
 */
@Target(value={CONSTRUCTOR, FIELD, LOCAL_VARIABLE, METHOD, PACKAGE, PARAMETER, TYPE})
public @interface MyAnnotation {
    String value();
}
