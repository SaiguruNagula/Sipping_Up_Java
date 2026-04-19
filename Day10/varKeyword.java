package Day10;

public class varKeyword {
    

    public static void main(String[] args) {
        var name = "Alice"; // Inferred as String
        var age = 30; // Inferred as int
        var isStudent = true; // Inferred as boolean

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Is Student: " + isStudent);
    }
   

public static void demonstrateVar() {
    var salary = 50000.50; // Inferred as double
    var count = 100L; // Inferred as long
    var message = "Java 10+"; // Inferred as String
    
    System.out.println("Salary: " + salary);
    System.out.println("Count: " + count);
    System.out.println("Message: " + message);
}
}
