// package classes;

class Point{
    private final int x, y;

    public Point(int a, int b){
        this.x = a;
        this.y = b;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null && this.getClass() == obj.getClass()){
            Point p = (Point) obj;

            return this.x == p.x && this.y == p.y;
        }
        else return false;
    }
}

class Point3d extends Point{
    private final int z;
    
    public Point3d(int a, int b, int c){
        super(a, b);
        this.z = c;
    }

    @Override
    public boolean equals(Object obj){
        if(obj != null && this.getClass() == obj.getClass()){
            Point3d p = (Point3d) obj;

            return super.equals(obj) && this.z == p.z;
        }
        else return false;
    }
}

public class Points {
    public static void main(String args[]){
        Point p1 = new Point(10, 20);
        Point p2 = new Point(10, 20);

        System.out.println(p1.equals(p2));

        Point3d p3 = new Point3d(1, 2, 3);
        Point3d p4 = new Point3d(1, 2, 4);

        System.out.println(p3.equals(p4));
    }
}
