package com.elab.exercises;

import java.util.ArrayList;

/*********
 * Dato il seguente triangolo di numeri dispari:
 * 1
 * 3    5
 * 7    9   11
 * 13   15  17  19
 * 21   23  25  27  29
 * ...
 *
 * La Classe “RowSumOddNumbers”,  prende un parametro intero positivo e
 * ritorna la somma dei numeri nella riga n-esima.
 * Per esempio:
 *
 * - RowSumOddNumbers.calculate(1) = 1
 * - RowSumOddNumbers.calculate(3) = 7 + 9 + 11 = 27
 */
public class RowSumOddNumbers {

    //Mathematical implementation
    /*
    -Sum of consequent n numbers is (n+1)*n/2 (Gaussian sum)
    ->we then know that the sum of the numbers below our row is: a=((n-1)*(n))/2

    -The first number, in our selected row, is 2*a+1 which immediately follows from the sum of the n numbers below it
    ->we have then that a=n*n-n+1
    ->we have the last number in the row which is then: b=2*(n-1) (last odd number of a series of n odd numbers)

    -It is known that the sum of n odd numbers is 1+3+5+...+(2n-1) = n*n (square proof)
    -> To obtain the sum of the wanted row we take the last number before the row(x1) and the of the row as well(x2)
    ->x1=(n*n-n)/2 and x2=(n*n+n)/2
    ->the sum of the row then must be x2*x2-x1*x1
    ->after some simplification we get n*n*n
*/
    public static int calculate(int i) {
        if (i < 1) {
            throw new ArithmeticException("Denied, insert an integer that is greater than 0");
        }
        else {
            System.out.println("The sum of the i-th row is: ");
        }
        return i*i*i;
    }

    //Another try with arraylists with saving all of the z row sums in the (z-1) position
    public static int calculateAlt(int z) {
        if (z < 1) {
            throw new ArithmeticException("Denied, insert an integer that is greater than 0");
        }
        else {
            System.out.println("The sum of the i-th row is: ");
        }

        ArrayList<Integer> arr=new ArrayList<>();
        int sum=0;
        int k=0;
        for (int i = 0; i < z; i++) {
            for (int j = 0; j <= i ; j++) {
                sum+=(k*2+1);
                k++;
            }
            arr.add(sum);
            sum=0;
        }
        return arr.get(z-1);
    }

    /*public static void main(String[] args) {
        System.out.println(calculate(1));
        System.out.println(calculate(3));
        System.out.println(calculateAlt(1));
        System.out.println(calculateAlt(3));
        System.out.println(calculateAlt(-3));
    }
     */
}
