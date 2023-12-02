class A {
    private int num;
    A(){
        System.out.println("This is constructor of A");
    }

    A(int p){
        System.out.println("This is 2nd constructor of A class with value: " + p);
    }
}

class B extends A{

    B(){
        super(100);
        System.out.println("This is constructor of B");
    }

    // @ Override
    B(int x, int y){
        super(y);
        System.out.println("This is 2nd constructor of B with values: " + x + " " + y);
    }
}

class C extends B {
    C(){
        System.out.println("This is constructor of C");
    }

    C(int x, int y){
        super(x + 1, y + 1);
        System.out.println("This is 2nd constructor of C with values: " + x + " " + y);
    }
}


public class superKeyword {
    public static void main(String args[]){
        // A a = new A();
        
        // B b = new B();

        C c = new C(99, 999);

    }
}
