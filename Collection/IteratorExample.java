// package Collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorExample {
    public static void main(String args[]){
        Collection list = new ArrayList<>();
        for(int i = 0; i < 10; i++){
            list.add(i);
        }

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
