package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @ interface RunMe {
//  conventionally, NO SPACE!!!
//public @interface RunMe {
}

