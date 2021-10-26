package exercicio.uri.caroline_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1051 {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		double salario = src.nextDouble();
		double imposto;
		if(salario >= 0.0 && salario <= 2000.00) {		
			System.out.println("Isento");
		}else if(salario >= 2000.01 && salario <= 3000.00) {
			imposto =((0.08*1000.00) + (0.08*2.00));
			System.out.printf("R$ %.2f",imposto);
		}else if(salario >= 3000.01 && salario <= 4500.00) {
			imposto =((0.08*1000.00) + (0.18*2.00));
			System.out.printf("R$ %.2f",imposto);
		}else if(salario > 4500.00) {
			imposto =((0.08*1000.00) + (0.28*2.00));
			System.out.printf("R$ %.2f",imposto);
		}
		src.close();
	}

}
