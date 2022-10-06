package exercicio.uri.luana_bezerra;

import java.util.Scanner;

public class Ex1072 {
    public static void main(String[] args) {
        Scanner exercicio = new Scanner(System.in);

        int N = 0;
        int X = exercicio.nextInt();
        int contadorDeRepeticao = 0;
        int contadorDeRepeticao2 = 0;

        while((N < 10000) && (X >= 0)){
            if((X >= 10) && (X <= 20)){
                N++;
                contadorDeRepeticao++;
                X = exercicio.nextInt();
            }

            else{
                N++;
                contadorDeRepeticao2++;
                X = exercicio.nextInt();
            }
        }

        System.out.println(contadorDeRepeticao + " in");
        System.out.println(contadorDeRepeticao2 + " out");

        exercicio.close();
    }
}
