package DAy09;

public class VectorC {
    

public static void main(String[] args) {
    java.util.Vector<Integer> vector = new java.util.Vector<>();
    
    // Add elements
    vector.add(10);
    vector.add(20);
    vector.add(30);
    
    // Display elements
    System.out.println("Vector: " + vector);
    
    // Access element
    System.out.println("Element at index 0: " + vector.get(0));
    
    // Remove element
    vector.remove(1);
    System.out.println("After removal: " + vector);
    
    // Size
    System.out.println("Size: " + vector.size());
}
}