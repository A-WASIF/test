import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Buffer {
    public static void main(String args[]) throws IOException{
        BufferedReader in = null;
        PrintWriter out = null;

        try{
            in = new BufferedReader(new FileReader("input.txt"));
            out = new PrintWriter(new FileWriter("output.txt"));

            String l;

            while((l = in.readLine()) != null){
                out.println(l);
            }
        }

        finally{
            if(in != null) in.close();
            if(out != null) out.close();
        }
    }    
}
