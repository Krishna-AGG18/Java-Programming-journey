
// WAP to calculate n terms of fibonacci series and store it in a array.
import java.util.*;

class prog6 {
    public static void main(String[] args) {
        int n, fir = 0, sec = 1, term;
        System.out.println("Krishna - 00214902024");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms u want: ");
        n = sc.nextInt();
        int arr[] = new int[n];
        if (n== 0) return;
        arr[0] = fir;
        if (n > 1) {
            arr[1] = sec;
            for (int i = 2; i < n; i++) {
                term = fir + sec;
                arr[i] = term;
                fir = sec;
                sec = term;
            }
        }

        for(int num : arr){
            System.out.println(num);
        }
    }
}