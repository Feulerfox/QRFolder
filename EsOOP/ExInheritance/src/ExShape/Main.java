package ExShape;

import ExPoints.Point2D;
import ExPoints.Point3D;

public class Main {
    public static void main(String[] args) {
        Shape c1 = new Shape("black", false);
        System.out.println(
                 " #1 " + c1.getColor()
                + " #2 " + c1.isFilled());
        System.out.println(c1);

       Circle c2 = new Circle("green",true,8.0);
        System.out.println(
                 " #1 " + c2.getColor()
                + " #2 " + c2.getArea()
                + " #3 " + c2.getRadius()
                         + " #3 " + c2.getCircumference()
                );
        System.out.println(c2);

        Rectangle c3 = new Rectangle();
        System.out.println(
                " #1 " + c3.getLength() + " #2 " + c3.getWidth() + " #3 " + c3.getPerimeter()
        );
        System.out.println(c3);

        c3.setLength(80);
        c3.setWidth(90);
        c3.setFilled(false);
        c3.setColor("reddest");
        System.out.println(c3);

        Square c4 = new Square(9.0);
        System.out.println(
                " #1 " + c4.getLength() + " #2 " + c4.getWidth() + " #3 " + c4.getPerimeter()
        );
        System.out.println(c4);

        c4.setLength(80);
        c4.setWidth(90);
        c4.setFilled(false);
        c4.setColor("reddest");
        System.out.println(c4);

    }
}