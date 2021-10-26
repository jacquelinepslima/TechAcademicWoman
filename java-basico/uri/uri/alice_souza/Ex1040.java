package exercicio.uri.alice_souza;

import java.util.Locale;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double n1 = scan.nextDouble();
        double n2 = scan.nextDouble();
        double n3 = scan.nextDouble();
        double n4 = scan.nextDouble();
        double media = (n1 * 2 + n2 * 3 + n3 * 4 + n4) / 10;
        System.out.printf("Media: %.1f%n", media);
        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double notaExame = scan.nextDouble();
            System.out.printf("Nota do exame: %.1f%n", notaExame);
            media = (media + notaExame) / 2;
            if (media < 5.0) {
                System.out.println("Aluno reprovado.");
            } else {
                System.out.println("Aluno aprovado.");
            }
            System.out.printf("Media final: %.1f%n", media);


        }
        scan.close();
    }
}
