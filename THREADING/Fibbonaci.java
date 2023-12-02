import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

// by recursiceAction

public class Fibbonaci extends RecursiveAction{
    int result, n;

    public Fibbonaci(int n) {
        this.n = n;
    }

    public void compute() {
        if(n < 2) {
            result = n;
            return;
        }

        Fibbonaci left = new Fibbonaci(n - 1);
        Fibbonaci right = new Fibbonaci(n - 2);

        left.fork();
        right.compute();
        left.join();

        result = left.result + right.result;
    }

    public static void main(String args[]){
        try (ForkJoinPool pool = new ForkJoinPool(10)) {
            Fibbonaci task = new Fibbonaci(40);
            pool.invoke(task);
            int result = task.result;
            System.out.println(result);
        }
    }

}
