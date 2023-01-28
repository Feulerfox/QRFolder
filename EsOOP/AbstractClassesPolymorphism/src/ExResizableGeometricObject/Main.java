package ExResizableGeometricObject;

import ExMovable.MovablePoint;

public class Main {
    public static void main(String[] args) {
        ExResizableGeometricObject.Circle s1 = new ExResizableGeometricObject.Circle(5.0);
        System.out.println(s1);                    // which version?

        System.out.println(s1.radius);     // which version?
        System.out.println(s1.getArea());
        System.out.println(s1.getPerimeter());

        ResizableCircle s2 = new ResizableCircle(4.0);
        System.out.println(s2);                    // which version?

        System.out.println(s2.getArea());
        System.out.println("###########################################"); // which version?
        s2.resize(100);

        System.out.println(s2); // which version?



        ExResizableGeometricObject.Circle s3 = new ResizableCircle(5);
        System.out.println(s3);
        System.out.println(s3 instanceof Circle);
        System.out.println(s3 instanceof ResizableCircle);
        //s3.resize(2);
        System.out.println("###########################################");
        ResizableCircle s4=(ResizableCircle) s3;
        System.out.println(s4 instanceof Circle);
        System.out.println(s4 instanceof ResizableCircle);
        s4.resize(2);
        System.out.println("###########################################");
        Circle s5=(Circle) s3;
        System.out.println(s5 instanceof Circle);
        System.out.println(s5 instanceof ResizableCircle);
        System.out.println("###########################################");
        ResizableCircle resizableCircle=new ResizableCircle(5.8);
        Circle s7=(Circle) resizableCircle;
    }
}