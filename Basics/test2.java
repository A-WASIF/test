interface typable{
    public void type();
}

class lap implements typable{
    public void type(){
        System.out.println("This is Typing");
    }

    public void say(){
        System.out.println("Hello");
    }
}


public class test2 {
    public static void main(String args[]){
        typable lp = new lap();
        lp.type();
    }
}
