package Day06;

/**
 * AccessMod class demonstrates Java access modifiers and their visibility scopes.
 * 
 * This class illustrates the four access modifiers available in Java:
 * - public: accessible from anywhere
 * - private: accessible only within the same class
 * - protected: accessible within the same package and subclasses
 * - default (package-private): accessible only within the same package
 * 
 * Use Cases:
 * - Use publicVar and publicMethod() when you want to expose functionality as part of the class's public API
 * - Use privateVar and privateMethod() to hide internal implementation details and prevent external modification
 * - Use protectedVar and protectedMethod() when you want to allow subclasses to access and override methods
 * - Use defaultVar and defaultMethod() for internal package-level communication between related classes
 * 
 * @author Developer
 * @version 1.0
 */
public class AccessMod {
    public int publicVar;
    private int privateVar;
    protected int protectedVar;
    int defaultVar; // package-private

    public void publicMethod() {
        System.out.println("Public method");
    }

    private void privateMethod() {
        System.out.println("Private method");
    }

    protected void protectedMethod() {
        System.out.println("Protected method");
    }

    void defaultMethod() {
        System.out.println("Default method");
    }
}
