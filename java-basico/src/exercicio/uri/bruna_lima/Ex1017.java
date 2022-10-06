package exercicio.uri.bruna_lima;

import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int tempo = entrada.nextInt();
        int velocidade = entrada.nextInt();
        double consumo =  (tempo*velocidade) / 12.0;

        System.out.printf("%.3f%n", consumo);

        entrada.close();
    }
}
