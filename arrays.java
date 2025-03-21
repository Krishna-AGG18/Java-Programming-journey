import java.util.*;

class arrays {
    public static void main(String[] args) {
        // let we have a student named xyz we have to stores his age, marks in three subjects so we create array instead of 4 vars 
        int[] marks = new int[4];
        marks[0] = 18;
        marks[1] = 95;
        marks[2] = 87;
        marks[3] = 97;
        
        System.out.println(marks);   // returns a garbage value related to the address of array in memory.
        for (int i : marks) {
            System.out.println(i);
        }

        Scanner sc= new Scanner(System.in);
        int size; 
        System.out.print("Enter the size of the array : ");
        size= sc.nextInt();
        int[] arr = new int[size];

        for(int i = 0; i< size; i++){
            System.out.print("Enter the data part : ");
            arr[i] = sc.nextInt();
        }
        for (int i : arr) {
            System.out.println(i);
        }

    }

}
