import java.util.Random;
import java.util.Scanner;


class square{
    private int side;
    Scanner sc = new Scanner(System.in);
    
    square(){
        
        side = sc.nextInt();
    }

    public int area(){
        return side * side;
    }

    public int perimeter(){
        return 4 * side;
    }
}

class rps{
    rps(){
        for(int i = 0; i < 5; i++){
            int user;
            int cmp;

            Scanner sc = new Scanner(System.in);

            Random rn = new Random();

            user = sc.nextInt();
            cmp = rn.nextInt(0, 3);

            if(user == cmp) System.out.printf("DRAW  CMP: %d, YOU: %d\n", cmp, user);

            else if(user == 0 && cmp == 2) System.out.printf("You won  CMP: %d, YOU: %d\n", cmp, user);
            else if(user == 1 && cmp == 0) System.out.printf("You won  CMP: %d, YOU: %d\n", cmp, user);
            else if(user == 2 && cmp == 1) System.out.printf("You won  CMP: %d, YOU: %d\n", cmp, user);
            // else if(user = 0 && cmp == 2) System.out.println();
            else System.out.printf("You lost  CMP: %d, YOU: %d\n", cmp, user);
        }
    }
    
}

class book{
    book(){
        System.out.println("This is my book");
    }

    book(String st){
        System.out.println("Author of book is: "+ st);
    }

    book(book c){
        System.out.println("This consturctor is taking object as argument");
    }
}

public class testingFile{
    public static void main(String[] args) {
        // square s = new square();

        // System.out.println(s.area());
        // System.out.println(s.perimeter());
        
        new rps();


        // book b1 = new book();
        // book b2 = new book("Mark");
        // book b3 = new book(b2);
    }
}