class thr extends Thread{
    public thr(String name){
        super(name);
    }

    public void run(){
        int i = 0;

        while(i < 10){
            System.out.println("Threading " + i);
            i++;
        }
    }

}

public class constructor {
    public static void main(String args[]){
        thr t = new thr("FirstEverThreadConstructor");
        thr t1 = new thr("SecondEverThreadConstructor");

        t.start();
        t1.start();

        System.out.println("The id of first thread is: " + t.threadId());
        System.out.println("The name of first thread is: " + t.getName());
        
        System.out.println("The id of second thread is: " + t1.threadId());
        System.out.println("The name of second thread is: " + t1.getName());
    }
}
