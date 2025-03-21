 import java.util.*;
public class arrayASCorDSCorderCheck {
    public static void main(String[] args) {
        int[] arr = {1,2,3,1,5};
        Boolean isASC = true;

        for(int i = 0; i < arr.length-1 ; i++){
            if(arr[i] > arr[i+1] ) isASC = false;
            if(!isASC){
                System.out.println("Array is not ascending.");
                break;
            }
        }
        if(isASC) System.out.println("Array is ascending");
    }
}
