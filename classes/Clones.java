class Point implements Cloneable{
    private int x, y;

    public Point(int a, int b){
        this.x = a;
        this.y = b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Point clone() throws CloneNotSupportedException{
        try{
            // Point cpy = new Point(this.x, this.y);
            // return cpy;

            Point cpy = (Point) super.clone();
            return cpy;
        }
        catch(CloneNotSupportedException e){
            throw new CloneNotSupportedException("NOt cloned!");
        }
    }
}

class Point3d extends Point{
    private int z;

    public Point3d(int a, int b, int c){
        super(a, b);
        this.z = c;
    }

    public int getZ() {
        return z;
    }

    @Override
    public Point3d clone() throws CloneNotSupportedException{
        Point3d p = (Point3d) super.clone();
        p.z = this.z;
        
        return p;
    }

}


public class Clones {
    public static void main(String args[]){
        Point p1 = new Point(1, 3);
        try{
            Point p2 = p1.clone();

        System.out.println(p2.getX() + " " + p2.getY());
        
        Point3d p3 = new Point3d(1, 3, 3);
        
        Point3d p4 = p3.clone();
        
        System.out.println(p4.getX() + " " + p4.getY() + " " + p4.getZ());
        
        System.out.println(p1.toString());
        System.out.println(p2.toString());
    }

    catch(CloneNotSupportedException e){
        System.out.println(e.getMessage());
    }
    }   
}
