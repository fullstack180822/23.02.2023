package com.graphics;

public class Main {

    public static void main(String[] args) {

    }

    public void PrintCircle(Circle shape) {

    }

    public void PrintArea(Shape shape) {
        System.out.println(shape.getArea());

        if (shape instanceof Circle) {
            System.out.println(((Circle)shape).radius);
        }

        // shape.printData(); // will print the radius

    }
}
