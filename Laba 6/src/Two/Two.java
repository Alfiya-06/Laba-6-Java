package Two;

import java.lang.annotation.*;

/**
 * Аннотация с двумя обязательными свойствами.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Two {

    String first();
    int second();
}
