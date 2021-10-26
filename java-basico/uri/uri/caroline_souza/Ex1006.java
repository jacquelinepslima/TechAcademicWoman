package exercicio.uri.caroline_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		float A = src.nextFloat();
		float B = src.nextFloat();
		float C = src.nextFloat();
		
		float media = (A*2+B*3+C*5)/(2+3+5);
		System.out.printf("MEDIA = %.1f", media);		
		src.close();
	}
}
