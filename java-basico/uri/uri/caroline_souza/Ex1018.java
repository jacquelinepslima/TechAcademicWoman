package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1018 {
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();
		int cem, cinquenta, vinte, dez, cinco, dois, um;
		int resto;
		
		cem = N/100;
		resto = N % 100;
		cinquenta = resto / 50;
		resto = resto % 50; 
		vinte = resto / 20;
		resto = resto % 20;
		dez = resto / 10;
		resto = resto % 10;
		cinco = resto / 5;
		resto = resto % 5;
		dois = resto / 2;
		resto = resto % 2;
		um = resto / 1;
		
		
		System.out.printf("%d \n", N);
		System.out.printf("%d nota(s) de R$ 100,00\n",cem);
		System.out.printf("%d nota(s) de R$ 50,00\n",cinquenta);
		System.out.printf("%d nota(s) de R$ 20,00\n",vinte);
		System.out.printf("%d nota(s) de R$ 10,00\n",dez);
		System.out.printf("%d nota(s) de R$ 5,00\n",cinco);
		System.out.printf("%d nota(s) de R$ 2,00\n",dois);
		System.out.printf("%d nota(s) de R$ 1,00\n",um);
		
		scanner.close();
	}

}
