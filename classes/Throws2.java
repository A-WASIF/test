class NoWaterException extends Exception {
    public NoWaterException(String message) {
        super(message);
    
    }
}

public class Throws2 {
    public void drinkWater() throws NoWaterException{
        getWater();
    }

    public void getWater() throws NoWaterException {
        Object _wendy;
        Object _water = null;
        if(_water == null) {
            throw new NoWaterException("NO Water");
        }
    }

    public static void main(String args[]) throws NoWaterException{
        try{
            Throws2 th = new Throws2();
            th.drinkWater();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
