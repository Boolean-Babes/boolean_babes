package com.example.boolean_babes;
public class Pentagon extends Shape {
    private double sideLength;

    public Pentagon(int x, int y, double sideLength) {
        this.x = x; // assuming 'x' is the x-coordinate of the center of the shape
        this.y = y; // assuming 'y' is the y-coordinate of the center of the shape
        this.sideLength = sideLength; // the length of each side of the pentagon
    }

    // Getter and Setter for sideLength
    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    // Example of a method specific to the Pentagon
    public double getPerimeter() {
        return 5 * sideLength;
    }

}
