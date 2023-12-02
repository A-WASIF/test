import java.util.ArrayList;
import java.util.List;

class MyGenericList <T>{
    private ArrayList <T> mylist;

    public MyGenericList(){
        mylist = new ArrayList<T>();
    }

    public void add(T o){
        mylist.add(o);
    }

    public T get(int i){
        return mylist.get(i);
    }

}

class Pair <T1, T2>{
    private T1 Name;
    private T2 Age;

    public Pair(T1 a, T2 b){
        this.Name = a;
        this.Age = b;
    }

    public T2 getAge(){
        return Age;
    }

    public T1 getName(){
        return Name;
    }
}

public class GenericLists{
    public static void main(String args[]){
        MyGenericList<String> str = new MyGenericList<String>();
        MyGenericList<Integer> intl = new MyGenericList<Integer>();

        str.add("Hello");
        str.add("World!");

        intl.add(29);
        intl.add(21);

        // System.out.println(intl.get(1));
        // System.out.println(str.get(0));
        // *******************************************

        MyGenericList<Pair<String, Integer>> p1 = new MyGenericList<Pair<String, Integer>>();

        p1.add(new Pair<String, Integer>("Wasif", 19));

        System.out.println(p1.get(0).getName() + " " + p1.get(0).getAge());
    
        List<String> arr = new ArrayList<>();
    }

}
