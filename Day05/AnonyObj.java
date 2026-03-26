package Day05;

class A{
    public void display(){
        System.out.println("Hello from class A");
    }
}

public class AnonyObj {
    public static void main(String[] args) {
   new A().display(); // Anonymous object created and method called
}
}
