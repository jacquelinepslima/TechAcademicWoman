package exercicio.uri.caroline_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1038 {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		int codigo = src.nextInt();
		int quantidade = src.nextInt();
		double preco=0; 
		
		if(codigo == 1) {
			preco = quantidade*4.00;
		}if(codigo == 2) {
			preco = quantidade*4.50;
		}if(codigo == 3) {
			preco = quantidade*5.00;
		}if(codigo == 4) {
			preco = quantidade*2.00;
		}else if(codigo == 5){
			preco = quantidade*1.50;
		}
		
		System.out.printf("Total: R$ %.2f",preco);
		
		
		src.close();
		
		
	}

}
