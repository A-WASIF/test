interface Flyable {
    public void fly();
}


abstract class Duck {
    private String name;
    private Flyable flyStatus;

    public Duck(String name, Flyable flyStatus) {
        this.name = name;
        this.flyStatus = flyStatus;
    }

    public void type() {
        System.out.println("I am " + name + " Duck");
    }

    public void speak() {
        System.out.println("I quack");
    }

    public void swim() {
        System.out.println("I can swim");
    }

    public void fly() {
        flyStatus.fly();
    }

    public abstract void home();
    public void display() {
        this.type();
        this.speak();
        this.swim();
        this.fly();
        this.home();    
    }
}

class CanFly implements Flyable {
    public void fly() {
        System.out.println("I can fly!");
    }
}

class CantFly implements Flyable {
    public void fly() {
        System.out.println("I can't fly!");
    }
}

class Dabbler extends Duck {
    public Dabbler() {
        super("Dabbler", new CanFly());
    }

    public void home() {
        System.out.println("I live on Ground");
    }
}

class Wood extends Duck {
    public Wood() {
        super("Duck", new CanFly());
    }

    public void home() {
        System.out.println("I live on Trees");
    }
}

class Rubber extends Duck {
    public Rubber() {
        super("Rubber",  new CantFly());
    }

    public void home() {
        System.out.println("Your Home is MY Home!");
    }
}


public class DuckTest {
    public static void main(String args[]){
        Dabbler dabbler = new Dabbler();
        Wood wood = new Wood();
        Rubber rubber = new Rubber();
        dabbler.display();
        System.out.println();
        wood.display();
        System.out.println();
        rubber.display();
    }    
}
