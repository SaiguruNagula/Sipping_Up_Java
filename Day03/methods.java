public class methods {
    // Simple method examples
    public static int add(int a, int b) {
        return a + b;
    }

    public static void printMessage(String message) {
        System.out.println(message);
    }

    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int sum = add(x, y);

        printMessage("Sum is: " + sum);

        // Use method overloading
        System.out.println("Multiply: " + multiply(2, 4));
    }

    public static int multiply(int a, int b) {
        return a * b;
    }
}
