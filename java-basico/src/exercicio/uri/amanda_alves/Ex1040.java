package exercicio.uri.amanda_alves;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.ENGLISH);
        Scanner scanner = new Scanner(System.in);
        NumberFormat formata = new DecimalFormat("#0.0");

        double nota1 = scanner.nextDouble();
        double nota2 = scanner.nextDouble();
        double nota3 = scanner.nextDouble();
        double nota4 = scanner.nextDouble();

        int pesoNota1 = 2;
        int pesoNota2 = 3;
        int pesoNota3 = 4;
        int pesoNota4 = 1;

        double media = ((nota1 * pesoNota1) + (nota2 * pesoNota2) + (nota3 * pesoNota3) + (nota4 * pesoNota4)) / (pesoNota1 + pesoNota2 + pesoNota3 + pesoNota4);

        if (media >= 7.0){
            System.out.println("Media final: " + formata.format(media));
            System.out.println("Aluno aprovado.");
        }else if (media < 5.0){
            System.out.println("Media final: " + formata.format(media));
            System.out.println("Aluno reprovado.");
        }else if (5.0 <= media && media <= 6.9){
            System.out.println("Media: " + formata.format(media));
            System.out.println("Aluno em exame.");

            double notaExame = scanner.nextDouble();
            double novaMedia = (notaExame + media) / 2;
            if (novaMedia >= 5.0){
                System.out.println("Aluno aprovado.");
            }else{
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + formata.format(novaMedia));
        }
    }
}
