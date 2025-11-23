/**
 * Обработчик аннотации @Default.
 */
public class DefaultProcessor {

    /**
     * Находит и выводит класс, указанный в аннотации @Default.
     */
    public static void process(Object obj) {
        if (obj == null) {
            System.out.println("Объект равен null.");
            return;
        }

        Class<?> cls = obj.getClass();

        if (cls.isAnnotationPresent(Default.class)) {
            Default def = cls.getAnnotation(Default.class);
            System.out.println("Класс по умолчанию: " + def.value().getName());
        } else {
            System.out.println("Аннотация @Default не найдена.");
        }
    }
}

