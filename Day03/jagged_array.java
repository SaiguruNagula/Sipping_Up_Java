public class jagged_array {
    public static void main(String[] args) {
        int[][] jagged = new int[3][];

        jagged[0] = new int[] {1, 2};
        jagged[1] = new int[] {10, 20, 30};
        jagged[2] = new int[] {100};

        System.out.println("Jagged array contents:");
        for (int i = 0; i < jagged.length; i++) {
            for (int j = 0; j < jagged[i].length; j++) {
                System.out.print(jagged[i][j] + " ");
            }
            System.out.println();
        }
    }
}
