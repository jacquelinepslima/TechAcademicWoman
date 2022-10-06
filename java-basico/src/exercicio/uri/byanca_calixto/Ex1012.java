package exercicio.uri.byanca_calixto;

import java.util.Locale;
import java.util.Scanner;

public class Ex1012 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
				
		double A = src.nextDouble();
		double B = src.nextDouble();
		double C = src.nextDouble();
		
		double triangulo = (A*C)/2;
		double PI = Math.PI;
		double circulo = PI*(Math.pow(C,2));	
		double trapezio = ((A+B)*C)/2;
		double quadrado = B*B;
		double retangulo = A*B;
				
		System.out.printf("TRIANGULO: %.3f%n", triangulo);
		System.out.printf("CIRCULO: %.3f%n", circulo);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio);
		System.out.printf("QUADRADO: %.3f%n", quadrado);
		System.out.printf("RETANGULO: %.3f%n", retangulo);
		
		
		src.close();
	}

}
