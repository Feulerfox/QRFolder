public class MyComplex {

    private double real;
    private double imag;

    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public MyComplex() {
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }
    public void setValue(double x, double y){
        this.real=x;
        this.imag=y;
    }

    @Override
    public String toString() {
        return "MyComplex{" +
                "real=" + real +
                ", imag=" + imag +
                '}';
    }

    public boolean isReal(){
        if(imag==0)
            return true;
        return false;
    }

    public boolean isImag(){
        if(imag==0)
            return false;
        return true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyComplex myComplex = (MyComplex) o;

        if (Double.compare(myComplex.real, real) != 0)
            return false;

        return Double.compare(myComplex.imag, imag) == 0;
    }

    public boolean equals(MyComplex o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        MyComplex myComplex = (MyComplex) o;

        if (Double.compare(myComplex.real, real) != 0)
            return false;

        return Double.compare(myComplex.imag, imag) == 0;
    }

    public boolean equals(double real, double imag) {
        if (this.real == real && this.imag == imag)
            return true;

        return false;
    }



    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(real);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(imag);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }



    public double magnitude(){
        return Math.sqrt(this.real*this.real+this.imag*this.imag);
    }

    public MyComplex addInto(MyComplex add){

        this.real+=add.real;
        this.imag+=add.imag;

        return this;
    }
    public MyComplex addNew(MyComplex add){

        return new MyComplex(this.real+=add.real,this.imag+=add.imag);
    }

    public MyComplex subtractInto(MyComplex add){

        this.real-=add.real;
        this.imag-=add.imag;

        return this;
    }
    public MyComplex subtractNew(MyComplex add){

        return new MyComplex(this.real-=add.real,this.imag-=add.imag);
    }
    public MyComplex multiply(MyComplex add){

        this.real+=(real*add.real-imag*add.imag);
        this.imag+=(real*add.imag+imag*add.real);
        return this;
    }
    public MyComplex divide(MyComplex add){

        MyComplex c = this.multiply(add.conjugate(add));
        add.magnitude();
        this.real=c.real/add.magnitude();
        this.imag=c.imag/add.magnitude();

        return this;

    }
    public MyComplex conjugate(MyComplex add){
        add.imag*=-1;
        return add;
    }




}
