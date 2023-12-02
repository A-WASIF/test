// package TryExcept;

public class test10 {
    public static void main(String[] args) {
    String s = null;
    try {
       int length = s.length();
    }
    
    catch (Exception e) {
        System.out.println("Catch block -1");
    }
    catch (NullPointerException e) {
        System.out.println("Catch block -2");
    }

    }
    
}