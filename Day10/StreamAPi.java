package Day10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class StreamAPi {
    

    /**
     * Demonstrates the usage of Java Stream API for functional data processing.
     * 
     * This method performs the following operations:
     * 1. Creates a stream from a list of integers
     * 2. Filters the stream to keep only even numbers using the filter() operation
     * 3. Transforms each even number by squaring it using the map() operation
     * 4. Reduces the stream to a single value by summing all squared numbers using reduce()
     * 
     * Stream API Benefits:
     * - Provides a declarative way to process collections of data
     * - Enables lazy evaluation for better performance
     * - Supports method chaining for cleaner, more readable code
     * - Allows functional programming paradigm in Java
     * - Can be easily parallelized for concurrent processing
     * 
     * In this example: [1, 2, 3, 4, 5] -> filter evens [2, 4] -> square [4, 16] -> sum = 20
     */
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
          
        int result = nums.stream()
                         .filter(n -> n % 2 == 0) // Filter even numbers
                         .map(n -> n * n) // Square the numbers
                         .reduce(0, Integer::sum); // Sum them up

        System.out.println("Result: " + result); // Output: Result: 20
        
    }
}
