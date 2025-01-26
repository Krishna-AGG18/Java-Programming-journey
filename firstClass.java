//First Java Program
import java.util.*;

class firstClass {
    public static void main(String[] args) {
        System.out.println("Hello World"); // single quote is permitted ,print and move to next line
        System.out.print("hello world"); // print and remainn in same line as like c

        // variables
        int a = 10;
        String name = "Krishna";
        double price = 25.50;

        // input create scannr obj then use its functions :-)
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        //conditional statements are same as C language same syntax , same way ..........
        //Loops :- for, wile, do-while | same syntax
        
        //function syntax ;
        /* public static returnDataType FunctionName(type arg1, type arg2, ....){
            statements ;
            .
            .
            .
            return statement;    only a single value is returned.
        } 

        functions in the memory are stored in the form of stack, each stored fucntion is called stack frame.
        intially main fucntion is first stack frame, memory is allocated to it, As soon as another function is called 
        it is stored in stack frame and memory is allocated to it , when it returns the final value then it is 
        automatically freed from the memory. Similarly main is also freed.....

        funcitons are called directly whereas methods are called with the helpof class objects that are being created.
            */
    }
}