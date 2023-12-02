// package TryExcept;
import java.io.FileNotFoundException;
import java.io.*;

public class test9 {
    private int countChars(String fileName) throws FileNotFoundException, IOException {
        FileReader r = new FileReader(fileName);
        int total = 0;
        while( r.ready() ) {
            r.read();
           total++;
       }
       r.close();
       return total;
    }
    
    public static void main(String args[]){
        test9 t = new test9();
        try{
            int count = t.countChars("hello.java");
            System.out.println(count);
            
        }

        catch(IOException e){
            e.getMessage();
        }
    }
}
