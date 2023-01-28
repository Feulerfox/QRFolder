package com.elab.exercises;

//import org.apache.commons.lang3.NotImplementedException;

/*********
 * La Classe “Persistence”,  prende un parametro intero positivo e
 * ritorna la sua “persistenza moltiplicativa”,
 * che è il numero di volte per cui bisogna moltiplicare le cifre fra loro fino ad avere un unico carattere.
 * Per esempio:
 *
 * - Persistence.calculate(39) == 3 perché 3*9 = 27, 2*7 = 14, 1*4=4 e 4 è di una cifra sola
 * - Persistence.calculate(999) == 4 perché 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, e 1*2 = 2
 * - Persistence.calculate(4) == 0 perché 4 è già una cifra singola
 */
public class Persistence {

    public static int calculate(int i) {
        if (i < 1) {
            throw new ArithmeticException("Denied, insert an integer that is greater than 0");
        }
        else {
            System.out.println("The persistance of the input number is: ");
        }
        String str=Integer.toString(i);
        int prod=1;
        int count=0;

        if(i<10){
                return 0;
        }
        while(prod*-1<0){
            for (int j = 0; j < str.length(); j++) {
            prod*=(str.charAt(j)-'0');
            }
            if (Integer.toString(prod).length()<2) {
                prod=-1;
                break;
            }
            count++;
            str=Integer.toString(prod);
            prod=1;
            //System.out.println(str);
        }
        return count+1;
    }

    //Another try with module
    public static int calculateAlt(int i) {
        int a=0;
        int prod=1;
        int count=0;
        boolean isOn=true;

        if(i<10){
            return 0;
        }
        while(isOn){
            while(i>0){
                a=i%10;
                i/=10;
                prod*=a;
            }
            if(prod/10>0){
                i=prod;
                prod=1;
                count++;
            }
            else {
                count++;
                isOn=false;
            }
        }
        return count;
    }



   /* public static void main(String[] args) {
        System.out.println(calculate(11));
        System.out.println(calculate(10));
        System.out.println(calculate(4));
        System.out.println(calculate(999));
        System.out.println(calculate(39));
        System.out.println("#######################################");

        System.out.println(calculateAlt(11));
        System.out.println(calculateAlt(10));
        System.out.println(calculateAlt(4));
        System.out.println(calculateAlt(999));
        System.out.println(calculateAlt(39));
    }

    */
}
