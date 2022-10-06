package exercicio.uri.valquiria_matter;

import java.util.Locale;
import java.util.Scanner;

public class Ex1005 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a nota 1 do aluno");
        double nota1 = scan.nextDouble();

        System.out.println("Digite a nota 2 do aluno");
        double nota2 = scan.nextDouble();

        double media = (nota1 * 3.5) + (nota2 * 7.5);

        System.out.printf("MEDIA = %.5f", media / 11);

        scan.close();


    }

}
