public class Assertion {
    public static void main(String args[]){
        int i = 0;
        int sum = 0;
        for(i = 0; i < 10; i++){
            sum += i;
        }

        assert i == 10;
        assert sum > 10 && sum < 5 * 10 : "sum is " + sum;
        System.out.println("Hello");
    }
}
