class A{zz
    int a;

    public void meth2(){
        System.out.println("This is meth2 of class A");
    }
}

class B extends A{
    // having same method in different classes is called overriding 
    public void meth2(){
        System.out.println("This is meth2 of class B");
    }
}




public class methodOvrriding {
    public static void main(String args[]){
        A a = new A();

        B b = new B();

        a.meth2();
        b.meth2();
    }
}