import java.util.*;
public class arrays2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size, max,min;
        System.out.print("Enter the soze of the array : ");
        size = sc.nextInt();

        int[] arr = new int[size];

        for(int i =0 ; i<arr.length ; i++){
            System.err.print("Enter num "+i+1 + " : ");
            arr[i] = sc.nextInt();
        }
        max =min = arr[0];

        for(int num : arr){
            if(num < min) min = num;
            else if(num > max) max = num;
        }
        System.out.println("Max num : " + max);
        System.out.println("Min num : " + min);
    }
}
