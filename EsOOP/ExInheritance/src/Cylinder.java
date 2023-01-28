public class Cylinder extends Circle{

    private double height;


    public Cylinder(double height) {
        super();
        this.height = height;
    }

    public Cylinder() {
        super();
        this.height=1.0;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    public Cylinder(double radius, double height){
        super(radius);
        this.height=height;
    }

    public double getVolume(){
        return this.height*super.getArea();
    }

    @Override
    public String toString() {
        return super.toString() + " heigth " + height;
    }
}
