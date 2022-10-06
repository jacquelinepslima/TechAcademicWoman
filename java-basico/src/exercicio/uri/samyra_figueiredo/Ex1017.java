package exercicio.uri.samyra_figueiredo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1017 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int tempo, velocidade;
        double km, media;

        tempo = sc.nextInt();
        velocidade = sc.nextInt();

        km = tempo * velocidade;
        media = km/12;

        System.out.printf("%.3f", media);

        sc.close();
    }
}
