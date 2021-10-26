package exercicio.uri.caroline_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1045 {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		double A, B, C,aux;
		A = src.nextDouble();
		B = src.nextDouble();
		C = src.nextDouble();
		
		if(A < B) {
			aux = A;
			A = B;
			B = aux;
		}if(A < C) {
			aux = A;
			A = C;
			C = aux;
		}if(B < C) {
			aux = B;
			B = C;
			C = aux;
		}
		//System.out.printf("A: %.2f B: %.2f C: %.2f",A,B,C);
		if( A >= B +C) {
			System.out.printf("NAO FORMA TRIANGULO\n");
			
		}
		if(A*A == B*B + C*C) {
			System.out.printf("TRIANGULO RETANGULO\n");
		}if(A*A > B*B + C*C) {
			System.out.printf("TRIANGULO OBTUSANGULO\n");
		}if(A*A < B*B + C*C) {
			System.out.printf("TRIANGULO ACUTANGULO\n");
		}if(A == B && A == C) {
			System.out.printf("TRIANGULO EQUILATERO\n");
		}if(A == B || A ==C || B == C) {
			System.out.printf("TRIANGULO ISOSCELES\n");
		}
		src.close();
	}

}
