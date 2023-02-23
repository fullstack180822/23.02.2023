package com.graphics;

public abstract class Shape {

    protected String name;

    public Shape (String name) {
        this.name = name;
    }

    public void iAmNotAbstract() {
        System.out.println("I am shape -- this func is not abstract");
    }

    public abstract double getArea();

}
