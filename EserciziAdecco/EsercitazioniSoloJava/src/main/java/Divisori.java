import java.util.Scanner;

public class Divisori {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyScanner=new Scanner(System.in);
		
		System.out.println("Inserisci un numero:");
		int input=keyScanner.nextInt();
		
		int index=input;
		int divisori=0;
		
		while (index>=1) {
		
			if (input%index==0) {
				divisori=input/index;			
				System.out.println(divisori);
		}
		
		index--;
		}		
		
		
		keyScanner.close();
			
		
	}

}
