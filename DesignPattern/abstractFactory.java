interface Shape3 {
    void draw();
}

class RoundRectangle implements Shape3 {
    @Override
    public void draw() {
        System.out.println("Inside RoundRectangle::draw() method.");
    }
}

class RoundSquare implements Shape3 {
    @Override
    public void draw() {
        System.out.println("Inside RoundSquare::draw() method.");
    }
}

class RoundTriangle implements Shape3 {
    @Override
    public void draw() {
        System.out.println("Inside RoundTriangle::draw() method.");
    }
}

class SharpRectangle implements Shape3 {
    @Override
    public void draw() {
        System.out.println("Inside SharpRectangle::draw() method.");
    }
}

class SharpSquare implements Shape3 {
    @Override
    public void draw() {
        System.out.println("Inside SharpSquare::draw() method.");
    }
}

class SharpTriangle implements Shape3 {
    @Override
    public void draw() {
        System.out.println("Inside SharpTriangle::draw() method.");
    }
}

class FlatRectangle implements Shape3 {
    @Override
    public void draw() {
        System.out.println("Inside FlatRectangle::draw() method.");
    }
}

class FlatSquare implements Shape3 {
    @Override
    public void draw() {
        System.out.println("Inside FlatSquare::draw() method.");
    }
}

class FlatTriangle implements Shape3 {
    @Override
    public void draw() {
        System.out.println("Inside FlatTriangle::draw() method.");
    }
}

interface AFx {
    public Shape3 FM(String s);
}

class FM4Round implements AFx {
    @Override
    public Shape3 FM(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new RoundRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new RoundSquare();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new RoundTriangle();
        }
        return null;
    }
}

class FM4Sharp implements AFx {
    @Override
    public Shape3 FM(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new SharpRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new SharpSquare();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new SharpTriangle();
        }
        return null;
    }
}

class FM4Flat implements AFx {
    @Override
    public Shape3 FM(String shapeType) {
        if (shapeType == null) {
            return null;
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new FlatRectangle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new FlatSquare();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new FlatTriangle();
        }
        return null;
    }
}

class FactorySelector {
    public AFx FM2(String s) {
        if (s == null) return null;
        else if (s.equalsIgnoreCase("ROUND")) {
            return new FM4Round();
        }
        
        else if (s.equalsIgnoreCase("Flat")) {
            return new FM4Flat();
        }
        
        else if (s.equalsIgnoreCase("Sharp")) {
            return new FM4Sharp();
        }
        return null;
    }
}

public class abstractFactory {
    public static void main(String args[]) {
        FactorySelector factorySelector = new FactorySelector();
        AFx afx = factorySelector.FM2("FLAT");
        Shape3 shape1 = afx.FM("SQUare");
        try{
            shape1.draw();
        }
        catch(Exception e) {
            System.out.println("Null pointer exception caught!");
        }
    }
}
