import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Manager implements Serializable {
    private String name;
    public Manager(String n) {
        this.name = n;
    }
}

class client {
    public static void serialize() throws IOException{
        ObjectOutputStream obj = null;
        Manager m = new Manager("Orton");
        try{
            obj = new ObjectOutputStream(new FileOutputStream("out.txt"));
            obj.writeObject(m);
        }

        finally{
            obj.close();
        }
    }

    public static void desirialize() throws IOException, ClassNotFoundException {
        ObjectInputStream obj = null;

        try{
            obj = new ObjectInputStream(new FileInputStream("out.txt"));
            Manager m = (Manager) obj.readObject();
        }
        
        finally{
            obj.close();
        }
    }
}

public class SerializationDesirialization {
    public static void main(String args[]) throws IOException, ClassNotFoundException{
        client c = new client();
        c.serialize();
        c.desirialize();
    }
}
