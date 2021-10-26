package exercicio.uri.byanca_calixto;

import java.util.Locale;
import java.util.Scanner;

public class Ex1009 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		String nome = src.nextLine();
		double salario = src.nextDouble();
		double totalVendas = src.nextDouble();
		double comissao = 0.15;
		
		double totalSalario = salario + (totalVendas * comissao);
		
		System.out.printf("TOTAL = R$ %.2f", totalSalario);
		
		
		src.close();
		
	}

}
