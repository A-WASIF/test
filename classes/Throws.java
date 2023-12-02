class NoWaterException extends Exception {
    public NoWaterException(String message) {
        super(message);
    }
}

public class Throws {
    public void drinkWater() {
        try {
            getWater();
        }
        catch(NoWaterException e) {
            System.out.println(e.getMessage());
        }
        }
        public void getWater() throws NoWaterException {
            Object _wendy;
            Object _water = null;
            if(_water == null) {
                throw new NoWaterException("NO Water");
            }
    }

    public static void main(String args[]){
        Throws th = new Throws();
        th.drinkWater();

        System.out.println("Program ends");
    }
    
}
