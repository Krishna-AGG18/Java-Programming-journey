// WAP to demonstrate use of method overloading to calculate the area of square, rectangle and triangle.
import java.util.*;

import java.lang.Math;

public class AreaCalculator {

    // Method to calculate the area of a square
    public double calculateArea(double side) {
        return side * side;
    }

    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a triangle using Heron's formula
    public double calculateArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
        return area;
    }

    public static void main(String[] args) {
        // Create an object of the AreaCalculator class
        AreaCalculator calculator = new AreaCalculator();

        double squareArea = calculator.calculateArea(4.0);
        System.out.println("Area of square: " + squareArea);

        double rectangleArea = calculator.calculateArea(5.0, 3.0);
        System.out.println("Area of rectangle: " + rectangleArea);

        double triangleArea = calculator.calculateArea(6.0, 8.0, 10.0);
        System.out.println("Area of triangle: " + triangleArea);
    }
}
