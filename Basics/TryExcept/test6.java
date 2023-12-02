import java.util.ArrayList;
import java.util.List;

class Person implements Cloneable {
    private String name;
    private List<String> hobbies;

    public Person(String name, List<String> hobbies) {
        this.name = name;
        this.hobbies = hobbies;
    }

    public String getName() {
        return name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    // Shallow copy
    public Object cloneShallow() throws CloneNotSupportedException {
        return super.clone();
    }

    // Deep copy
    public Object cloneDeep() {
        try {
            // Create a shallow copy of the person
            Person clone = (Person) super.clone();
            
            // Create a new list for hobbies and copy the elements
            clone.hobbies = new ArrayList<>(hobbies);

            return clone;
        } catch (CloneNotSupportedException e) {
            // Should not happen since Person implements Cloneable
            throw new AssertionError();
        }
    }
}

public class test6 {
    public static void main(String[] args) {
        // Create a Person object
        List<String> hobbies = new ArrayList<>();
        hobbies.add("Reading");
        hobbies.add("Traveling");
        Person originalPerson = new Person("Alice", hobbies);

        try {
            // Shallow copy
            Person shallowCopy = (Person) originalPerson.cloneShallow();
            shallowCopy.getHobbies().add("Cooking"); // Modify hobbies in the shallow copy

            // Deep copy
            Person deepCopy = (Person) originalPerson.cloneDeep();
            deepCopy.getHobbies().add("Painting"); // Modify hobbies in the deep copy

            // Print the original and copied objects
            System.out.println("Original Person: " + originalPerson.getName() + ", Hobbies: " + originalPerson.getHobbies());
            System.out.println("Shallow Copy: " + shallowCopy.getName() + ", Hobbies: " + shallowCopy.getHobbies());
            System.out.println("Deep Copy: " + deepCopy.getName() + ", Hobbies: " + deepCopy.getHobbies());
        } 
        catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
