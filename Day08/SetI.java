package Day08;

public class SetI {
    public static void main(String[] args) {
        // Using HashSet
        java.util.Set<Integer> set = new java.util.HashSet<>();
        
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(10); // Duplicate, won't be added
        
        System.out.println("Set: " + set);
        System.out.println("Size: " + set.size());
        System.out.println("Contains 20: " + set.contains(20));
        
        set.remove(20);
        System.out.println("After remove: " + set);
        
        // Iterate through set
        for (Integer num : set) {
            System.out.println(num);
        }
    }
}
