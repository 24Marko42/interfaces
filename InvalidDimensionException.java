package interfaces;

/**
 * Класс InvalidDimensionException описывает исключение, возникающее при попытке создать прямоугольник с отрицательными размерами.
 */
public class InvalidDimensionException extends Exception {
    /**
     * Конструктор InvalidDimensionException создает новое исключение с заданным сообщением.
     * @param message сообщение об исключении
     */
    public InvalidDimensionException(String message) {
        super(message);
    }
}