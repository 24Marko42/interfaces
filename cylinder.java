package interfaces;

//Класс Cylinder описывает цилиндр.
public class cylinder implements figure {
    private figure base; //Поле base хранит основание цилиндра.
    private double height; //Поле height хранит высоту цилиндра.

    /*
    Конструктор Cylinder создает новый цилиндр с заданным основанием и высотой.
    InvalidHeightException - если высота отрицательная
     */
    public cylinder(figure base, double height) throws InvalidHeightException {
        if (height < 0) {
            throw new InvalidHeightException("Высота не может быть отрицательной");
        }
        this.base = base;
        this.height = height;
    }
    
    //Метод volume() вычисляет объем цилиндра.
    public double volume() {
        return base.area() * height;
    }

    //Метод toString() возвращает строковое представление цилиндра.
    @Override
    public String toString() {
        return "Cylinder {" + "base=" + base + ", height=" + height + ", volume=" + volume() + '}';
    }
}
