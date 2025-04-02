import java.util.*;;

abstract class Person {
    private String name;
    private String gender;

    Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    // abstract method
    abstract void work();

    // concrete method
    String tostring() {
        return "Name = " + this.name + ", Gender = " + this.gender;
    }

    void newName(String newName) {
        this.name = newName;
    }
}

class Employee extends Person {
    int empId;

    Employee(String name, String gender, int empId) {
        super(name, gender);
        this.empId = empId;
    }

    void work() {
        if (empId == 0) {
            System.out.println("Not working...");
        } else {
            System.out.println("Working as employee..");
        }
    }

}

public class abstractDemo {
    public static void main(String[] args) {

        System.out.println("Krishna - 00214902024");
        // Creating objects using the concrete subclass
        Person student = new Employee("Dove", "Female", 0);
        Person employee = new Employee("Pankaj", "Male", 123);

        // Calling overridden methods
        student.work();
        employee.work();

        // Using a method from the abstract class
        employee.newName("Pankaj Kumar");
        System.out.println(employee.toString());
    }
}
