package com.company;

public class Shape {
    String color;
    boolean filled;

    public Shape (String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public void printShape() {
        System.out.println("This shape is the color: " + color + "and it is filled in (" + filled + ").");
    }
}
