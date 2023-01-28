import java.util.Scanner;

public class Palindromi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyScanner=new Scanner(System.in);
		
		System.out.println("Inserisci la parola:");
		String inputString=keyScanner.nextLine();
		
		int index=inputString.length()-1;
		String parolaContrario="";
		
		while (index>=0) {
			
			char inputChar=inputString.charAt(index);
//			System.out.print(inputChar); controllo che stampi le lettere giuste dall'ultima alla prima
			parolaContrario+=inputChar;
			index--;
						
		}
		
		System.out.println("La parola al contrario è: " + parolaContrario);
		
		System.out.println("Le parole sono palindrome?");
		
		if(parolaContrario.equalsIgnoreCase(inputString))
			System.out.println("Yes");
		else 
			System.out.println("Nop");
			
			
		
		keyScanner.close();
	}

}
