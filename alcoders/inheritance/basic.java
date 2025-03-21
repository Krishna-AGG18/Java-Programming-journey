import java.util.*;
// if i want to call the contructor of both the classes then first call the constructor of super class using super keyword....
class Rectangle{
    protected int l,b; //agar private dunga toh sub-class me mein l and b directly access nhi kr paunga.
    Scanner sc = new Scanner(System.in);

    void input(){
        System.out.println("Enter the length : ");
        l = sc.nextInt();
        System.out.println("Enter the breadth : ");
        b = sc.nextInt();
    }
    void show(){
        System.out.println("Length is : "+l);
        System.out.println("Breadth is : "+b);
    }
}
class cuboid extends Rectangle{
    protected int h;
    void input(){ // method over-riding
        super.input(); //super to call input of rectangle first
        System.out.println("Enter the height : ");
        h = sc.nextInt();
    }
    void show(){
        super.show();
        System.out.println("Height is : "+h);
    }
    void area(){
        System.out.println("Area of cuboid is : "+ 2*(l*b + b*h + h*l));
    }

    cuboid(){
        l = 10;
        b = 10;
        h = 10;
    }
}
public class basic {
    public static void main(String[] args) {
        cuboid box = new cuboid();
        // box.input();
        box.show();
        box.area();
    }
}
