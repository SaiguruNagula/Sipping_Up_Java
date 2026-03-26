package Day04;

public class static1 {
    static int count = 0; // static variable
    static String company = "TechCorp"; // static variable

    static { // static block
        System.out.println("Static block executed");
        count = 10;
    }

    public static void displayInfo() { // static method
        System.out.println("Company: " + company);
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        static1.displayInfo();
        static1.count = 20;
        static1.displayInfo();
        
        static1 obj1 = new static1();
        static1 obj2 = new static1();
        obj1.displayInfo();
        obj2.displayInfo();
    }
}
