package Two;

/**
 * Обработчик аннотации @Two.Two.
 */
public class TwoProcessor {

    public static void process(Object obj) {
        if (obj == null) {
            System.out.println("Ошибка: передан null объект.");
            return;
        }
        Class<?> cls = obj.getClass();

        if (cls.isAnnotationPresent(Two.class)) {
            Two two = cls.getAnnotation(Two.class);

            System.out.println("Свойство first: " + two.first());
            System.out.println("Свойство second: " + two.second());
        } else {
            System.out.println("Аннотация @Two.Two не найдена.");
        }
    }
}
