// package TryExcept;

import java.util.InputMismatchException;
import java.util.Scanner;

public class test7 {
    public static void main(String[] args) {
        boolean done = false;
        while(!done) {
            System.out.println("Enter Integer Input");
            try {
                Scanner sc = new Scanner(System.in);
                int num = sc.nextInt(); //exception
                done = true;
            }
            catch(InputMismatchException inp) {
                inp.printStackTrace();
                System.out.println(inp.getMessage());
                System.out.println("Wrong input");
                System.out.println("Try again");
            }
            finally {
                System.out.println("Always execute");
            }
        }
    }
}
