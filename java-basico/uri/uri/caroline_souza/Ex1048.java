package exercicio.uri.caroline_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1048 {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		double salario = src.nextDouble();
		double reajuste=0;
		int percentual = 0;
		
		if(salario <= 400.00) {
			System.out.print("linha1");
			reajuste = (salario*0.15)/1;
			salario += reajuste;
			percentual = 15;
		}else if(salario <= 400.01) {
			System.out.print("linha2");
			reajuste = (salario*0.12)/1;
			salario += reajuste;
			percentual = 12;
		}else if(salario <= 800.01) {
			System.out.print("linha3");
			reajuste = (salario*0.10)/1;
			salario += reajuste;
			percentual = 10;
		}else if(salario <= 1200.1) {
			System.out.print("linha4");
			reajuste = (salario*0.07)/1;
			salario += reajuste;
			percentual = 7;
		}else {
			reajuste = (salario*0.04)/1;
			salario += reajuste;
			percentual = 4;
		}
		
		System.out.printf("Novo salario: %.2f ", salario);
		System.out.printf("\nReajuste ganho: %.2f", reajuste);
		System.out.printf("\nEm percentual: %d %%", percentual);
		
		src.close();
	}

}
