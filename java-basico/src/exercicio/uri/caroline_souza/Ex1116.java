package exercicio.uri.caroline_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1116 {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		double X,Y,result;
		
		int N = src.nextInt();
		for(int i=0; i<N; i++) {
			X = src.nextDouble();
			Y = src.nextDouble();
			if(Y == 0) {
				System.out.println("divisao impossivel");
			}else {
				result = X/Y;
				System.out.printf("%.1f",result);
			}
		}
		src.close();
	}

}
