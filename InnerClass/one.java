// package InnerClass;

public class one {
    private print reference;
    
    private class print{
        private print() {
            System.out.println("Hello world!");
        }
    }

    public static void main(String args[]){
        one o = new one();
        one.print p = o.new print();
    }
}
