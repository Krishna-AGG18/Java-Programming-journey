import java.util.*;

class Bank{
    double getRateOfInterest(){
        return 0.0;
    }
}
class SBI extends Bank{
    double getRateOfInterest(){
        return 7.8;
    }
}
class ICICI extends Bank{
    double getRateOfInterest(){
        return 8.7;
    }
}
class HDFC extends Bank{
    double getRateOfInterest(){
        return 10.8;
    }
}
public class polyMorphism {
    public static void main(String[] args) {
        System.out.println("Krishna - 00214902024");

        Bank demo = new Bank();
        System.out.println("Initially rate of interest is : " + demo.getRateOfInterest());

        SBI demo1 = new SBI();
        System.out.println("Rate of interest at SBI : " + demo1.getRateOfInterest());

        ICICI demo2 = new ICICI();
        System.out.println("Rate of interest at ICICI : " + demo2.getRateOfInterest());

        HDFC demo3 = new HDFC();
        System.out.println("Rate of interest at HDFC : " + demo3.getRateOfInterest());
    }
}
