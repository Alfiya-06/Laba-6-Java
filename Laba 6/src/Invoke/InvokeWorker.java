package Invoke;

/**
 * Класс, содержащий методы для демонстрации аннотации @Invoke.Invoke.
 */
public class InvokeWorker {

    /**
     * Метод, который будет вызван автоматически.
     */
    @Invoke
    public void job1() {
        System.out.println("Выполняется задача 1");
    }

    /**
     * Обычный метод без аннотации — не вызывается автоматически.
     */
    public void job2() {
        System.out.println("Это обычная задача — она не вызывается автоматически");
    }

    /**
     * Второй метод, помеченный для автоматического вызова.
     */
    @Invoke
    public void job3() {
        System.out.println("Выполняется задача 3");
    }
}
