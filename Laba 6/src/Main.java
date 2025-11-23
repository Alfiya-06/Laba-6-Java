public class Main {
    public static void main(String[] args) {
        // Задание 2
        ExampleDefault obj = new ExampleDefault(21, "test");
        DefaultProcessor.process(obj);

        // Задание 3. Создаём объект Person
        Person person = new Person("Анна", "supersecret123", 28);

        // 1) генерируем строковое представление
        String result = ToStringGenerator.generate(person);
        System.out.println("\nСтроковое представление объекта Person:");
        System.out.println(result);
        System.out.println();

        // 2) проверка с null
        System.out.println("Попытка обработать null:");
        System.out.println(ToStringGenerator.generate(null));
        System.out.println();

        // Задание 4
        System.out.println("Проверка @Validate");
        ValidateProcessor.process(new TestValidate());

        // Задание 5
        System.out.println("\nПроверка @Two");
        TwoProcessor.process(new TwoAnnotated());
    }
}