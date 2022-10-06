package exercicio.uri.caroline_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1037 {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		double valor = src.nextDouble();
		if(valor >=0 && valor <= 25) {
			System.out.print("Intervalor (0,25]");
		}else if(valor > 25 && valor <= 50) {
			System.out.print("Intervalor (25,50]");
		}else if(valor > 50 && valor <= 75) {
			System.out.print("Intervalor (50,75]");
		}else if(valor > 75 && valor <= 100) {
			System.out.print("Intervalor (75,100]");
		}else {
			System.out.print("Fora do intervalo");
		}
		
		src.close();
	
	}

}
