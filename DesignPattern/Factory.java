interface shape {
    public void draw();
}

class rectangle implements shape {
    public void draw() {
        System.out.println("This is a rectangle!");
    }
}

class triangle implements shape {
    public void draw() {
        System.out.println("This is a triangle!");
    }
}

class ShapeFactory {
    public shape getShape(String shapeType) {
        if(shapeType == null) {
            return null;
        }
        else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new rectangle();
        }
        else if(shapeType.equalsIgnoreCase("TRIANGLE")){
            return new triangle();
        };
        return null;
    }
}

public class Factory {
    public static void main(String args[]){
        ShapeFactory shapeFactory = new ShapeFactory();
        try{
            shape shape1 = shapeFactory.getShape("triangle");
            shape1.draw();
        }
        catch(Exception e) {
            System.out.println("Null Pointer Exception Caught!");
        }
    }
}
