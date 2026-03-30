package Day06;

public class Wrapper {
    public static void main(String[] args) {
        // Boxing: Converting primitive to wrapper object
        int primitiveInt = 10;
        Integer wrapperInt = Integer.valueOf(primitiveInt); // Explicit boxing
        Integer autoBoxedInt = primitiveInt; // Autoboxing

        // Unboxing: Converting wrapper object to primitive
        Integer wrapperInt2 = 20;
        int primitiveInt2 = wrapperInt2.intValue(); // Explicit unboxing
        int autoUnboxedInt = wrapperInt2; // Autounboxing

        System.out.println("Boxed: " + wrapperInt);
        System.out.println("Auto-boxed: " + autoBoxedInt);
        System.out.println("Unboxed: " + primitiveInt2);
        System.out.println("Auto-unboxed: " + autoUnboxedInt);
    }
}
