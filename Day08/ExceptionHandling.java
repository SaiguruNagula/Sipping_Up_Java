package Day08;
class CustomException extends Exception {   // Custom exception class
    public CustomException(String message) {
        super(message);
    }
}


public class ExceptionHandling {
    

    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b; // This will throw ArithmeticException
            System.out.println("Result: " + c);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero. " + e.getMessage());
        } finally {
            System.out.println("This block will always execute.");
        }

        try {
            int age = 15;
            if (age < 18) {
            throw new CustomException("Age must be 18 or above");
            }
            System.out.println("Valid age: " + age);
        } catch (CustomException e) {
            System.out.println("Custom Error: " + e.getMessage());
        }
    }

    public static void validateAge(int age) throws CustomException {
        if (age < 18) {
            throw new CustomException("Age must be 18 or above");
        }
        System.out.println("Valid age: " + age);
    }
}
