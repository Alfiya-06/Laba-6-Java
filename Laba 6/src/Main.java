import Cache.CacheHandler;
import Cache.DataProcessor;
import Default.DefaultProcessor;
import Default.ExampleDefault;
import Invoke.InvokeHandler;
import Invoke.InvokeWorker;
import ToString.Person;
import ToString.ToStringGenerator;
import Two.TwoAnnotated;
import Two.TwoProcessor;
import Validate.TestValidate;
import Validate.ValidateProcessor;

/**
 * Главный класс для демонстрации работы всех аннотаций.
 */
public class Main {
    /**
     * Точка входа в программу.
     */
    public static void main(String[] args) {
        // Задание 1: @Invoke
        System.out.println("=== Задание 1: @Invoke ===");
        InvokeWorker worker = new InvokeWorker();
        InvokeHandler.run(worker);

        // Задание 2: @Default
        System.out.println("\n=== Задание 2: @Default ===");
        ExampleDefault obj = new ExampleDefault(21, "test");
        DefaultProcessor.process(obj);

        // Задание 3: @ToString
        System.out.println("\n=== Задание 3: @ToString ===");
        Person person = new Person("Анна", "supersecret123", 28);
        String result = ToStringGenerator.generate(person);
        System.out.println("Строковое представление объекта Person:");
        System.out.println(result);

        System.out.println("\nПопытка обработать null:");
        System.out.println(ToStringGenerator.generate(null));

        // Задание 4: @Validate
        System.out.println("\n=== Задание 4: @Validate ===");
        ValidateProcessor.process(new TestValidate());

        // Задание 5: @Two
        System.out.println("\n=== Задание 5: @Two ===");
        TwoProcessor.process(new TwoAnnotated());

        // Задание 6: @Cache
        System.out.println("\n=== Задание 6: @Cache ===");
        CacheHandler.process(DataProcessor.class);
        CacheHandler.process(Object.class); // без аннотации

    }
}