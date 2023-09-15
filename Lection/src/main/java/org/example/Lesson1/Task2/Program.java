package org.example.Lesson1.Task2;

public class Program {
    static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    } // то что было раньше в задаче 1, для ООП следующий подход, который представлен ниже

    static double distance(Point2D a, Point2D b) { // метод который принимает две точчки заданные в классе Point2D
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2)); // у точки есть x, y  и с ними происходит манипуляция
    }

    public static void main(String[] args) {
        Point2D a = new Point2D(); // указываем конкретный экземпляр класса точка, вызов экземпляра класса
        a.x = 0; // значения полей
        a.y = 2;
        System.out.println(a.toString());

        Point2D b = new Point2D();
        b.x = 0;
        b.y = 10;
        System.out.println(b.toString());
        System.out.println(distance(a, b)); // вычисляем значения используя класс distance

    }
}
