


public class Circle {

    private String color;
    private double radius;

    public Circle(){

        this.radius=1.0;
        this.color="red";
    }

    public Circle(double radius){
        this.radius=radius;
        this.color="red";
    }


    public double getRadius(){
        return this.radius;
    }

    public double getArea(){

        return radius*radius*Math.PI;
    }

    public String getColor(){

        return this.color;
    }

    public void setColor(String newColor){

        this.color=newColor;
    }

    public void setRadius(double newRadius){

        this.radius=newRadius;
    }

    public String toString(){

        return "Circle[radius: " + this.radius + " color: "+ this.color + "]";
    }

    public double getCircumference(){

        return 2*this.radius*Math.PI;
    }










}
