package Cache;

/**
 * Обработчик аннотации @Cache.Cache.
 * Выводит список кешируемых областей или сообщение, если список пуст.
 */
public class CacheHandler {

    /**
     * Выводит информацию о кешируемых областях для заданного класса.
     * @param clazz класс для анализа
     */
    public static void process(Class<?> clazz) {
        if (clazz == null) {
            System.out.println("Ошибка: передан null класс.");
            return;
        }

        if (clazz.isAnnotationPresent(Cache.class)) {
            Cache cache = clazz.getAnnotation(Cache.class);
            String[] areas = cache.value();

            if (areas.length > 0) {
                System.out.print("Кешируемые области: ");
                for (int i = 0; i < areas.length; i++) {
                    if (i > 0) System.out.print(", ");
                    System.out.print("'" + areas[i] + "'");
                }
                System.out.println(".");
            } else {
                System.out.println("Кешируемые области не указаны (пустой массив).");
            }
        } else {
            System.out.println("Аннотация @Cache.Cache не найдена для класса " + clazz.getSimpleName() + ".");
        }
    }
}
