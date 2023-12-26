package Buoi4.B1;

public abstract class Shape {
    public abstract void tinhDienTich();

    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.tinhDienTich();
        Triangle triangle = new Triangle();
        triangle.tinhDienTich();
        Rectangle rectangle = new Rectangle();
        rectangle.tinhDienTich();
    }
}
