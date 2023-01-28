import java.util.Arrays;

public class MyPolynomial {
    private double[] coefss;

    public MyPolynomial(double[] coefss) {
        this.coefss = coefss;
    }

    public int getDegree(){
        double max=this.coefss[0];
        for (int i = 0; i < coefss.length; i++) {
            if(max<coefss[i]){
                max=coefss[i];
            }
        }
        return (int)max;
    }

    @Override
    public String toString() {
        return "MyPolynomial{" +
                "coefss=" + Arrays.toString(coefss) +
                '}';
    }

    public double evaluate(double x){

        for (int i = 0; i < coefss.length-1; i++) {
            coefss[i]*=x;
        }
        double sum=0;
        for (int i = 0; i <coefss.length ; i++) {
            sum+=coefss[i];
        }
        return sum;
    }
}
