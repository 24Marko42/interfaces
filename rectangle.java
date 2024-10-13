package interfaces;


//Класс Rectangle реализует интерфейс Figure и описывает прямоугольник.
public class rectangle implements figure {
    private double width; //Поле width хранит ширину прямоугольника.
    private double height; // Поле height хранит высоту прямоугольника.

    /**
     * Конструктор Rectangle создает новый прямоугольник с заданными размерами.
     * InvalidDimensionException - если размеры отрицательные
     */
    public rectangle(double width, double height) throws InvalidDimensionException{
        if (width < 0 || height < 0) {
            throw new InvalidDimensionException("Размеры не могут быть отрицательными");
        }
        this.width = width;
        this.height = height;
    }

    //Метод area() вычисляет площадь прямоугольника.
    @Override
    public double area() {
        return width * height;
    }

    //Метод perimeter() вычисляет периметр прямоугольника.
    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    //Метод toString() возвращает строковое представление прямоугольника.
    @Override
    public String toString() {
        return "Rectangle {" + "width=" + width + ", height=" + height + ", area=" + area() + ", perimeter=" + perimeter() + '}';
    }
}
