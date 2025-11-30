package Cache;

/**
 * Пример класса, аннотированного @Cache.Cache.
 * Указывает области, которые должны кэшироваться.
 */
@Cache({"users", "sessions", "config"})
public class DataProcessor {
    // Пустой класс для демонстрации
}