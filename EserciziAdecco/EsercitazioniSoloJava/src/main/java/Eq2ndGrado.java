import java.util.Scanner;

public class Eq2ndGrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner keyScanner=new Scanner(System.in);
		
		System.out.println("Inserisci gli scalari per x^2, x, e la costante c:");
		int a=keyScanner.nextInt(), b=keyScanner.nextInt(), c=keyScanner.nextInt();
		
		double x1,x2;
		
		double denominatore=2*a;	
		double delta= Math.sqrt(Math.pow(b, 2) - 4*a*c);
		x1=(-b+delta)/denominatore;
		x2=(-b-delta)/denominatore;
		
		System.out.println("Le radici reali sono: " + x1 + " e " + x2);
		
		
		
		
		keyScanner.close();
	}

}
