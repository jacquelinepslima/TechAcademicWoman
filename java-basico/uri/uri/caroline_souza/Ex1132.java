package exercicio.uri.caroline_souza;

import java.util.Scanner;

public class Ex1132 {
	public static void main(String[]args) {
		Scanner src = new Scanner(System.in);
		
		int X,Y,acumulador=0,aux;
		X = src.nextInt();
		Y = src.nextInt();
		
		if(X>Y) {
			aux = X;
			X = Y;
			Y = aux;
			
		}
		for(int i = X; i >= X && i <= Y; i++) {
			if(i%13!=0) {
				acumulador+=i;
			}
		}
		
		System.out.printf("%d",acumulador);
		
		src.close();
	}

}
