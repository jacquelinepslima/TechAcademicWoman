package exercicio.uri.valquiria_matter;

import java.util.Locale;
import java.util.Scanner;

public class Ex1006 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota 1 do aluno");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a nota 2 do aluno");
        double nota2 = scan.nextDouble();

        System.out.println("Digite a nota 3 do aluno");
        double nota3 = scan.nextDouble();

        double total = (nota1 * 0.2) + (nota2 * 0.3) + (nota3 * 0.5);

        System.out.printf("MEDIA = %.1f",total);

        scan.close();




    }
}
