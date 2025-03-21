//WAP to remove duplicates from sorted array.
import java.util.*;

public class prog5 {
        public static void main(String[] args) {
            System.out.println("Krishna - 00214902024");
            int arr[] = {1,1,1,2,3,3,4,5,6,6};

            System.out.println("Array before removal is : ");
            for(int num : arr){
                System.out.print(" " + num);
            }
            int index = 1;
            for( int i = 1; i< arr.length ; i++){
                if(arr[i] != arr[i-1]){
                    arr[index] = arr[i];
                    index++;
                }
            }
            System.out.println("\nArray after removal is : ");
            for(int i = 0 ; i< index ; i++){
                System.out.print(" " + arr[i]);
            }
        }
}
