package interfaces;

/**
 * Класс InvalidRadiusException описывает исключение, возникающее при попытке создать круг с отрицательным радиусом.
 */
public class InvalidRadiusException extends Exception {
    /**
     * Конструктор InvalidRadiusException создает новое исключение с заданным сообщением.
     * @param message сообщение об исключении
     */
    public InvalidRadiusException(String message) {
        super(message);
    }
}
