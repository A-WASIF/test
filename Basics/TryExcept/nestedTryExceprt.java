import java.util.Scanner;

public class nestedTryExceprt {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       
       System.out.print("Enter value of a: ");
       int a = sc.nextInt();

        System.out.print("Enter value of b: ");
       int b = sc.nextInt();

       try{
        int c = a / b;
        System.out.println("Value of c = a / b :" + c);

        System.out.print("Enter value of d: ");
        int d = sc.nextInt();

        try{
            System.out.println("Division c / d : " + c / d);
        }

        catch(Exception e){
            System.out.println("Wrong input");
            System.out.println(e);
        }

        }
       
       catch(Exception e){
        System.out.println("Wrong input");
        System.out.println(e);
       }
    }
}
