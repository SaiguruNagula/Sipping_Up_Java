public class loops {
    public static void main(String[] args) {
        // Basic for loop
        System.out.println("Basic for loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // Enhanced for loop (for-each)
        System.out.println("\nEnhanced for loop:");
        int[] numbers = {1, 2, 3, 4, 5};
        for (int num : numbers) {
            System.out.println("num = " + num);
        }

        // While loop
        System.out.println("\nWhile loop:");
        int j = 0;
        while (j < 5) {
            System.out.println("j = " + j);
            j++;
        }

        // Do-while loop
        System.out.println("\nDo-while loop:");
        int k = 0;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k < 5);

        // Nested loops
        System.out.println("\nNested loops:");
        for (int x = 1; x <= 3; x++) {
            for (int y = 1; y <= 3; y++) {
                System.out.println("x=" + x + ", y=" + y);
            }
        }

        // Labeled loops with break and continue
        System.out.println("\nLabeled loops:");
        outer: for (int a = 1; a <= 3; a++) {
            inner: for (int b = 1; b <= 3; b++) {
                if (a == 2 && b == 2) {
                    break outer; // Breaks out of outer loop
                }
                System.out.println("a=" + a + ", b=" + b);
            }
        }

        // Infinite loop with break
        System.out.println("\nInfinite loop with break:");
        int counter = 0;
        while (true) {
            System.out.println("Counter: " + counter);
            counter++;
            if (counter >= 5) {
                break;
            }
        }
    }
}
