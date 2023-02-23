package com.graphics;

public class Circle extends Shape {

    protected float radius;

    public Circle(String name, float radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
