import java.util.concurrent.*;

public class Search extends RecursiveTask<Integer> {
    private static final int THRESHOLD = 5; // Adjust the threshold as needed
    private int[] array;
    private int start;
    private int end;
    private int searchItem;
    private ForkJoinPool pool;

    public Search(int[] array, int start, int end, int searchItem, ForkJoinPool pool) {
        this.array = array;
        this.start = start;
        this.end = end;
        this.searchItem = searchItem;
        this.pool = pool;
    }

    private boolean searchItemIsFound() {
        // Implement your search logic here
        for (int i = start; i < end; i++) {
            if (array[i] == searchItem) {
                return true;
            }
        }
        return false;
    }

    protected Integer compute() {
        if ((end - start) <= THRESHOLD) {
            return sequentialSearch();
        } else {
            int mid = (start + end) / 2;

            Search left = new Search(array, start, mid, searchItem, pool);
            Search right = new Search(array, mid, end, searchItem, pool);

            left.fork();
            int rightResult = right.compute();
            int leftResult = left.join();

            return rightResult + leftResult;
        }
    }

    private int sequentialSearch() {
        int count = 0;
        for (int i = start; i < end; i++) {
            if (array[i] == searchItem) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        ForkJoinPool pool = new ForkJoinPool(2);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 7, 10};
        Search task = new Search(arr, 0, arr.length, 7, pool);

        try {
            int result = pool.invoke(task);
            System.out.println("Number of occurrences: " + result);
        } catch (CancellationException e) {
            System.out.println("Goal is found, pool aborted");
        }
    }
}
