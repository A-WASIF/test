// package TryExcept;

import java.util.ArrayList;

class myclass <T>{
    private ArrayList<T> list;
    myclass(){
        list = new ArrayList<T>();
    }

    public void add(T o){
        list.add(o);
    }

    public void print(ArrayList <T> list){
        for(T o : list){
            System.out.println(o);
        }
    }
}

public class test4 {
    public static void print(ArrayList <?> list){
        for(Object o : list){
            System.out.println(o);
        }
    }
    public static void main(String args[]){
        ArrayList<Integer> I = new ArrayList<Integer>();
        I.add(10);
        I.add(20);

        ArrayList<String> S = new ArrayList<String>();
        S.add("Hello");
        S.add("World");

        print(I);
        print(S);

        // myclass<Integer> m = new myclass<Integer>();
        // m.add(10);
        // m.add(15);
        // m.add(20);

        // m.print(m);

    }
}
