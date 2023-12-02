// package classes;

// import org.w3c.dom.css.Rect;

class Rectangle{
    private int x, y, area;

    public Rectangle(int a, int b){
        this.x = a;
        this.y = b;
        this.area = x * y;
    }

    public int getArea() {
        return area;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

interface Comparator<T>{
    public int compare(T first, T second);
}

class RectangleArea implements Comparator<Rectangle>{
    @Override
    public int compare(Rectangle r1, Rectangle r2){
        return r1.getArea() - r2.getArea();
    }
}

class RectangleSide implements Comparator<Rectangle>{
    @Override
    public int compare(Rectangle r1, Rectangle r2){
        if(r1.getX() != r2.getX()) return r1.getX() - r2.getX();
        return r1.getY() - r2.getY();
    }
}

public class Comparators {
    public static void main(String args[]){
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(20, 10);

        // RectangleArea r3 = (RectangleArea) r1;
        // RectangleArea r4 = (RectangleArea) r2;
        RectangleArea ra = new RectangleArea();
        RectangleSide rs = new RectangleSide();

        System.out.println(ra.compare(r1, r2));
        System.out.println(rs.compare(r1, r2));
    }
}
