import java.util.*;
class bank{
    protected int accNo, balance;
    protected String name;
    Scanner sc= new Scanner(System.in);

    void input(){
        System.out.print("Enter the name : ");
        name = sc.nextLine();
        sc.nextLine();

        System.out.print("Enter the account number : ");
        accNo = sc.nextInt();

    }
    void show(){
        System.out.println("Name : "+name);
        System.out.println("Account number : "+accNo);
        System.out.println("Current balance : $"+balance);
    }
    bank(){
        balance = 1909;
    }
}
class saving extends bank{
    protected int withdrawAmt, depAmt;
    void input(){
        super.input();
        super.show();
    }
    void withdraw(){
        System.out.print("Enter the amount to be withdrawn : ");
        withdrawAmt = sc.nextInt();

        balance = balance - withdrawAmt;
        show();
    }
    void deposit(){
        System.out.print("Enter the amount to be deposit : ");
        depAmt = sc.nextInt();

        balance = balance + withdrawAmt;
        show();
    }
    void show(){
        System.out.println("New amount : "+balance);
    }
}
public class bankINHERITENCE {
    public static void main(String[] args) {
        // bank cust1 = new bank();
        // cust1.input();
        // cust1.show();

        saving cust_11 = new saving();
        cust_11.input();
        cust_11.deposit();

    }
}
