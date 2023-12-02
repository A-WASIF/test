public class implementing implements Runnable {
    int [] array;
    int sum, high, low;
    public implementing(int [] arr, int h, int l){
        array = arr;
        sum = 0;
        high = h;
        low = l;
    }

    public void run(){
        for(int i = low; i < high; i++){
            sum += array[i];
        }
    }

    public int getResult() {return sum;}

    public static void main(String args[]) throws InterruptedException{
        int [] arr = {1,2,5,4,6,8,3,1,3,12};
        implementing left = new implementing(arr, 10, 5);
        implementing right = new implementing(arr, 5, 0);

        Thread t1 = new Thread(left);
        Thread t2 = new Thread(right);
        t1.start();
        t2.start();

        t1.join();
        t2.join();

        int leftSum = left.getResult();
        int rightSum = right.getResult();

        System.out.println(leftSum + rightSum);
        // System.out.println();
    }
}
