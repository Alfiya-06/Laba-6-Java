package Validate;

/**
 * Обработчик аннотации @Validate.Validate.
 */
public class ValidateProcessor {

    /**
     * Выводит список типов, указанных в аннотации @Validate.Validate.
     * @param obj Объект, класс которого нужно проверить на наличие аннотации @Validate.Validate.
     */
    public static void process(Object obj) {
        if (obj == null) {
            System.out.println("Ошибка: передан null объект для обработки @Validate.Validate.");
            return;
        }

        Class<?> cls = obj.getClass();

        if (cls.isAnnotationPresent(Validate.class)) {
            Validate validate = cls.getAnnotation(Validate.class);
            System.out.println("Типы для проверки:");

            for (Class<?> type : validate.value()) {
                System.out.println(" - " + type.getName());
            }
        } else {
            System.out.println("Аннотация @Validate.Validate не найдена.");
        }
    }
}