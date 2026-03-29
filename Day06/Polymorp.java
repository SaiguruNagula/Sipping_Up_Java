package Day06;

public class Polymorp {
    // Base class
    static class Animal {
        void sound() {
            System.out.println("Some generic sound");
        }
    }

    // Derived classes
    static class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Woof! Woof!");
        }
    }

    static class Cat extends Animal {
        @Override
        void sound() {
            System.out.println("Meow! Meow!");
        }
    }

    static class Cow extends Animal {
        @Override
        void sound() {
            System.out.println("Moo! Moo!");
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal cow = new Cow();
        
        dog.sound();   // Output: Woof! Woof!
        cat.sound();   // Output: Meow! Meow!
        cow.sound();   // Output: Moo! Moo!
    }
}
