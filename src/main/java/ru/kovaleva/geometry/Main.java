package ru.kovaleva.geometry;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3 ,4, 5);

        print("круг", circle);
        System.out.println();
        print("прямоугольник", rectangle);
        System.out.println();
        print("треугольник", triangle);
    }

    private static void print(String name, Shape shape) {
        System.out.println(name + " " + shape.getDescription());
    }
}