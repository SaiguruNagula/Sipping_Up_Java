package Day06;

public class Overriding {
    static class Animal {
        public void sound() {
            System.out.println("Animal makes a sound");
        }
            System.out.println("Animal makes a sound");
        }
    }

    static class Dog extends Animal {
        @Override
        public void sound() {
            System.out.println("Dog barks");
        }
    }

    static class Cat extends Animal {
        @Override
        public void sound() {
            System.out.println("Cat meows");
        }
    }

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        
        dog.sound();
        cat.sound();
    }
}
