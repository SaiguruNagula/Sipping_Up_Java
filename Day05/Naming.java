package Day05;

// class name should be PascalCase
public class Naming {
    // instance variables use camelCase
    private int age;
    private String firstName;

    // constants use UPPER_SNAKE_CASE
    private static final int MAX_ATTEMPTS = 5;

    // constructor uses class name
    public Naming(int age, String firstName) {
        this.age = age;
        this.firstName = firstName;
    }

    // method names use camelCase
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void printInfo() {
        System.out.println("Name: " + firstName + ", age: " + age);
    }

    // entry point
    public static void main(String[] args) {
        Naming person = new Naming(25, "Alice");
        person.printInfo();
        System.out.println("Max attempts: " + MAX_ATTEMPTS);
    }
}
