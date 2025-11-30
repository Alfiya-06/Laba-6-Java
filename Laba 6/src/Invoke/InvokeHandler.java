package Invoke;

import java.lang.reflect.Method;

/**
 * Обработчик аннотации @Invoke.Invoke.
 * Вызывает все методы объекта, помеченные аннотацией @Invoke.Invoke.
 */
public class InvokeHandler {

    /**
     * Выполняет автоматический вызов методов с аннотацией @Invoke.Invoke.
     */
    public static void run(Object obj) {
        if (obj == null) {
            return;
        }

        Class<?> clazz = obj.getClass();
        Method[] methods = clazz.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Invoke.class)) {
                try {
                    method.invoke(obj);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
