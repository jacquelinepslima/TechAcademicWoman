package exercicio.uri.byanca_calixto;

import java.util.Locale;
import java.util.Scanner;

public class Ex1008 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		int numero = src.nextInt();
		int hora = src.nextInt();
		float valor = src.nextFloat();
		double salario = hora * valor;
		
		System.out.printf("NUMBER = %d%n", numero);
		System.out.printf("SALARY = U$ %.2f", salario);
		
		src.close();
		
	}

}
