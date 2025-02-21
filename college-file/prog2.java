//WAP to demonstrate the use of arithmetic and bitwise operator.
import java.util.*;
public class prog2 {
    public static void main(String[] args) {
        int a = 10, b = 5;
        System.out.println("Krishna - 00214902024");
        System.out.println("Arithmetic Operator : ");
        System.out.println("a + b = " + (a + b)); // 15
        System.out.println("a - b = " + (a - b)); // 5
        System.out.println("a * b = " + (a * b)); // 50
        System.out.println("a / b = " + (a / b)); // 2
        System.out.println("a % b = " + (a % b)); // 0
        
        System.out.println("\nBitwise Operator : ");
        System.out.println("a & b = " + (a & b));
        System.out.println("a | b = " + (a | b));
        System.out.println("a ^ b = " + (a ^ b));
        System.out.println("~a = " + (~a));
        System.out.println("a >> 1 = " + (a >> 1));
        System.out.println("a << 1 = " + (a << 1));
        System.out.println("a >>> 1 = " + (a >>> 1));

    }
}
