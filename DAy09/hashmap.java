package DAy09;

public class hashmap {
    public static void main(String[] args) {
        java.util.HashMap<String, Integer> map = new java.util.HashMap<>();
        
        // Add elements
        map.put("Apple", 5);
        map.put("Banana", 3);
        map.put("Orange", 7);
        
        // Access elements
        System.out.println("Apple: " + map.get("Apple"));
        
        // Check if key exists
        if (map.containsKey("Banana")) {
            System.out.println("Banana exists");
        }
        
        // Iterate through map
        for (String key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }
        
        // Remove element
        map.remove("Orange");
        
        // Print size
        System.out.println("Size: " + map.size());
    }
}
