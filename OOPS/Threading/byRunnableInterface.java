class Threading1 implements Runnable{
    @ Override
    public void run(){
        int i = 0;

        while(true){
            System.out.println("This is threading 1");
            i++;
        }
    }
}

class threading2 implements Runnable{
    public void run(){
        while(true){
            System.out.println("This is threading 2");
        }
    }
}

public class byRunnableInterface {
    public static void main(String args[]){
        Threading1 t1 = new Threading1();
        Thread T1 = new Thread(t1);

        threading2 t2 = new threading2();
        Thread T2 = new Thread(t2);

        T2.start();
        T1.start();
    }   
}
