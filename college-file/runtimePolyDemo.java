// run-time polymorphism demo
class Animal {
    Animal() {
        System.out.println("Constructor: Animal");
    }

    void sound() {
        System.out.println("Animal makes a generic sound...");
    }
}

class Monkey extends Animal {
    Monkey() {
        System.out.println("Constructor: Monkey");
    }

    void sound() {
        System.out.println("Monkey chatters...");
    }
}

class Donkey extends Animal {
    Donkey() {
        System.out.println("Constructor: Donkey");
    }

    void sound() {
        System.out.println("Donkey brays...");
    }
}

class Human extends Animal {
    Human() {
        System.out.println("Constructor: Human");
    }

    void sound() {
        System.out.println("Human speaks...");
    }
}

public class runtimePolyDemo {
    public static void main(String[] args) {
        System.out.println("KRISHNA - 00214902024\n");

        System.out.println("===== Run-Time Polymorphism Demonstration =====");

        Animal a;

        a = new Monkey();  // Animal reference → Monkey object
        a.sound();         // Monkey's sound() called

        System.out.println();

        a = new Donkey();  // Animal reference → Donkey object
        a.sound();         // Donkey's sound() called

        System.out.println();

        a = new Human();   // Animal reference → Human object
        a.sound();         // Human's sound() called
    }
}
