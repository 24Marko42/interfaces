package interfaces;

/**
 * Класс InvalidHeightException описывает исключение, возникающее при попытке создать цилиндр с отрицательной высотой.
 */
public class InvalidHeightException extends Exception {
    /**
     * Конструктор InvalidHeightException создает новое исключение с заданным сообщением.
     * message - сообщение об исключении
     */
    public InvalidHeightException(String message) {
        super(message);
    }
}