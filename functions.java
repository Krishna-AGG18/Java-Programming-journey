import java.util.*;

class functions {
    public static void printMyName(String name) {
        System.out.println(name);
        return;
    }

    public static int calcSum(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name buddy : ");
        String name = sc.next();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = calcSum(a, b);
        printMyName(name);

        System.out.println(sum);
    }
}