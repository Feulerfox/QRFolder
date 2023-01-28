import java.util.Scanner;

public class EsercizioHardcore2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyScanner=new Scanner(System.in);
		
		System.out.println("Dai una lista di numeri:");
		
		int input=1;
		int max=0;
		
		
		while (-1*input<0) {                //chiudo ciclo moltiplicando per -1
			input=keyScanner.nextInt();  	//Inserisco qui l'input per averne finché voglio
			if (input>=max)					//impongo la sostituzione del numero più grande
				max=input;
			
		}
		
		System.out.println("Il numero più grande della serie è: "+ max);
			
		
		keyScanner.close();
	}

}
