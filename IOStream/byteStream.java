import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class byteStream {
    public static void main(String args[]) throws IOException {
        FileInputStream in = null;
        FileOutputStream out = null;

        try{
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");

            int fd;

            while((fd = in.read()) != -1){
                out.write(fd);
            }
        }

        finally{
            if(in != null) in.close();
            if(out != null) out.close();
        }
    }
}