import java.io.*;

public class multiarray {


    public static void main(String[] args){

      	// Array Created and Initialized
        int[][][] arr = { { { 1, 2 }, { 3, 4 } }, { { 5, 6 }, { 7, 8 } } };
      
      	// Defining the x,y,z in Multi-dimensional Array
      	int n = arr.length;
      	int m = arr[0].length;
      	int o = arr[0][0].length;

        // Printing the Array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
            for (int k = 0; k < o; k++) {
                System.out.print( arr[i][j][k]);
            }
            System.out.println();
            }
        }
        }
    }

