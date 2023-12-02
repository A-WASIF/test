import java.util.ArrayList;

public class wildcard {
    public static void print(ArrayList<?>list){
        for(Object o: list){
            System.out.println(o);
        }
    }
    public static void main(String[] arg){
        ArrayList<Integer> I = new
        ArrayList<Integer>();
     
        I.add(1);
        I.add(2);
     
        ArrayList<String> S = new
        ArrayList<String>();
     
        S.add("Bob");
        S.add("Paul");
     
        print(I);
        print(S);
    }
}
