import java.util.Scanner;

public class NumeriPrimi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner keyScanner=new Scanner(System.in);
	
	System.out.println("Inserisci un numero: ");
	int input=keyScanner.nextInt();
	
	
	int index=2;
	boolean isPrime=true;
	
	
	while (index<input) {
		
		if (input%index==0 && isPrime==true) {
			
			isPrime=false;					
		}
			
		index++;			
	}
	
	System.out.println("Il numero è primo? " + isPrime);
	
	keyScanner.close();
		
		
		
				
	}

}
