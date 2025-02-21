
//WAP to print all the prime numbers between 1 to 100.
import java.util.*;

public class prog3 {
    public static void main(String[] args) {
        boolean temp;
        System.out.println("Krishna - 00214902024");
        System.out.println("\nPrime numbers between 1 to 100 are : ");

        for (int i = 2; i < 100; i++) {
            temp = true;
            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    temp = false;
                    break;
                }
            }
            if(temp){
                System.out.println(i);}
        }
    }
}
