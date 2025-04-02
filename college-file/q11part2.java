// Base class: Shape
class Shape {
    private String color;

    public Shape(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public double area() {
        return 0.0; // Default implementation
    }

    @Override
    public String toString() {
        return "Shape color: " + color;
    }
}

// First subclass: Polygon
class Polygon extends Shape {
    public Polygon(String color) {
        super(color);
    }

    @Override
    public String toString() {
        return "Polygon with color: " + getColor();
    }
}

// Subclass of Polygon: Rectangle
class Rectangle extends Polygon {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public String toString() {
        return "Rectangle with length: " + length + ", width: " + width + ", color: " + getColor();
    }
}

// Subclass of Polygon: Triangle (added for hierarchical inheritance)
class Triangle extends Polygon {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle with base: " + base + ", height: " + height + ", color: " + getColor();
    }
}

// Subclass of Rectangle: Square
class Square extends Rectangle {
    public Square(String color, double side) {
        super(color, side, side); // A square has equal sides
    }

    @Override
    public String toString() {
        return "Square with side: " + getLength() + ", color: " + getColor();
    }
}

// Main class to demonstrate the hierarchy
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        // Create a Rectangle object
        Rectangle rectangle = new Rectangle("Blue", 5.0, 3.0);
        System.out.println(rectangle.toString());
        System.out.println("Area of rectangle: " + rectangle.area());

        // Create a Square object
        Square square = new Square("Red", 4.0);
        System.out.println(square.toString());
        System.out.println("Area of square: " + square.area());

        // Create a Triangle object (hierarchical inheritance)
        Triangle triangle = new Triangle("Green", 6.0, 4.0);
        System.out.println(triangle.toString());
        System.out.println("Area of triangle: " + triangle.area());
    }
}
