package exercicio.uri.byanca_calixto;

import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		double A = src.nextDouble();
		double B = src.nextDouble();
		
		double media = (A*3.5+B*7.5)/(3.5+7.5);
		System.out.printf("MEDIA = %.5f", media);		
		src.close();
		
	}
}
