// package Q1;

interface Rotatable{
    public void rotate();
}

interface RotateAndFly extends Rotatable{
    public void fly();
}

class Rotator implements Rotatable{

    @Override
    public void rotate() {
        System.out.println("I am Rotating in Rotator class!");
    }
}

class Flyer implements RotateAndFly{

    @Override
    public void rotate() {
        System.out.println("I am rotating in flyer class!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying in flyer class!");
    }
    
}

class Helicopter implements RotateAndFly{

    @Override
    public void rotate() {
        System.out.println("I am rotating in helicopter class!");
    }

    @Override
    public void fly() {
        System.out.println("I am flying in helicopter class!");
    }
    
    public void drive(Rotatable r){
        r.rotate();
    }
}

public class test11 {
    public static void main(String args[]){
        Helicopter h = new Helicopter();
        Rotator r = new Rotator();
        Flyer f = new Flyer();

        h.drive(r);
        h.drive(f);
        h.drive(h);
    }
}
