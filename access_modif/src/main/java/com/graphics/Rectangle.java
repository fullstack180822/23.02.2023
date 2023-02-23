package com.graphics;

public class Rectangle extends Shape {

    protected float a;
    protected float b;

    public Rectangle(String name, float a, float b) {
        super(name);
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return a * b;
    }
}
