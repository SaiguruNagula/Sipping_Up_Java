package Day07;
abstract class A{
    public abstract void show();
}   

public class AbstractAnonymus {
    public static void main(String[] args) {
        A obj = new A() {
            @Override
            public void show() {
                System.out.println("Anonymous class implementation of abstract method");
            }
        };
        obj.show();
    }
}
