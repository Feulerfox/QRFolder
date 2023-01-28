import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Inserisci un numero reale:");
        MyComplex c= new MyComplex(scanner.nextDouble(),0);
        System.out.println("Inserisci un numero immaginario:");
        c.setImag(scanner.nextDouble());
        System.out.println("Inserisci un altro numero reale:");
        MyComplex c2= new MyComplex(scanner.nextDouble(),0);
        System.out.println("Inserisci un altro numero immaginario:");
        c2.setImag(scanner.nextDouble());
        scanner.close();

        System.out.println(c);
        System.out.println(c2);

        System.out.println(c.isImag());
        System.out.println(c2.isReal());
        System.out.println(c.equals(c2));

        System.out.println(c.addInto(c2));
        System.out.println(c2.addNew(c));
        System.out.println(c2.equals(c2.addNew(c)));








    }
}