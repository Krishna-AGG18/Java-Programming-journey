import java.util.*;

public class staticDemo {

    static int staticVar = 0;    // Static variable
    public static void staticMethod() {              // Static method
        System.out.println("This is a static method.");
        System.out.println("Static Variable Value: " + staticVar);
    }

    
    public void instanceMethod() {               // Instance method
        System.out.println("This is an instance method.");
    }

    static {                             // Static block
        System.out.println("KRISHNA - 00214902024");
        System.out.println("This is a static block.");
        staticVar = 10; // Initializing the static variable
    }

    public static void main(String[] args) {
        // Accessing static variable directly using the class name
        System.out.println("Static Variable Value (direct access): " + staticDemo.staticVar);

        staticDemo.staticMethod(); // Accessing static method directly using the class name

        // Accessing static variable through an object (not recommended, but valid)
        staticDemo demo = new staticDemo();
        System.out.println("Accessing Static Variable via object: " + demo.staticVar);

        
        demo.instanceMethod();  // Accessing instance method
    }

}
