import java.util.Random;
import java.util.Scanner;

public class Roulette5Tentativi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyScanner=new Scanner(System.in);
		Random random=new Random();
	
		
		int index=0;
			
		
		int input2=random.nextInt(1,37);
		
		while (index<5) {
			System.out.println("Inserisci la tua puntata:");
			// System.out.println(input2); quando voglio vincere
			int input=keyScanner.nextInt();
			
			if (input<=36 && input>0) {
				
				if (input==input2) {
					System.out.println("Hai vinto. LMAOOOO");
					System.exit(0);}
				else {
					System.out.println("Hai perso, coglione");
					System.exit(0);}}
			
			else
				System.out.println("Riprova");
				index++;						
			}		
		
			
		System.out.println("Hai finito i tentativi, povero coglione");
		

		keyScanner.close();
		
	}

}
