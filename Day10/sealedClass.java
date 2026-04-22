package Day10;

public class sealedClass {
    sealed static class Vehicle permits Car, Bike {
        String name;

        Vehicle(String name) {
            this.name = name;
        }
    }

    final static class Car extends Vehicle {
        Car(String name) {
            super(name);
        }
    }

    /**
     * A non-sealed static subclass of {@link Vehicle} representing a bike.
     * As a {@code non-sealed} class, it may be extended by other classes despite
     * its sealed superclass. It initializes the bike with a name passed to the
     * {@link Vehicle} constructor.
     */
    non-sealed static class Bike extends Vehicle {
        Bike(String name) {
            super(name);
        }
    }
}
