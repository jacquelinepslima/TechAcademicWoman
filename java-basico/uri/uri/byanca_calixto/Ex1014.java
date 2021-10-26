package exercicio.uri.byanca_calixto;

import java.util.Locale;
import java.util.Scanner;

public class Ex1014 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner (System.in);
		
		int distancia = src.nextInt();
		float totalCombustivel = src.nextFloat();
		
		double consumoMedio = distancia/totalCombustivel;
		
		System.out.printf("%.3f km/l", consumoMedio);
		src.close();
		
	}

}
