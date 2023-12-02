// package DesignPattern;

import java.util.HashMap;
import java.util.Map;

public class Flyweight {
    private static Map<Integer, Flyweight> instance = new HashMap<Integer, Flyweight>();
    private Integer key;

    private Flyweight(int k) {
        this.key = k;
    }

    public static Flyweight getInstance (int key) {
        if(!instance.containsKey(key)) {
            instance.put(key, new Flyweight(key));
        }
        return instance.get(key);
    }

    @Override
    public String toString() {
        return "FlyWeight is key : " + key;
    }

    public static void main(String args[]){
        Flyweight instance1 = Flyweight.getInstance(5);
        Flyweight instance2 = Flyweight.getInstance(45);
        Flyweight instance3 = Flyweight.getInstance(64);

        Flyweight retrive1 = Flyweight.getInstance(5);
        Flyweight retrive2 = Flyweight.getInstance(45);
        Flyweight retrive3 = Flyweight.getInstance(64);
    
        System.out.println(instance1 == retrive1);
        System.out.println(instance2 == retrive2);
        System.out.println(instance3 == retrive3);

        for(Map.Entry<Integer, Flyweight> entry : instance.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
