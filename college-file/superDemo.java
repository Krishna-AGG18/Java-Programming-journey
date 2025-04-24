//demonstrate use of super to invoke base class constructor

class Animal {
    Animal() {
        System.out.println("Constructor: Animal (Base Class)");
    }

    void sound() {
        System.out.println("Animal makes a generic sound...");
    }
}

class Human extends Animal {
    Human() {
        super();
        System.out.println("Constructor: Human (Child of Animal)");
    }

    void sound() {
        System.out.println("Human speaks...");
    }
}

class BabyHuman extends Human {
    BabyHuman() {
        super();
        System.out.println("Constructor: BabyHuman (Child of Human -> Multi-Level)");
    }

    void sound() {
        System.out.println("Baby babbles...");
    }
}

public class superDemo {
    public static void main(String[] args) {
        System.out.println("KRISHNA - 00214902024");

        BabyHuman baby = new BabyHuman();
        baby.sound();
    }
}
