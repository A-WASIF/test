// package Collection;

import java.util.HashMap;
import java.util.Map;

import javax.swing.text.html.HTMLDocument.Iterator;

public class hashMap {
    public static void main(String[] args) {
        // Creating a HashMap
        Map<String, Integer> hashMap = new HashMap<>();

        // Adding key-value pairs to the HashMap
        hashMap.put("One", 1);
        hashMap.put("Two", 2);
        hashMap.put("Three", 3);

        // Lamda function usage
        hashMap.forEach((k, v) -> {
            System.out.println(k + " " + v);
        });

        // Accessing values using keys
        System.out.println("Value corresponding to key 'Two': " + hashMap.get("Two"));

        // Iterating over the HashMap
        System.out.println("Iterating over the HashMap:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

        // Checking if a key exists
        String keyToCheck = "Four";
        if (hashMap.containsKey(keyToCheck)) {
            System.out.println("Key '" + keyToCheck + "' exists in the HashMap.");
        } else {
            System.out.println("Key '" + keyToCheck + "' does not exist in the HashMap.");
        }

        // Checking if a value exists
        int valueToCheck = 3;
        if (hashMap.containsValue(valueToCheck)) {
            System.out.println("Value '" + valueToCheck + "' exists in the HashMap.");
        } else {
            System.out.println("Value '" + valueToCheck + "' does not exist in the HashMap.");
        }
    }
}
