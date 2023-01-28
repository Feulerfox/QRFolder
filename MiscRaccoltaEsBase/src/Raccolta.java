import java.util.Random;
import java.util.Scanner;

public class Raccolta {

    public static void main(String[] args) {

        Scanner keyScanner=new Scanner(System.in);
        System.out.println("Inserisci un numero tra 0 e 100:");
        int input=keyScanner.nextInt();

        int index=1;

        while (0>input || 100<input) {
            System.out.println("Numero fuori range, riprova:");
            input=keyScanner.nextInt();
            index++;
            if (index==3) {
                System.out.println("Hai rotto il cazzo, disabile. Impara a leggere");
                break;}
        }
        System.out.println("#########################################");
        //Somma fattoriale
        int somma=0;
        int fattoriale=1;
        for (int i = 1; i <= input; i++) {
            fattoriale*=i;
            somma+=i;
            //System.out.println(somma);
            //System.out.println(fattoriale);
        }

        System.out.println("La somma dei numeri da 1 a " + input +  " è: "+ somma);
        System.out.println("Il fattoriale di " + input +  " è: "+ fattoriale);

        System.out.println("#########################################");
        //Stampa dei divisori

        String divisoriString="";

        for (int i = input; i > 0; i--) {
            if (input%i==0) {
                //System.out.println(input/i);
                divisoriString+=input/i + " ";
            }
        }
        System.out.println("I divisori di " + input +" sono: "+ divisoriString);

        System.out.println("#########################################");
        //Max e Min di un array dato in input

        Random random=new Random();

        int [] array=new int [input];


        System.out.println("Dato un array numerico generato casualmente di dimensione " + input);
        int min=array[0];
        int max=array[0];

        for (int i = 0; i < array.length; i++) {
            array[i]=random.nextInt(1,10001);
            max=array[0];
            min=array[0];
            if (array[i]>=max) {
                max=array[i];
            }
            if (array[i]<=min) {
                min=array[i];
            }
            System.out.println(array[i]);
        }

        System.out.println("Il numero più grande nell'array è: " + max);
        System.out.println("Il numero più piccolo nell'array è: " + min);

        System.out.println("#########################################");
        //Ordinare un vettore al contrario

        System.out.println("Un nuovo vettore da mettere al contrario:");
        int [] array2=new int [input];
        int [] array3=new int [input];

        System.out.println("Vettore ordinato normale");
        //Popolo il vettore di numeri random
        for (int i = 0; i < array2.length; i++) {
            array2[i]=random.nextInt(1,10001);
            System.out.println(array2[i]);;
        }
        System.out.println("Vettore ordinato inverso");
        for (int i = 0, j=array.length-1; i < array.length && j>=0; i++, j--) {
            array3[i]=array2[j];
            //System.err.println(i + " " + j);
            System.out.println(array3[i]);
        }
        keyScanner.close();
    }

}

