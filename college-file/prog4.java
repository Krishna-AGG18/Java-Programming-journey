//WAP declaring a class Rectangle with data members length and breadth and member function input , output , calcArea.
import java.util.*;

class Rectangle {
    int length;
    int breadth;

    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length and breadth : ");
        this.length = sc.nextInt();
        this.breadth = sc.nextInt();
        System.out.print("\n");
        sc.close();
}
void calcArea(){
    System.out.print("Area of Rectangle is : " + this.length*this.breadth + " \n");
}
void output(){
    System.out.print("Length of Rectangle is : " + this.length + " \n");
    System.out.print("Breadth of Rectangle is : " + this.breadth + " \n");
}
}
class prog4 {
    public static void main(String[] args) {
        System.out.println("Krishna - 00214902024");

        Rectangle rec1 = new Rectangle();
        rec1.input();
        rec1.output();
        rec1.calcArea();
    }
}
