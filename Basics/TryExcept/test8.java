// package TryExcept;

public class test8 {
    public static void main(String[] args) {
        try {
            // Simulate a situation where an arithmetic exception is thrown
            int result = divide(10, 0);
        }
        
        catch (ArithmeticException e) {
            System.out.println("Caught arithmetic exception: " + e.getMessage());
        }  
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is allowed.");
        }
        return a / b;
    }
}
