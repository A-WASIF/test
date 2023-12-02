// package THREADING;

public class extending extends Thread{
    int [] array;
    int sum, high, low;
    
    public extending(int [] arr, int h, int l){
        array = arr;
        sum = 0;
        high = h;
        low = l;
    }

    @Override
    public void run(){
        for(int i = low; i < high; i++){
            sum += array[i];
        }
    }

    public int getResult() {return sum;}

    public static void main(String args[]) throws InterruptedException{
        int [] arr = {1,2,5,4,6,8,3,1,3,12};
        extending left = new extending(arr, 10, 5);
        extending right = new extending(arr, 5, 0);

        left.start();
        right.start();

        left.join();
        right.join();

        int leftSum = left.getResult();
        int rightSum = right.getResult();

        System.out.println(leftSum + rightSum);
    }
}
