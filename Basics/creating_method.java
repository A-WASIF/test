public class creating_method {
    int operation(int x, int y){
        if(x > y) return x + y;

        else return (x + y) * 5;
    }

    static int secondOperation(int x, int y){
        if(x > y) return x + y;

        else return (x + y) * 5;
    }


    public static void main(String args[]){
    // Without using static in methods
    
        int a = 5;
        int b = 10;

        int a1 = 12;
        int b1 = 5;

        creating_method ope = new creating_method();

        int c = ope.operation(a, b);
        int c1 = ope.operation(a1, b1);

        System.out.println("c1 and c2 are: " + c + " " + c1);


    // Wtih using static in methods

        int a2 = 4;
        int b2 = 8;

        int c2 = secondOperation(a2, b2);

        System.out.println(c2);
    }
    
}
