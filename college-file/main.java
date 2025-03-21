// WAP to print the size (in bytes ) and range of all the primitive datatypes in JAVA.
import java.util.*;
public class main {
    public static void main(String[] args) {
        System.out.println("Krishna - 00214902024");
        System.out.println("Byte: ");
        System.out.println("Size: " + Byte.BYTES + " bytes");
        System.out.println("Range: " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        
        System.out.println("\nShort: ");
        System.out.println("Size: " + Short.BYTES + " bytes");
        System.out.println("Range: " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        
        System.out.println("\nInt: ");
        System.out.println("Size: " + Integer.BYTES + " bytes");
        System.out.println("Range: " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        
        System.out.println("\nLong: ");
        System.out.println("Size: " + Long.BYTES + " bytes");
        System.out.println("Range: " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        
        System.out.println("\nFloat: ");
        System.out.println("Size: " + Float.BYTES + " bytes");
        System.out.println("Range: " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        
        System.out.println("\nDouble: ");
        System.out.println("Size: " + Double.BYTES + " bytes");
        System.out.println("Range: " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        
        System.out.println("\nChar: ");
        System.out.println("Size: " + Character.BYTES + " bytes");
        System.out.println("Range: " + (int) Character.MIN_VALUE + " to " + (int) Character.MAX_VALUE);
        
        System.out.println("\nBoolean: ");
        System.out.println("Size: 1 bit ");
        System.out.println("Range: true or false");
    }
}