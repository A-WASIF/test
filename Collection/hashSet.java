// package Collection;

import java.util.HashSet;
import java.util.Iterator;

public class hashSet {
    public static void main(String[] args) {
        // Create a HashSet
        HashSet<String> hashSet = new HashSet<>();

        // Add elements to the HashSet
        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Orange");
        hashSet.add("Mango");

        // Display the HashSet
        System.out.println("HashSet: " + hashSet);

        // Check if an element exists in the HashSet
        System.out.println("Contains 'Banana': " + hashSet.contains("Banana"));

        // Remove an element from the HashSet
        hashSet.remove("Orange");

        // Display the modified HashSet
        System.out.println("Modified HashSet: " + hashSet);

        // Iterate over the elements using an Iterator
        Iterator<String> iterator = hashSet.iterator();
        System.out.print("Iterating over the HashSet: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Size of the HashSet
        System.out.println("Size of the HashSet: " + hashSet.size());

        // Clear the HashSet
        hashSet.clear();

        // Display the final state of the HashSet
        System.out.println("Final state of the HashSet: " + hashSet);
    }
}
