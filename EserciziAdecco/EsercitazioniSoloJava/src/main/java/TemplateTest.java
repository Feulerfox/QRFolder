import java.util.Scanner;

public class TemplateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyScanner=new Scanner(System.in);
		
		System.out.println("Inserisci un numero da specchiare");
		int input=keyScanner.nextInt();
		
		int index=input;
		String parolaString="";
		
		
		while(index>=0) {

			parolaString+=input;
			index--;
			
		}
		System.out.println(parolaString);
		
		keyScanner.close();
	}

}
