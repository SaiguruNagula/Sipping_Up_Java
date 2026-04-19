package Day10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class StreamAPi {
    

    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);
          
        int result = nums.stream()
                         .filter(n -> n % 2 == 0) // Filter even numbers
                         .map(n -> n * n) // Square the numbers
                         .reduce(0, Integer::sum); // Sum them up

        System.out.println("Result: " + result); // Output: Result: 20
        
    }
}
