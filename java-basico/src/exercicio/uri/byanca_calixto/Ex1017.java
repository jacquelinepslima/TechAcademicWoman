package exercicio.uri.byanca_calixto;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		int tempo, velocidade;
		double combustivel;
		
		tempo = src.nextInt();
		velocidade = src.nextInt();
		 // aqui precisa  ter pelo menos 1 dos valor em double para sofre um  casting implicito

		combustivel = (double) tempo * velocidade/12.0;
		System.out.printf("%.3f%n", combustivel);
			
		src.close();

	}

}
