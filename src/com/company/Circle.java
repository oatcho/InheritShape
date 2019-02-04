package com.company;

public class Circle extends Shape {

    double radius;

    public Circle (String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.pow((radius),2) * Math.PI;
    }

    public double getPerimeter() {
        return ((radius)*2*Math.PI);
    }

    @Override
    public void printShape() {
        System.out.println("This circle is the color: " + color + ", it is filled (" + filled + "). It's perimeter is: " + getPerimeter() + ", and its area is: " + getArea() + "." );
    }


}
