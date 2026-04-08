package Day08;

public class collectionApi {
    public static void main(String[] args) {
        // Collection Framework - Key Interfaces and Classes
        
        // List - ordered, allows duplicates
        java.util.List<String> list = new java.util.ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple"); // duplicates allowed
        
        // Set - unordered, no duplicates
        java.util.Set<String> set = new java.util.HashSet<>();
        set.add("Apple");
        set.add("Banana");
        // set.add("Apple"); would not add duplicate
        
        // Map - key-value pairs
        java.util.Map<Integer, String> map = new java.util.HashMap<>();
        map.put(1, "One");
        map.put(2, "Two");
        
        // Queue - FIFO order
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();
        queue.add(10);
        queue.add(20);
        
        System.out.println("List: " + list);
        System.out.println("Set: " + set);
        System.out.println("Map: " + map);
        System.out.println("Queue: " + queue);
    }
}
