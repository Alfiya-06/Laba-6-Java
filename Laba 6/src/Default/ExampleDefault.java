package Default;

/**
 * Пример класса, аннотированного @Default.Default.
 */
@Default(String.class)
public class ExampleDefault {

    private int number;
    private String text;

    public ExampleDefault(int number, String text) {
        this.number = number;
        this.text = text;
    }
}

