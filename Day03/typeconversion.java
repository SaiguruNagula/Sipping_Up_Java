public class typeconversion {
    public static void main(String[] args) {
        // Type Conversion - Automatic (Implicit)
        int intValue = 100;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit conversion: " + doubleValue);
        
        // Type Promotion - Automatic during operations
        int a = 5;
        double b = 2.5;
        double result = a + b; // int promoted to double
        System.out.println("Type promotion: " + result);
        
        // Casting - Explicit conversion
        double num = 9.99;
        int castInt = (int) num; // double to int
        System.out.println("Explicit casting: " + castInt);
        
        // Casting with loss of precision
        long longVal = 1000L;
        int castFromLong = (int) longVal;
        System.out.println("Long to int: " + castFromLong);
    }
}
