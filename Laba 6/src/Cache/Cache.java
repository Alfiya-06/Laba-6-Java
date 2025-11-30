package Cache;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Аннотация для указания кешируемых областей класса.
 * Может применяться только к типам и доступна во время выполнения.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Cache {

    /**
     * Список кешируемых областей.
     * По умолчанию — пустой массив.
     * @return массив строк с названиями областей
     */
    String[] value() default {};
}
