package Day04;

public class variableinstancelocal {
    // Instance variables are declared outside methods and belong to the object.
    // They are accessible throughout the class.
    int instanceVar = 10;

    public void exampleMethod() {
        // Local variables are declared inside methods and only exist within that method.
        // They are not accessible outside the method.
        int localVar = 20;
        System.out.println("Instance variable: " + instanceVar);
        System.out.println("Local variable: " + localVar);
    }

    public static void main(String[] args) {
        variableinstancelocal obj = new variableinstancelocal();
        obj.exampleMethod();
    }
}
