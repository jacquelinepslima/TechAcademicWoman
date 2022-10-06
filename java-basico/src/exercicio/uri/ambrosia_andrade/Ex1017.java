package exercicio.uri.ambrosia_andrade;

import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args){
        // Vm = S / T;
        int tempo, velocidadeMedia;
        float espaco, calculo;

        Scanner scanner = new Scanner(System.in);

        tempo = scanner.nextInt();
        velocidadeMedia = scanner.nextInt();

        espaco = velocidadeMedia * tempo;

        calculo = espaco / 12;

        System.out.printf("%.3f", calculo);

        scanner.close();
    }
}
