package exercicio.uri.ana_melo;

import java.util.Scanner;

public class Ex1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x,y, contadorLinha = 1;
        String linha = "";
        x = sc.nextInt();
        y = sc.nextInt();

        for (int i = 1; i <= y ; i++){
            linha = linha + i + " ";

            if (contadorLinha == x){
                System.out.print(linha.trim());
                System.out.println();
                contadorLinha = 1;
                linha = "";
            } else {
                contadorLinha++;
            }
        }

        sc.close();
    }
}
