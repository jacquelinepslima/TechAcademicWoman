package exercicio.uri.natasha_busnardo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float N1 = sc.nextFloat();
        float N2 = sc.nextFloat();
        float N3 = sc.nextFloat();
        float N4 = sc.nextFloat();


        double MEDIA = ((N1 * 2) + (N2 * 3) + (N3 * 4) + (N4)) / 10.0;

        if (MEDIA >= 7.0) {
            System.out.printf("Media: %.1f %n", MEDIA);
            System.out.println("Aluno aprovado.");
        } else if (MEDIA < 5.0) {
            System.out.printf("Media: %.1f %n", MEDIA);
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Nota do exame:");
            float exame = sc.nextFloat();
            MEDIA += exame;
            MEDIA = MEDIA / 2;
            if (MEDIA >= 5.0) {
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f", MEDIA);
            } else {
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f", MEDIA);
            }
        }
    }
}
