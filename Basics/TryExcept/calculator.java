import java.util.Scanner;

public class calculator {
    public static void main(String args[]){
        System.out.println("Welcome to the Calculator !!!");

        boolean flag = true;

        Scanner sc = new Scanner(System.in);

        
        while(flag){
            System.out.print("Press 1 for addition, 2 for substraction, 3 for multiplication, 4 for division and 0 for exit : ");

            int ope = sc.nextInt();

            try{

                if(ope == 1){
                    try{
                        System.out.print("Enter first number : ");
                        int a = sc.nextInt();
                        System.out.print("Enter second number : ");
                        int b = sc.nextInt();
                    
                        System.out.println("Their addition is : " + (a + b));
                    }

                    catch(Exception e){
                        System.out.print("Their is an error :");
                        System.out.println(e);
                    }
                }
                    
                else if(ope == 2){
                    try{
                        System.out.print("Enter first number : ");
                        int a = sc.nextInt();
                        System.out.print("Enter second number : ");
                        int b = sc.nextInt();
                        
                        System.out.println("Their substraction is : " + (a - b));
                    }

                    catch(Exception e){
                        System.out.print("Their is an error :");
                        System.out.println(e);
                    }
                }

                else if(ope == 3){
                    try{
                        System.out.print("Enter first number : ");
                        int a = sc.nextInt();
                        System.out.print("Enter second number : ");
                        int b = sc.nextInt();
                    
                        System.out.println("Their multiplication is : " + (a * b));
                    }

                    catch(Exception e){
                        System.out.print("Their is an error :");
                        System.out.println(e);
                    }
                }

                else if(ope == 4){
                    try{
                        System.out.print("Enter first number : ");
                        int a = sc.nextInt();
                        System.out.print("Enter second number : ");
                        int b = sc.nextInt();
                        
                        System.out.println("Their division is : " + (a / b));
                    }

                    catch(Exception e){
                        System.out.print("Their is an error :");
                        System.out.println(e);
                    }
                }

                else if(ope == 0) flag = false;

                else{
                    System.out.println("Improper input");
                }
            }

            catch(Exception e){
                System.out.println("An error occurred");
            }
        }
    }
}