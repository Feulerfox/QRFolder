package com.Ex6;

public class MyPoint {
    private int x;
    private int y;

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public MyPoint() {
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "MyPoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
    public int[] getXY(){
        int[] XY= {x,y};
        return XY;
    }
    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    public double distance(int x, int y){
        return Math.sqrt(Math.pow((this.x-x),2)+ Math.pow((this.y-y),2));
    }
    public double distance(MyPoint myPoint){
        return Math.sqrt(Math.pow((this.x-myPoint.x),2)+ Math.pow((this.y-myPoint.y),2));
    }
    public double distance(){
        return Math.sqrt(Math.pow((this.x),2)+ Math.pow((this.y),2));
    }

    public void listTo10(){
        MyPoint[] points=new MyPoint[10];

        for (int i = 0; i < points.length; i++) {
            points[i]=new MyPoint(i+1,i+1);
            System.out.println(points[i]);
        }

    }

}

