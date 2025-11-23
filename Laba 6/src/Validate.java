import java.lang.annotation.*;

/**
 * Аннотация для указания списка типов для валидации.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})

public @interface Validate {
    /**
     * Список типов для проверки.
     */
    Class<?>[] value();
}
