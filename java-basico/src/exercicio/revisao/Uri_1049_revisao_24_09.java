package exercicio.revisao;

import java.util.Scanner;

/*Neste problema, você deverá ler 3 palavras que definem o tipo de animal possível segundo o
esquema abaixo, da esquerda para a direita.  Em seguida conclua qual dos animais seguintes
foi escolhido, através das três palavras fornecidas.

Entrada
A entrada contém 3 palavras, uma em cada linha, necessárias para identificar o
 animal segundo a figura acima, com todas as letras minúsculas.

Saída
Imprima o nome do animal correspondente à entrada fornecida.
* */
public class Uri_1049_revisao_24_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String p1, p2, p3;
        p1= scan.nextLine();
        p2= scan.nextLine();
        p3= scan.nextLine();

        if (p1.equals("vertebrado")){
        	if(p2.equals("ave")) {
        		if(p3.equals("carnivoro")) {
        			System.out.println("aguia");
        			
        		}else if(p3.equals("onivoro")) {
                    System.out.println("pomba");
        		}
        		
        	}else if(p2.equals("mamifero")) {
        		if(p3.equals("onivoro")){
                    System.out.println("homem");
                }else if (p3.equals("herbivoro")){
                    System.out.println("vaca");
                }
        	}
        	
        }else if(p1.equals("invertebrado")) {
            if(p2.equals("inseto")){
                if(p3.equals("hematofago")){
                    System.out.println("pulga");
                }else if (p3.equals("herbivoro")){
                    System.out.println("lagarta");
                }
            } else if (p2.equals("anelideo")){
                if (p3.equals("hematofago")){
                    System.out.println("sanguessuga");
                } else if (p3.equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }

        scan.close();
    }
}
