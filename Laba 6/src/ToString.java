import java.lang.annotation.*;

/**
 * Указывает, следует ли включать тип или поле в строковое представление.
 * По умолчанию — YES.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.FIELD})
public @interface ToString {

    /**
     * Режим включения: YES (включать) или NO (исключать).
     */
    Mode value() default Mode.YES;

    /**
     * Варианты режима включения.
     */
    enum Mode {
        YES,
        NO
    }
}
