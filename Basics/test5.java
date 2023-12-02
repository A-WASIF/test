import org.w3c.dom.DOMException;

class DivisionByZero extends Exception{
    public DivisionByZero(String message){
        super(message);
    }
}

public class test5 {
    public int divide(int a, int b) throws DivisionByZero{
        
        if(b == 0){
            throw new DivisionByZero("B is zero!");
        }
        else return a / b;
    }

    public static void main(String args[]) throws DivisionByZero{
        try{
            test5 t = new test5();
            t.divide(10, 0);
        }

        catch(DivisionByZero e){
            System.out.println(e.getMessage());
        }
    }

}
