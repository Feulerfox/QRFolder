import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Numeri {
    public ArrayList<Integer> getPari(ArrayList<Integer> arrayInput) {
        ArrayList<Integer> arrayOut= new ArrayList<Integer>();
        if (arrayInput==null) {
            return null;
        }
        for (Integer v : arrayInput) {
            if (v % 2==0) {
                arrayOut.add(v);
            }
        }
        return arrayOut;
    }

    //##########################################################
    public double getArmonica(int num) {
        double somma=0;
        for (int i = 1; i <= num; i++) {
            double ris=1.0/i;
            somma+=ris;
        }
        return somma;
    }

    //##########################################################
    public boolean getOrdinato(double arrayInput[]){
        if (arrayInput==null) {
            return false;
        }
        if (arrayInput.length<2) {
            System.out.println("vettore inserito non ordinato");
        }
        for (int i = 0; i < arrayInput.length-1; i++) {
            if (arrayInput[i]>arrayInput[i+1]) {
                //System.out.println(arrayInput[i] +" " + arrayInput[i+1]);
                return false;
            }
        }
        return true;
    }


    //##########################################################
    public int[] getCrescente(int arrayInput[]) {

        if (arrayInput==null) {
            return null;
        }
        if (arrayInput.length<2) {
            System.out.println("vettore inserito non ordinato");
        }
        for (int j = 0; j < arrayInput.length-1; j++) {
            for (int i = 0; i < arrayInput.length-1; i++) {
                if (arrayInput[i]>arrayInput[i+1]) {
                    //System.out.println(arrayInput[i] +" " + arrayInput[i+1]);
                    int tmp = arrayInput[i];
                    arrayInput[i]=arrayInput[i+1];
                    arrayInput[i+1]=tmp;
                }
            }
        }
        return arrayInput;
    }

    //##########################################################
    public boolean getVettori(int arrayInput[],int arrayInput2[]) {

        if (arrayInput == null || arrayInput2 == null) {
            return false;
        }
        int prod1=1;
        int prod2=1;

        for (int i = 0,  j=0; i < arrayInput.length || j < arrayInput2.length; i++, j++) {
            prod1*=arrayInput[i];
            prod2*=arrayInput2[j];
        }
        if (prod1==prod2) {
            return true;
        }
        return false;

    }

    //##########################################################
    public double[] getReversed(double arrayInput[]) {
        if (arrayInput==null) {
            return null;
        }
        double arrayOutput[] = new double [arrayInput.length];

        for (int i = 0, j=arrayInput.length-1; i < arrayInput.length && j>=0; i++, j--) {
            arrayOutput[j]=arrayInput[i];
        }
        return arrayOutput;
    }

    //##########################################################
    public boolean getDiversi(int arrayInput[]) {
        if (arrayInput==null) {
            return false;
        }
        this.getCrescente(arrayInput);

        for (int i = 0; i < arrayInput.length-1; i++) {
            if (arrayInput[i]==arrayInput[i+1]) {
                return false;
            }
        }
        return true;
    }

    //##########################################################
    public boolean get3Num(int arrayInput[]) {
        if (arrayInput==null) {
            return false;
        }
        this.getCrescente(arrayInput);

        for (int i = 0; i < arrayInput.length-2; i++) {
            if (arrayInput[i]==arrayInput[i+2]) {
                return true;
            }
            else if (arrayInput[i]==arrayInput[i+1]) {
                i+=2;
            }
        }
        return false;
    }

    //##########################################################
    public boolean get3NumAlt(int arrayInput[]) {
        if (arrayInput==null) {
            return false;
        }
        int conta=0;

        for (int i = 0; i < arrayInput.length-1; i++) {
            for (int j =0; j < arrayInput.length-1; j++) {
                if (arrayInput[i]/arrayInput[j]==1) {
                    conta+=1;                         //se entra con successo ropete il ciclo for se no si azzera
                }
                else {
                    conta=0;
                }
                if (conta==3) {
                    return true;
                }
            }
        }
        return false;
    }

    //##########################################################
    public void getTabellinedUpon() {
        System.out.println("Inserisci un numero, COGLIONE:");
        Scanner keyScanner=new Scanner(System.in);
        int inputNum= keyScanner.nextInt();

        for (int i = 1; i < 11; i++) {
            System.out.println(inputNum*i);
        }
        keyScanner.close();
    }

    //##########################################################
    public boolean getCombinazione(int arrayInpy[], int num) {
        if (arrayInpy==null) {
            return false;
        }

        for (int i = 0; i < arrayInpy.length; i++) {
            for (int j = 0; j < arrayInpy.length; j++) {
                if (i==j) {
                    continue;
                }
                if (arrayInpy[i]+arrayInpy[j]==num) {
                    return true;
                }
            }
        }
        return false;
    }

    //##########################################################
    public int getSomMatrice(int matrix [][]) {
        if (matrix==null) {
            return 0;
        }
        int somma=0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                somma+=matrix [i][j];
            }
        }
        return somma;
    }
}

