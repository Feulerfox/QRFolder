import java.util.Scanner;

public class SommaNumeriPari {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyScanner=new Scanner(System.in);
		System.out.println("Inserisci 5 numeri:");
		
		int index=0;
		int somma=0;
		
		while (index<5) {
			int input=keyScanner.nextInt();
			
				if (input%2==0)
					somma=somma+input;
		index++;		
		}
		System.out.println(somma);	
		
		keyScanner.close();
	}

}
