package Day08;

@FunctionalInterface              // give compile time error if more than one abstract method is present
interface MyFunctionalInterface {
    void myMethod();
}

public class functionalInterface {
    
     public static void main(String[] args){

        MyFunctionalInterface obj = new MyFunctionalInterface() {   // annonymus class implementation of functional interface
            @Override
            public void myMethod() {
                System.out.println("Implementation of myMethod in anonymous class");
            }
        };

        obj.myMethod(); // object of annonymus class
     }

}
