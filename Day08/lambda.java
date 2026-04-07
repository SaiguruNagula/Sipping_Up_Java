package Day08;

@FunctionalInterface
interface LambdaInterface{
    void display();
}

@FunctionalInterface
interface LambdaInterfaceWithParams{    
    void greet(String name);
}

@FunctionalInterface
interface MyFunctionalInterfaceWithReturn{
    int add(int i , int j);
}

public class lambda {
   public static void main(String[] args) {
        LambdaInterface obj = () -> System.out.println("Hello, this is a lambda expression!"); // lambda expression implementation of functional interface
        obj.display(); // calling the method of functional interface

        // using lambda expression with parameters
        LambdaInterfaceWithParams obj2 = (name) -> System.out.println("Hello, " + name + "! This is a lambda expression with parameters!"); // lambda expression with parameters
        obj2.greet("Alice"); // calling the method of functional interface with parameters

        // returning a value from lambda expression
        MyFunctionalInterfaceWithReturn obj3 = (i , j) -> i+j;
        int result = obj3.add(5, 10);
        System.out.println("Result: " + result);

    }  

    
  

}
