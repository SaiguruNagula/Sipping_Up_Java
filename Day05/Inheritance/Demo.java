package Day05.Inheritance;

public class Demo {
    
    public static void main(String[] args) {
        Advcalc ac = new Advcalc();
        System.out.println("Addition: " + ac.add(10, 5)); // Inherited method
        System.out.println("Subtraction: " + ac.sub(10, 5)); // Inherited method
        System.out.println("Multiplication: " + ac.mul(10, 5)); // Own method
        System.out.println("Division: " + ac.div(10, 5)); // Own method
    }
}
