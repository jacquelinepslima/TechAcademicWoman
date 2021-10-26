package exercicio.uri.caroline_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1094 {
	public static void main(String[]args) {
		Locale.setDefault(Locale.US);
		Scanner src = new Scanner(System.in);
		
		int casos,quantia;
		double coelhos=0.0,ratos=0.0,sapos=0.0,totalCobaia=0.0,percentual=0.0;
		char tipo;
		
		casos = src.nextInt();
		
		
		for(int i=0; i<casos; i++) {
			quantia = src.nextInt();
			if(quantia < 1 || quantia >15) {
				 System.exit(0);
			}
			
			tipo = src.next().charAt(0);
			if(tipo == 'C') {
				coelhos += + quantia;
			}else if(tipo == 'R') {
				ratos+= + quantia;
			}else if(tipo == 'S') {
				sapos+= + quantia;
			}
			
		}
		totalCobaia = ratos+sapos+coelhos;
		
		System.out.printf("Total: %.0f\n",totalCobaia);
		System.out.printf("Total de coelhos: %.0f\n",coelhos);
		System.out.printf("Total de ratos: %.0f\n",ratos);
		System.out.printf("Total de sapos: %.0f\n",sapos);
		
		percentual =  coelhos*100/totalCobaia;
		System.out.printf("Percentual de coelhos: %.2f %%\n",percentual);
		
		percentual =  ratos*100/totalCobaia;
		System.out.printf("Percentual de ratos: %.2f %%\n",percentual);
		
		percentual = sapos*100/totalCobaia;
		System.out.printf("Percentual de sapos: %.2f %%\n",percentual);
				
		
		src.close();
		
	}

}
