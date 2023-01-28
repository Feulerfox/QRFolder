package com.Ex7;


public class Main {
    public static void main(String[] args) {

        MyPoint p1 = new MyPoint();  // Test constructor
        System.out.println(p1);      // Test toString()
        p1.setX(8);   // Test setters
        p1.setY(6);
        System.out.println("x is: " + p1.getX());  // Test getters
        System.out.println("y is: " + p1.getY());
        p1.setXY(3, 0);   // Test setXY()
        System.out.println(p1.getXY()[0]);  // Test getXY()
        System.out.println(p1.getXY()[1]);
        System.out.println(p1);

        MyPoint p2 = new MyPoint(0, 4);  // Test another constructor
        System.out.println(p2);
// Testing the overloaded methods distance()
        System.out.println(p1.distance(p2));    // which version?
        System.out.println(p2.distance(p1));    // which version?
        System.out.println(p1.distance(5, 6));  // which version?
        System.out.println(p1.distance());      // which version?

        MyCircle m1=new MyCircle(p1,2);
        MyCircle m2=new MyCircle(p2,1);
        MyCircle m3=new MyCircle();
        MyCircle m4=new MyCircle(0,0,4);
        //p2.listTo10();
        System.out.println(m1.getCenterX());
        m1.setCenterX(9);
        System.out.println(m1.getCenterX());
        System.out.println(m2.getCenterXY()[0]);
        m2.setCenterXY(9,8);
        System.out.println(m2.getCenterXY()[0]);

        System.out.println(m3.distance(m4));
        System.out.println(m3.distance(m1));
        System.out.println(m4.getArea());
        System.out.println(m4.getCircumference());

    }
}
