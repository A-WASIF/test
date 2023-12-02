// package TryExcept;

class hello{
    public hello(){
        System.out.println("This is hello class");
    }
}

abstract class A{
    public void one(){
        System.out.println("I am one");
    }

    protected abstract void two();
}

class B extends A{
    public void three(){
        System.out.println("I am three");
    }

    @Override
    public void two(){
        System.out.println("I am two");
    }
}

interface inter{
    private void four(){};
    private void five(){};
} 

class C implements inter{
    public void four(){
        System.out.println("I am four");
    }

    public void five(){
        System.out.println("I am five");
    }
}

public class test5 {
    public static void main(String args[]){
        // System.out.println("This is main class");
        // new hello();
        B b = new B();
        b.three();
        b.two();

        System.out.println("\n");

        C c = new C();
        c.four();
    }    

}
