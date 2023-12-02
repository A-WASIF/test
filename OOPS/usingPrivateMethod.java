class student{
    private int id;
    private String name;

    public void setName(String n){
        name = n;
    }

    public void setID(int i){
        id = i;
        
    }

    public String getName(){
        return name;
    }

    public int getID(){
        return id;
    }




    // public void info(){
    //     System.out.println("Studendt's ID is: "+ id);
    //     System.out.println("Student's Name is: "+ name);
    // }
}


public class usingPrivateMethod {
    public static void main(String args[]){

        student first = new student();

        first.setID(2022583);
        first.setName("Wasif");


        student second = new student();

        second.setID(2022456);
        second.setName("John Wick");
        
        
        
        System.out.println(first.getID());
        System.out.println(first.getName());
        
        System.out.println(second.getID());
        System.out.println(second.getName());
        
        // first.info();

    }   
}
