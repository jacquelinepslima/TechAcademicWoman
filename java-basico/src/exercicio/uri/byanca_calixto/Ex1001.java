package exercicio.uri.byanca_calixto;

import java.util.Scanner;

public class Ex1001 {

	public static void main (String[] args) {
		// Classe auxilixar para entrada de dado
		Scanner scanner = new Scanner(System.in);
		
		//declara��o das vari�veis 
		int A;
		int B;
		
		//entrada de dados (setando os valores nas viaveis)
		A = scanner.nextInt();
		B = scanner.nextInt();
		
		int X = A+B;
		
		System.out.println("X = " + X);
		
		//Fechando o scanner
		
		scanner.close();
	}
}
