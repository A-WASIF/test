public class varargs {
    
    static int sum(int ...arg){
        int result = 0;

        for(int i : arg) result += i;

        return result;
    }
    
    public static void main(String args[]){
        System.out.println(sum(5, 5));
        System.out.println(sum(1, 2, 3, 4, 5));
        System.out.println(sum(10, 111));
    }
    
}