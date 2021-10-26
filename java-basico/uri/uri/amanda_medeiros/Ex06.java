package exercicio.uri.amanda_medeiros;

import java.util.Locale;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		int N,linha=0,coluna=0;
		String concat="";
		double  soma=0.0;
		N = src.nextInt();
		
		double[][] matriz = new double[N][N];
		
		
		for(int i=0; i<N; i++) {
			for(int j=0;j<N;j++) {
				matriz[i][j]=src.nextDouble();
			}
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0;j<N;j++) {
				if(matriz[i][j]>0) {
					soma+=matriz[i][j];
				}
			}
		}
		linha = src.nextInt();
		coluna = src.nextInt();
		
		System.out.printf("SOMA DOS POSITIVOS: %.1f\n", soma);
		
		for(int i=linha; i==linha; i++) {
			for(int j=0;j<N;j++) {
				double numero = matriz[i][j];
				concat = concat +" "+ numero;
			}
		}
		System.out.printf("Linha escolhida: %s\n",concat);
		concat = "";
		
		for(int i=0; i<N; i++) {
			for(int j=0;j<N;j++) {
				if(j == coluna) {
					double numero = matriz[i][j];
					concat = concat +" "+ numero;
				}
			}
		}
		
		System.out.printf("Coluna escolhida: %s\n",concat);
		concat = "";
		
		for(int i=0;i<N;i++) {
			double numero = matriz[i][i];
			concat = concat +" "+ numero;
		}
		System.out.printf("Diagonal principal: %s\n",concat);
		concat = "";
		
		for(int i=0; i<N; i++) {
			for(int j=0;j<N;j++) {
				if(matriz[i][j] < 0) {
					matriz[i][j] = Math.pow(matriz[i][j],2);
				}
			}
		}
		System.out.println("Matriz Alterada:");
		for(int i=0; i==0; i++) {
			for(int j=0;j<N;j++) {
				double numero = matriz[i][j];
				concat = concat +" "+ numero;
			}
		}
		System.out.printf("%s\n",concat);
		concat = "";
		
		for(int i=1; i==1; i++) {
			for(int j=0;j<N;j++) {
				double numero = matriz[i][j];
				concat = concat +" "+ numero;
			}
		}
		System.out.printf("%s\n",concat);
		concat = "";
		
		for(int i=2; i==2; i++) {
			for(int j=0;j<N;j++) {
				double numero = matriz[i][j];
				concat = concat +" "+ numero;
			}
		}
		System.out.printf("%s\n",concat);
		concat = "";
		src.close();
	}

}
