import java.util.Random;
import java.util.Scanner;

class generate{

    int RandomNum(){
        Random rand = new Random();

        int number = rand.nextInt(1, 101);

        return  number;
    }
}


public class numberGuess{
    static int getUserinput(){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();

        return num;
    }

    static boolean isCorrect(int x, int y){
        if(x == y){
            return true;
        }

        else{
            return false;
        }
    }

    public static void main(String args[]){

        generate gen = new generate();

        int target = gen.RandomNum();
        // System.out.println("target is: "+ target);

        System.out.print("Guess a Number between 1 - 100 BOTH INCLUDING: ");
        int guessed = getUserinput();

        int score = 100;


        while(!isCorrect(target, guessed)){
            if(target > guessed){
                System.out.println("Number to be Guessed is Bigger");
            }

            else{
                System.out.println("Number to be Guessed is Smaller");
            }

            System.out.print("Guess again: ");
            guessed = getUserinput();

            --score;
        }

        System.out.println("WOOHOOO! YOUR SCORE IS: "+ score + " / 100");
    }
}