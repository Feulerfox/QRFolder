package com.Ex6;

public class MyLine {
    private MyPoint begin;
    private MyPoint end;

    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    public MyLine(int x, int y, int x2, int y2) {
        this.begin.setXY(x,y);
        this.end.setXY(x2,y2);
    }

    public MyPoint getBegin() {
        return begin;
    }

    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    public MyPoint getEnd() {
        return end;
    }

    public void setEnd(MyPoint end) {
        this.end = end;
    }

    public int getBeginX(){
        return begin.getX();
    }
    public int getBeginY(){
        return begin.getY();
    }
    public int[] getBeginXY(){
        return begin.getXY();
    }
    public int getEndX(){
        return end.getX();
    }
    public int getEndY(){
        return end.getY();
    }
    public int[] getEndXY(){
        return end.getXY();
    }

    public void setEndX(int x){
        this.end.setX(x);
    }
    public void setEndY(int y){
        this.end.setY(y);
    }
    public void setEndXY(int x,int y){
        this.end.setXY(x,y);
    }
    public void setBeginX(int x){
        this.begin.setX(x);
    }
    public void setBeginY(int y){
        this.begin.setY(y);
    }
    public void setBeginXY(int x,int y){
        this.begin.setXY(x,y);
    }

    public double getLength(){
        return begin.distance(end);
    }
    public double getGradient() {
        return Math.atan2((begin.getY() - end.getY()), (begin.getX() - end.getX()));
    }

    @Override
    public String toString() {
        return "MyLine{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
