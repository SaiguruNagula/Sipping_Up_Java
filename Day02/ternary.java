public class ternary {
    public static void main(String[] args) {
        int age = 20;
        String status = (age >= 18) ? "Adult" : "Minor";
        System.out.println(status);
        
        int num = 15;
        String type = (num % 2 == 0) ? "Even" : "Odd";
        System.out.println(type);
        
        int x = 10, y = 5;
        int max = (x > y) ? x : y;
        System.out.println("Max: " + max);
    }
}
