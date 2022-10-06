package exercicio.uri.giovanna_santana;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int tempo, velocidade;
        double vlCombustivel;

        tempo = scanner.nextInt();
        velocidade = scanner.nextInt();

        /* aqui precisa  ter pelo menos 1 dos valores em double para sofrer um
            casting implicito, que é conversao de uma tipo de dados maior para
            uma menor
         */

        vlCombustivel = (double)tempo * velocidade / 12;

        System.out.printf("%.3f%n", vlCombustivel);

        scanner.close();
    }
}
