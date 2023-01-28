package ExPoints;

import ExSuperPerson.Person;
import ExSuperPerson.Staff;
import ExSuperPerson.Student;

public class Main {
    public static void main(String[] args) {
        Point2D c1 = new Point2D(2.0f, 3.0f);
        System.out.println(
                 " #1 " + c1.getXY()[0]
                + " #2 " + c1.getX());
        System.out.println(c1);

        Point3D c2 = new Point3D(3.8f,4.6f,5.6f);
        System.out.println(
                 " #1 " + c2.getXYZ()[0]
                + " #2 " + c2.getXY()[1]
                + " #3 " + c2.getY()
                );
        System.out.println(c2);

        Point3D c3 = new Point3D();
        System.out.println(
                " #1 " + c2.getXYZ()[0] + " #2 " + c2.getXY()[1] + " #3 " + c2.getY()
        );
        System.out.println(c3);
        c3.setXYZ(2.4f,6.5f,5.6f);
        System.out.println(c3);

    }
}