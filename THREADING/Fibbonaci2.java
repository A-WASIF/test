import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

public class Fibbonaci2  extends RecursiveTask<Integer> {
    int result, n;

    public Fibbonaci2(int n) {
        this.n = n;
    }

    public Integer compute() {
        if(n < 2) {
            return n;
        }

        Fibbonaci2 left = new Fibbonaci2(n - 1);
        Fibbonaci2 right = new Fibbonaci2(n - 2);

        left.fork();

        return left.join() + right.compute();
    }



    public static void main(String args[]){
        ForkJoinPool pool = new ForkJoinPool(2);
        Fibbonaci2 task = new Fibbonaci2(40);
        int result = pool.invoke(task);
        System.out.println(result);
    }
}
