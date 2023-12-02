// package Collection;

import java.util.TreeSet;
import java.util.Iterator;

public class treeSet {
    public static void main(String[] args) {
        // Create a TreeSet
        TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(8);
        treeSet.add(8);
        treeSet.add(1);
        treeSet.add(10);

        // Display the TreeSet (sorted order)
        System.out.println("TreeSet: " + treeSet);

        // Check if an element exists in the TreeSet
        System.out.println("Contains 8: " + treeSet.contains(8));

        // Remove an element from the TreeSet
        treeSet.remove(2);

        // Display the modified TreeSet
        System.out.println("Modified TreeSet: " + treeSet);

        // Iterate over the elements using an Iterator
        Iterator<Integer> iterator = treeSet.iterator();
        System.out.print("Iterating over the TreeSet: ");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Size of the TreeSet
        System.out.println("Size of the TreeSet: " + treeSet.size());

        // Clear the TreeSet
        treeSet.clear();

        // Display the final state of the TreeSet
        System.out.println("Final state of the TreeSet: " + treeSet);

    }
}
