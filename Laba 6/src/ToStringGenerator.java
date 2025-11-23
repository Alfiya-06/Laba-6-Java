import java.lang.reflect.Field;

/**
 * Генерирует строковое представление объекта с учётом аннотации @ToString.
 */
public class ToStringGenerator {

    /**
     * Формирует строку вида "Class { field=value, ... }".
     * Включает все поля, кроме помеченных @ToString(Mode.NO).
     * @param obj объект для преобразования
     * @return строковое представление или "null"
     */
    public static String generate(Object obj) {
        if (obj == null) return "null";

        Class<?> clazz = obj.getClass();
        if (!clazz.isAnnotationPresent(ToString.class)) {
            return obj.toString();
        }

        StringBuilder sb = new StringBuilder(clazz.getSimpleName()).append(": ");
        Field[] fields = clazz.getDeclaredFields();
        boolean first = true;

        for (Field f : fields) {
            boolean include = true;
            if (f.isAnnotationPresent(ToString.class)) {
                if (f.getAnnotation(ToString.class).value() == ToString.Mode.NO) {
                    include = false;
                }
            }

            if (include) {
                try {
                    f.setAccessible(true);
                    if (!first) sb.append(", ");
                    sb.append(f.getName()).append(" = ").append(f.get(obj));
                    first = false;
                } catch (IllegalAccessException e) {
                    if (!first) sb.append(", ");
                    sb.append(f.getName()).append("=<ERROR>");
                    first = false;
                }
            }
        }

        return sb.toString();
    }
}