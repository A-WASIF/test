class Threading1 extends Thread{

    Threading1(){
        System.out.println("This is thread 1");
    }
    @Override
    public void run(){
        int i = 0;

        while(i < 10){
            System.out.println("This is first function of Threading1");
            System.out.println("This is second function of Threading1");
            
            ++i;
        }
    }
}

class Threading2 extends Thread{

    Threading2(){
        System.out.println("This is thread 2");
    }

    @Override
    public void run(){
        int i = 0;

        while(i < 10){
            System.out.println("This is first function of Threading2");
            System.out.println("This is second function of Threading2");
            
            ++i;
        }
    }
}

public class byExtendingClass {
    public static void main(String args[]) throws InterruptedException{
        Threading1 first = new Threading1();
        Threading2 second = new Threading2();

        first.start();
        second.start();

        first.join();
        second.join();
    }
}
