package Default;

import java.lang.annotation.*;

/**
 * Аннотация, указывающая класс по умолчанию.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface Default {

    /**
     * Класс по умолчанию (обязательное свойство).
     */
    Class<?> value();
}
