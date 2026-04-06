package Day06;

public class abstractKey {
    abstract class Shape {
        abstract void draw();
    }

    class Circle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a Circle");
        }
    }

    class Rectangle extends Shape {
        @Override
        void draw() {
            System.out.println("Drawing a Rectangle");
        }
    }

    public static void main(String[] args) {
        abstractKey obj = new abstractKey();
        Shape circle = obj.new Circle();
        Shape rectangle = obj.new Rectangle();

        circle.draw();      // Output: Drawing a Circle
        rectangle.draw();   // Output: Drawing a Rectangle
    }
    
}
