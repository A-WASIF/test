import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class executors implements Runnable {
    int [] array;
    int sum, high, low;

    public executors(int [] arr, int l, int h){
        array = arr; high = h; low = l; sum = 0;
    }

    public void run(){
        for(int i = low; i < high; i++){
            sum += array[i];
        }
    }

    public int Result() {
        return sum;
    }

    public static void main(String args[]) throws InterruptedException{
        int [] arr = {1,2,5,4,6,8,3,1,3,12};
        executors left = new executors(arr, 0, 5);
        executors right = new executors(arr, 5, 10);

        ExecutorService exec = Executors.newFixedThreadPool(2);
        exec.execute(right);
        exec.execute(left);

        if(!exec.isTerminated()){
            exec.shutdown();
            exec.awaitTermination(5L, TimeUnit.SECONDS);
        }

        int result = left.Result() + right.Result();
        System.out.println(result);
    }
}
