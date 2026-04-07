package Day08;

public class input {
    public static void main(String[] args) throws Exception {
        // Using BufferedReader
        java.io.BufferedReader br = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.println("Enter your name (BufferedReader):");
        String name = br.readLine();
        System.out.println("Hello, " + name);
        br.close();
        
        // Using Scanner
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter your age (Scanner):");
        int age = sc.nextInt();
        System.out.println("Your age is: " + age);
        sc.close();
    }
}
