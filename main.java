package interfaces;

//import всего нужного для работы программы
import interfaces.Exception.InvalidDimensionException;
import interfaces.Exception.InvalidHeightException;
import interfaces.Exception.InvalidRadiusException;
import interfaces.circle;
import interfaces.rectangle;
import interfaces.cylinder;

//В main создаём объекты классов Circle, Rectangle и Cylinder (правильные и неправильные).
public class main {
    public static void main(String[] args) {
        try {
            // Создаем объекты (правильные) и выводим их строковое представление 
            circle circle1 = new circle(5);
            rectangle rectangle1 = new rectangle(4, 6);
            cylinder cylinder1 = new cylinder(circle1, 10.56);

            // Выводим строковые представления объектов
            System.out.println(circle1.toString());
            System.out.println(rectangle1.toString());
            System.out.println(cylinder1.toString());
            
            // Создаем объекты, чтобы проверить работу исключений
            circle circle = new circle(-5);
            rectangle rectangle = new rectangle(-4, 6);
            cylinder cylinder = new cylinder(circle, -10);

        } catch (InvalidRadiusException e) {
            // Если бросается исключение InvalidRadiusException, выводим сообщение об ошибке
            System.out.println(e.getMessage());
        } catch (InvalidDimensionException e) {
            // Если бросается исключение InvalidDimensionException, выводим сообщение об ошибке
            System.out.println(e.getMessage());
        } catch (InvalidHeightException e) {
            // Если бросается исключение InvalidHeightException, выводим сообщение об ошибке
            System.out.println(e.getMessage());
        }
    }
}