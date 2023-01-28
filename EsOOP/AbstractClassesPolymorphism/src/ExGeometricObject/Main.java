package ExGeometricObject;

public class Main {
    public static void main(String[] args) {
        GeometricObject s3 = new Rectangle(1.0, 2.0);   // Upcast
        System.out.println(s3);
        System.out.println(s3.getArea());
        System.out.println(s3.getPerimeter());
        System.out.println((((Rectangle) s3).getLength()));

        Rectangle r1 = (Rectangle)s3;   // downcast
        System.out.println(r1);
        System.out.println(r1.getArea());
        System.out.println(r1.getLength());
    }
}