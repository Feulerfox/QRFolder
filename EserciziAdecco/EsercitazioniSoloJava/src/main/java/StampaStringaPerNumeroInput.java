import java.util.Scanner;

public class StampaStringaPerNumeroInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyScanner=new Scanner(System.in);
		
		System.out.println("Inserisci la parola da ripetere: ");
		String inputString=keyScanner.nextLine();
		System.out.println("Il numero di volte:");
		int inputNumber=keyScanner.nextInt();
		
		// int index=inputString.length(); // Stampo tante parole quante lettere sono contenute nella parola
		
		int index=inputNumber;
			
		while (index>0) {
			System.out.println(inputString);
			index--;
			
		}
		
		
		
		keyScanner.close();
	}

}
