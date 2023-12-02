class student{
    int id;
    String name;

    public void info(){
        System.out.println("Studendt's ID is: "+ id);
        System.out.println("Student's Name is: "+ name);
    }
}


public class OOPSintro {
    public static void main(String args[]){

        student first = new student();

        first.id = 2022583;
        first.name = "Wasif";

        student second = new student();

        second.id = 2022456;
        second.name = "John Wick";
        
        
        
        first.info();
        System.out.println();
        second.info();



    }   
}
