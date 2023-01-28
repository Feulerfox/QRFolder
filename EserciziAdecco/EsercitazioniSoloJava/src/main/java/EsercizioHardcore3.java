import java.util.Scanner;

public class EsercizioHardcore3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyScanner=new Scanner(System.in);
		
		System.out.println("Inserisci voti per trovare la media aritmetica:");
		
		int input=1;
		int somma=0;
		int numeroVoti=0;
		
		while(input*1!=0) {
			input=keyScanner.nextInt();
			somma+=input;
			numeroVoti++;
//			System.out.println(numeroVoti); controllo quanti voti sto avendo, ne veniva uno in più senza aggiungere il -1 sotto
			}
		System.out.println(somma/(numeroVoti-1));
		keyScanner.close();
	}

}
