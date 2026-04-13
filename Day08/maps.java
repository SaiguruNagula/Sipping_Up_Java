package Day08;

public class maps {
    /**
     * Demonstrates the basic usage of HashMap in Java.
     * 
     * This method showcases fundamental HashMap operations including:
     * - Adding key-value pairs using put()
     * - Retrieving values by key using get()
     * - Iterating through all entries using entrySet()
     * - Removing entries using remove()
     * - Checking key existence using containsKey()
     * 
     * The example uses a HashMap to store fruit names (String keys) and their 
     * quantities (Integer values), performing common map operations.
     * 
     * @param args Command line arguments (not used in this example)
     * 
     * Output:
     * - Prints the count of apples
     * - Displays all fruits and their quantities
     * - Confirms the existence of apples after removal of bananas
     */
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
