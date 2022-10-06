package exercicio.uri.bruna_lima;

import java.util.Locale;
import java.util.Scanner;

public class Ex1079 {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner entrada = new Scanner(System.in);

        int n = entrada.nextInt();
        double n1, n2, n3, media = 0.0, soma = 0.0;

        for(int i = 0; i < n; i++) {
            n1 = entrada.nextDouble();
            n2 = entrada.nextDouble();
            n3 = entrada.nextDouble();

            soma = (n1*2.0) + (n2*3.0) + (n3*5.0);
            media = soma / 10.0;
            System.out.printf("%.1f%n", media);
        }
    }
}
