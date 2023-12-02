class base{
    private int x;

    public void setX(int num){
        x = num;
    }

    public int getX(){
        return x;
    }
}

// extendingBase class can use base things also by using extends keyword but base can't use extendingBase things
class extendingBase extends base{
    private int y;

    public void setY(int num){
        y = num;
    }

    public int getY(){
        return y;
    }

}





public class Inheritance {

    public static void main(String args[]){
        extendingBase number = new extendingBase();

        number.setX(25);

        base newNum = new base();
        newNum.setX(100);


        System.out.println(number.getX());
        System.out.println(newNum.getX());
    }    
}
