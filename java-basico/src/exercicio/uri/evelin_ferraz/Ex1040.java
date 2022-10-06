package exercicio.uri.evelin_ferraz;

import java.util.Locale;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();

        double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + nota4 ) / 10;

        System.out.printf("Media: %.1f", media);

        if (media >= 7){
            System.out.println("");
            System.out.println("Aluno aprovado.");
        }
        else if(media < 5){
            System.out.println("");
            System.out.println("Aluno reprovado.");
        }
        else if(media >= 5 && media < 7){
            System.out.println("");
            System.out.println("Aluno em exame.");
            double exame = scanner.nextDouble();
            System.out.printf("Nota do exame: %.1f", exame);
            double mediafinal = (exame + media) /2;
            if (mediafinal >= 5){
                System.out.println("");
                System.out.println("Aluno aprovado.");
            }
            else if(mediafinal < 5){
                System.out.println("");
                System.out.println("Aluno reprovado.");
            }
            System.out.printf("Media final: %.1f", mediafinal);

        }




        scanner.close();

    }
}
