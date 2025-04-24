class Animal {
    Animal() {
        System.out.println("Constructor: Animal (Base Class)");
    }

    void sound() {
        System.out.println("Animal makes a generic sound...");
    }
}

class Monkey extends Animal {
    Monkey() {
        super();
        System.out.println("Constructor: Monkey (Child of Animal)");
    }

    void sound() {
        System.out.println("Monkey chatters...");
    }
}

class Donkey extends Animal {
    Donkey() {
        super();
        System.out.println("Constructor: Donkey (Child of Animal)");
    }

    void sound() {
        System.out.println("Donkey brays...");
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

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("KRISHNA - 00214902024\n");

        System.out.println("===== Demonstrating Hierarchical Inheritance =====");
        Monkey monkey = new Monkey();
        monkey.sound();
        System.out.println();

        Donkey donkey = new Donkey();
        donkey.sound();
        System.out.println();

        Human human = new Human();
        human.sound();
        System.out.println();

        System.out.println("===== Demonstrating Multi-Level Inheritance =====");
        BabyHuman baby = new BabyHuman();
        baby.sound();
    }
}
