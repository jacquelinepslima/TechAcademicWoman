package exercicio.uri.caroline_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1040 {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		float N1,N2,N3,N4;
		
		N1 = src.nextFloat();
		N2 = src.nextFloat();
		N3 = src.nextFloat();
		N4 = src.nextFloat();
		
		float media = (N1*2+N2*3+N3*4+N4*1)/(2+3+4+1);
		System.out.printf("Media: %.1f\n",media);
		
		if(media >= 7.0) {
			System.out.println("\nAluno aprovado.\n");
		}else if(media < 5.0) {
			System.out.println("Aluno reprovado.\n");
		}else if(media >= 5.0 && media <= 6.9) {
			System.out.println("Aluno em exame.\n");
			float nota = src.nextFloat();
			System.out.printf("Nota do exame: %.1f\n",nota);
			float mediaFinal = (media+nota)/2;
			
			if(mediaFinal >= 5.0) {
				System.out.println("\nAluno aprovado.\n");
			}else {
				System.out.println("Aluno reprovado.\n");
			}
			
			System.out.printf("Media final: %.1f",mediaFinal); 
		}
		src.close();
		
		
	}

}
