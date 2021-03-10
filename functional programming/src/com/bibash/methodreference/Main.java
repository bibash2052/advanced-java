package com.bibash.methodreference;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);

        //Using lambdas
        Shape shape = (Rectangle rect) -> {
            return rect.calculateRectangleArea();
        };

        //Using method reference
        Shape shape1 = Rectangle::calculateRectangleArea;

        System.out.println("Area using lambdas: " + shape.getArea(rectangle));
        System.out.println("Area using method reference: " + shape1.getArea(rectangle));
    }
}
