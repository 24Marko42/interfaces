package interfaces;

//Класс Circle реализует интерфейс Figure и описывает круг.
public class circle implements figure {
    private double radius; //Поле radius хранит радиус круга.

    /*
    Конструктор Circle создает новый круг с заданным радиусом.
    InvalidRadiusException - если радиус отрицательный
     */
    public circle(double radius) throws InvalidRadiusException{
        if (radius < 0) {
            throw new InvalidRadiusException("Радиус не может быть отрицательным");
        }
        this.radius = radius;
    }

    //Метод area() вычисляет площадь круга.
    @Override // означает, что метод переопределён в данном классе
    public double area() {
        return Math.PI * radius * radius;
    }

    //Метод perimeter() вычисляет периметр круга.
    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    //Метод toString() возвращает строковое представление круга.
    @Override
    public String toString() {
        return "Circle {" + "radius=" + radius + ", area=" + area() + ", perimeter=" + perimeter() + '}';
    }
}