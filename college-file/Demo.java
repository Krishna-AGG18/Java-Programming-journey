import java.util.*;

class Demo {
    int num;
    // Constructor using 'this' to differentiate between instance and local variable
    Demo(int num) {
        this.num = num;
    }

    // Method to return current class instance
    Demo getInstance() {
        return this;
    }

    // Display method
    void display() {
        System.out.println("Value of num: " + num);
    }

    // Using 'this' to call another constructor
    Demo() {
        this(100); // Calls parameterized constructor
        System.out.println("Default Constructor called");
    }

    public static void main(String[] args) {
        System.out.println("KRISHNA - 00214902024");
        Demo obj1 = new Demo(50);
        obj1.display();

        Demo obj2 = new Demo(); // Calls default constructor
        obj2.display();

        // Demonstrating 'this' returning current class instance
        System.out.println("Instance returned: " + obj1.getInstance());
    }
}
