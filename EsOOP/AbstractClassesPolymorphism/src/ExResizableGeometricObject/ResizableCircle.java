package ExResizableGeometricObject;

public class ResizableCircle extends Circle implements Resizable{

    public ResizableCircle(double radius) {
        super(radius);
    }


    public String toString() {
        return  "ResizableCircle{" +
                "radius=" + radius +
                '}';
    }

    public void resize(int percent){
       double tmp= radius*=percent/100.0;
       radius+=tmp;

    }


}
