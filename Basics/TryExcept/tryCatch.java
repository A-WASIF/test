import java.util.Scanner;

public class tryCatch {
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Enter first value: ");
        a = sc.nextInt();

        System.out.print("Enter second value: ");
        b = sc.nextInt();

        try{
            System.out.println("Their division is: " + a / b);
        }

        catch(Exception e){
            System.out.print("Can't divide due to : ");
            System.out.println(e);
        }
    }
}
