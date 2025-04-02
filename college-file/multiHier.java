import java.util.*;

class Shape {
    String color;

    Shape(String color) {
        this.color = color;
    }

    String getColor() {
        return color;
    }

    double area() {
        return 0.0;
    }

    String tostring() {
        return "Shape color : " + color;
    }
}

class Polygon extends Shape {
    Polygon(String color) {
        super(color);
    }

    String tostring() {
        return "Polygon color : " + color;
    }
}

class Rectangle extends Polygon {
    private double len;
    private double wid;

    Rectangle(String color, double len, double wid) {
        super(color);
        this.len = len;
        this.wid = wid;
    }

    double getLen() {
        return len;
    }

    double getWid() {
        return wid;
    }

    double area() {
        return len * wid;
    }

    String tostring() {
        return "Rectangle with length: " + len + ", width: " + wid + ", color: " + getColor();
    }
}

class Square extends Rectangle {
    Square(String color, double side) {
        super(color, side, side);
    }

    String tostring() {
        return "Square with side: " + getLen() + ", color: " + getColor();
    }
}

public class multiHier {
    public static void main(String[] args) {
        System.out.println("Krishna - 00214902024");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the color of the square:");
        String color = scanner.nextLine();

        System.out.println("Enter the side length of the square:");
        double side = scanner.nextDouble();

        Square square = new Square(color, side);

        System.out.println(square.tostring());
        System.out.println("Area of square: " + square.area());

        scanner.close();
    }
}
