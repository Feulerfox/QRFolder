import java.util.Scanner;

public class AnniBisestili {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyScanner=new Scanner(System.in);
		
		System.out.println("Inserisci l'anno: ");
		int anno=keyScanner.nextInt();
		
		if ((anno%4==0 && anno%100!=0) || anno%400==0)
			System.out.println("Bisestile");
		else
			System.out.println("Non bisestile");
		
		keyScanner.close();
	}

}
