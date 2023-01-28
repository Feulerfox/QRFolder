import java.util.Scanner;

public class EsercizioHardcore1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner keyScanner=new Scanner(System.in);
		
		System.out.println("Inserisci in input numeri a cazzo che vuoi ma bada bene, povero coglione, non mettere numeri negativi");
		
		int input=1;
		String serieString="";
		
		while (-1*input<0) {
			input=keyScanner.nextInt();
			
			if (input>0)
				serieString+=input + " ";
		}
			System.out.println("Serie di numeri: " + serieString);
		
		keyScanner.close();
	}

}
