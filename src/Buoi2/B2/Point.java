package Buoi2.B2;

public class Point {
    private double x;
    private double y;
    private double z;
    public Point(float x,float y, float z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    public void Negate(){
        if(this.x > 0){
            this.x = - this.x;
        }
        if(this.y > 0){
            this.y = - this.y;
        }
        if(this.z > 0){
            this.z = - this.z;
        }
    }

    public double Norm(){
        return Math.sqrt(this.x*this.x + this.y*this.y + this.z*this.z);
    }

    public void Print(){
        System.out.println("("+this.x+", "+this.y+", "+this.z+")");
    }

    public static void main(String[] args) {
        Point point = new Point(3,4,5);
        System.out.println("3 Buoi2.B2.Point: ");
        point.Print();
        System.out.println("Buoi2.B2.Point after negate: ");
        point.Negate();
        point.Print();
        double norm = point.Norm();
        System.out.println("Distance to point: "+ norm);
    }
}
