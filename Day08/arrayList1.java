import java.util.ArrayList;
import java.util.List;

package Day08;

public class arrayList1 {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("Initial list: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removal: " + fruits);

        fruits.add(1, "Blueberry");
        System.out.println("After insertion: " + fruits);

        System.out.println("Iterating:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        System.out.println("Size: " + fruits.size());
    }
}
