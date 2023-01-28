import java.util.Scanner;

public class Somma5Numeri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyScanner=new Scanner(System.in);
		
		System.out.println("Inserisci 5 numeri:");
		
		int index=0;
		int somma=0;
		
		while(index<5) {
			
				int input=keyScanner.nextInt();
				somma+=input;
				index++;					
		}
		
		System.out.println("Somma: "+ somma);
		
		
		keyScanner.close();
	}

}
