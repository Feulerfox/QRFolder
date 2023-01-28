package com.Ex7;

public class MyCircle {
    private MyPoint center;
    private int radius;

    public MyCircle() {
        center=new MyPoint(0,0);
        radius=1;
    }

    public MyCircle(MyPoint center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public MyCircle(int x,int y,int radius) {
        this.radius = radius;
        this.center=new MyPoint(x,y);;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getCenterX() {
        return center.getX();
    }
    public int getCenterY() {
        return center.getY();
    }
    public int[] getCenterXY() {
        return center.getXY();
    }
    public void setCenterXY(int x, int y) {
        center.setXY(x,y);
    }
    public void setCenterX(int x) {
        center.setX(x);
    }
    public void setCenterXY(int y) {
        center.setY(y);
    }

    @Override
    public String toString() {
        return "MyCircle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public double getArea(){
        return Math.pow(radius,2)*Math.PI;
    }
    public double getCircumference(){
        return Math.PI*radius*2;
    }
    public double distance(MyCircle myCircle){
        return myCircle.getCenter().distance(center);
    }


}
