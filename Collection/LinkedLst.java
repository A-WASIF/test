// package Collection;

import java.util.LinkedList;

public class LinkedLst {
    public static void main(String[] args) {
        // Create a linked list
        LinkedList<String> linkedList = new LinkedList<>();

        // Add elements to the linked list
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Mango");

        // Display the linked list
        System.out.println("Linked List: " + linkedList);

        // Add elements at specific positions
        linkedList.add(2, "Grapes");
        linkedList.addFirst("Strawberry");
        linkedList.addLast("Pineapple");

        // Display the modified linked list
        System.out.println("Modified Linked List: " + linkedList);

        // Remove elements
        linkedList.remove("Banana");
        linkedList.removeFirst();
        linkedList.removeLast();

        // Display the final linked list
        System.out.println("Final Linked List: " + linkedList);
    }
}
