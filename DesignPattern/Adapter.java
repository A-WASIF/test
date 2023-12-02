import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


interface Moveable {
    public void move();
}

class Car implements Moveable {
    public void move() {
        System.out.println("Car is moving!");
    }
}

class Bike implements Moveable {
    public void move() {
        System.out.println("Bike is moving!");
    }
}

interface Flyable {
    public void fly();
}

class Airplane implements Flyable {
    public void fly() {
        System.out.println("Airplane is flying!");
    }
}

class Drone implements Flyable {
    public void fly() {
        System.out.println("Drone is flying!");
    }
}

class adapterClass implements Moveable {
    Flyable type;
    public adapterClass(Flyable type) {
        this.type = type;
    }

    public void move() {
        type.fly();
    }
}

public class Adapter {
    public static void main(String args[]){
        List<Moveable> list = new ArrayList<Moveable>();
        list.add(new Car());
        list.add(new Bike());
    
        list.add(new adapterClass(new Airplane()));
        list.add(new adapterClass(new Drone()));

        Iterator<Moveable> ite = list.iterator();

        while(ite.hasNext()){
            System.out.println(ite.next());
        }
    }
}
