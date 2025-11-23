/**
 * Пример класса с аннотацией @ToString.
 * Поле password исключено из вывода.
 */
@ToString
public class Person {

    private String name;

    @ToString(ToString.Mode.NO)
    private String password;

    private int age;

    /**
     * Создаёт экземпляр Person.
     */
    public Person(String name, String password, int age) {
        this.name = name;
        this.password = password;
        this.age = age;
    }
}
