package Day08;

public class maps {
    public static void main(String[] args) {
        // Example usage of HashMap
        java.util.Map<String, Integer> map = new java.util.HashMap<>();
        
        // Put elements
        map.put("Apple", 5);
        map.put("Banana", 3);
        map.put("Orange", 7);
        
        // Get elements
        System.out.println("Apple count: " + map.get("Apple"));
        
        // Iterate through map
        for (java.util.Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Remove element
        map.remove("Banana");
        
        // Check if key exists
        if (map.containsKey("Apple")) {
            System.out.println("Apple exists in map");
        }
    }
}
