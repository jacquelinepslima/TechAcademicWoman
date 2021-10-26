package exercicio.uri.caroline_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1036 {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		double A, B, C;
		
		A = src.nextDouble();
		B = src.nextDouble();
		C = src.nextDouble();
		
		double delta = B*B - 4.0*A*C;
		
		if(A == 0 || delta < 0.0 ) {
			System.out.println("Impossível calcular\n");
		}
		else {
			
			double x1 = (-B + Math.sqrt(delta))/(2.0*A);
			double x2 = (-B - Math.sqrt(delta))/(2.0*A);
			System.out.printf("R1 = %.5f%n", x1);
			System.out.printf("R2 = %.5f%n", x2);
			
		}
		
		
		src.close();
		
	}
}
