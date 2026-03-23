public class operators {
    public static void main(String[] args) {
        // Arithmetic Operators
        int a = 10, b = 5;
        System.out.println("Addition: " + (a + b));      // 15
        System.out.println("Subtraction: " + (a - b));    // 5
        System.out.println("Multiplication: " + (a * b)); // 50
        System.out.println("Division: " + (a / b));       // 2
        System.out.println("Modulus: " + (a % b));        // 0

        // Unary Operators
        System.out.println("Pre-increment: " + (++a));    // 11
        System.out.println("Post-increment: " + (b++));   // 5
        System.out.println("Negation: " + (-a));          // -11

        // Assignment Operators
        int c = 10;
        c += 5;  // c = 15
        c -= 3;  // c = 12
        c *= 2;  // c = 24
        c /= 4;  // c = 6
        System.out.println("Assignment result: " + c);

        // Comparison Operators
        System.out.println("Equal: " + (a == b));         // false
        System.out.println("Not Equal: " + (a != b));     // true
        System.out.println("Greater: " + (a > b));        // true
        System.out.println("Less: " + (a < b));           // false

        // Logical Operators
        boolean x = true, y = false;
        System.out.println("AND: " + (x && y));           // false
        System.out.println("OR: " + (x || y));            // true
        System.out.println("NOT: " + (!x));               // false

        // Bitwise Operators
        System.out.println("Bitwise AND: " + (a & b));    // 1
        System.out.println("Bitwise OR: " + (a | b));     // 15
        System.out.println("Bitwise XOR: " + (a ^ b));    // 14
        System.out.println("Left Shift: " + (a << 1));    // 22
        System.out.println("Right Shift: " + (a >> 1));   // 5

        // Ternary Operator
        String result = (a > b) ? "a is greater" : "b is greater";
        System.out.println(result);
    }
}
