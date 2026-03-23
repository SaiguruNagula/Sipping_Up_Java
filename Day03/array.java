public class array {
    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        System.out.println("Array length: " + nums.length);
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[" + i + "]=" + nums[i]);
        }

        // Modify element
        nums[2] = 33;
        System.out.println("Changed value at index 2: " + nums[2]);

        // Enhanced for loop
        for (int n : nums) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
