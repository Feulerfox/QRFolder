import java.util.Scanner;

public class Multipli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	Scanner keyScanner=new Scanner(System.in);
	
	System.out.println("Inserisci 2 numeri:");
	int input=keyScanner.nextInt(), input2=keyScanner.nextInt();
	
	if(input%input2==0)
		System.out.println("Il primo numero è multiplo del secondo");
	else 
		System.out.println("Il primo numero non è multiplo del secondo");
	
		
	keyScanner.close();
	}

}
