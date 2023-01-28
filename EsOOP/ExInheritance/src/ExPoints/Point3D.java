package ExPoints;

public class Point3D extends Point2D {

    private float z;

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {
        super();
        this.z=0.0f;
    }

    @Override
    public String toString() {
        return super.toString() + " Point3D{" +
                "z=" + z +
                '}';
    }
    public float[] getXYZ(){
        float[] res=new float[3];
        res[0]=super.getX();
        res[1]=super.getY();
        res[2]=z;

        return res;

    }

    public void setXYZ(float x, float y, float z){
        super.setXY(x,y);
        this.z=z;
    }

}
