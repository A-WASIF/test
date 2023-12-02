import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class combiningAll {
    public static void main(String args[]) throws IOException{
        Scanner in = null;
        PrintWriter out = null;

        try{
            in = new Scanner(new BufferedReader(new FileReader("input.txt")));
            out = new PrintWriter(new FileWriter("output.txt"));

            while(in.hasNext()){
                out.println(in.next());
            }
        }

        finally{
            if(in != null) in.close();
            if(out != null) out.close();
        }
    }    
}
