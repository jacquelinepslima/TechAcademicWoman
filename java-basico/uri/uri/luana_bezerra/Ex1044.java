package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1044 {
    public static void main(String[] args) {

        Scanner calculo = new Scanner(System.in);

        int A = calculo.nextInt();
        int B = calculo.nextInt();
        int maior = 0;
        int menor = 0;

        if(A>B){maior = A; menor = B;}
        else{maior = B; menor = A;}

        int multiplos = maior % menor;

        if(multiplos == 0){
            System.out.print("Sao Multiplos");}

        else{
            System.out.print("Nao sao Multiplos");}

        calculo.close();
    }
}
