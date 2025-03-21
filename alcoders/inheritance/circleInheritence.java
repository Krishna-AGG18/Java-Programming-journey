import java.util.*;
class circle{
    protected int r;
    Scanner sc = new Scanner(System.in);
    void input(){
        System.out.print("Enter the radius : ");
        r = sc.nextInt();
    }
    void show(){
        System.out.println("Radius is : "+r);
    }
    void area(){
        System.out.println("Area of circle is : "+ r*r*Math.PI+" "+" unit sqaures.");
    }
    circle(){
        r = 2;
    }
}
class cylinder extends circle{
    protected int h;
    void input(){
        super.input();
        System.out.print("Enter the height : ");
        h = sc.nextInt();
    }
    void show(){
        super.show();
        System.out.println("Height is : "+h);
    }
    void area(){
        System.out.println("Area of the cylinder is : "+ 2*Math.PI*r*(r+h)+" "+" unit sqaures.");
    }
    cylinder(){
        super();
        h = 10;
    }
}
class cone extends cylinder{
    protected int l;
    void input(){
        super.input();
        System.out.print("Enter the slant height : ");
        l = sc.nextInt();
    }
    void show(){
        super.show();
        System.out.println("Slant height is : "+h);
    }
    void area(){
        System.out.println("Area of the cone is : "+ Math.PI*r*(r+l)+" "+" unit sqaures.");
    }
}
public class circleInheritence {
    public static void main(String[] args) {
        circle gola = new circle();
        gola.input();
        gola.show();
        gola.area();

        cylinder tube = new cylinder();
        tube.input();
        tube.show();
        tube.area();

        cone icecream = new cone();
        icecream.input();
        icecream.show();
        icecream.area();
    }
}
