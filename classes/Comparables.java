// package classes;

class Rectangle implements Comparable<Rectangle>{
    private final int x, y, area;

    public Rectangle(int a, int b){
        this.x = a;
        this.y = b;
        this.area = a * b;
    }

    @Override
    public int compareTo(Rectangle o){
        if(this.area == o.area) return 0;
        else if(this.area < o.area) return -1;
        return 1;
    }
}

public class Comparables {
    public static void main(String args[]){
        Rectangle r1 = new Rectangle(10, 20);
        Rectangle r2 = new Rectangle(20, 10);

        System.out.println(r1.compareTo(r2));
    }
}
