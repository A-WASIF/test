
class thr extends Thread{
    public thr(String name){
        super(name);       
    }

    public void run(){
        while(true){
            System.out.println("This is a thread " + getName());

        }
    }
}


public class threadingPriority {
    public static void main(String args[]){
        thr t1 = new thr("Wasif");
        thr t2 = new thr("Jhon");
        thr t3 = new thr("Brock");
        thr t4 = new thr("Pablo Escobar");

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t4.setPriority(Thread.MAX_PRIORITY);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        // System.out.println(t1.threadId());
        // System.out.println(t2.threadId());
        // System.out.println(t3.threadId());
        // System.out.println(t4.threadId());
    }
}
