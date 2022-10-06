package exercicio.uri.byanca_calixto;

import java.util.Locale;
import java.util.Scanner;

public class Ex1010 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		
		int codigo1 = src.nextInt();
		int numero1 = src.nextInt();
		float valor1 = src.nextFloat();
		
		int codigo2 = src.nextInt();
		int numero2 = src.nextInt();
		float valor2 = src.nextFloat();
		
		float valorTotal = (numero1 * valor1);
		valorTotal = valorTotal + (numero2 * valor2);
		
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);
		
		src.close();
		
	}

}
