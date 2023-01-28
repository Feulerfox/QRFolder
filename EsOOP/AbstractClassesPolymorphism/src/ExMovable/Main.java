package ExMovable;

import ExGeometricObject.GeometricObject;
import ExGeometricObject.Rectangle;

public class Main {
    public static void main(String[] args) {
        MovablePoint s1 = new MovablePoint(5,5,4,4);
        System.out.println(s1);                    // which version?
        s1.moveDown();
        s1.moveDown();
        s1.moveDown();  // which version?
        System.out.println(s1.y);     // which version?

        Circle s2 = new Circle(5,new MovablePoint(5,6,7,8));
        System.out.println(s2);                    // which version?
        s2.moveDown();
        s2.moveDown();
        s2.moveDown();  // which version?
        System.out.println(s2.getCenter().y);     // which version?

        Circle s3 = new Circle(5,6,7,8,9);
        System.out.println(s3);
        System.out.println("###########################################"); // which version?
        s3.moveDown();
        s3.moveDown();
        s3.moveDown();  // which version?
        System.out.println(s3.getCenter());     // which version?


    }
}