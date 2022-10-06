package exercicio.uri.paula_santos;

import java.util.Locale;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner calculo = new Scanner(System.in);

        float N1 = calculo.nextFloat();
        float N2 = calculo.nextFloat();
        float N3 = calculo.nextFloat();
        float N4 = calculo.nextFloat();

        float media = (N1*2 + N2*3 + N3*4 + N4*1)/10;

        if(media >= 7.0){
            System.out.printf("Media: %.1f%n", media);
            System.out.print("Aluno aprovado.");
        }

        else if(media < 5.0){
            System.out.printf("Media: %.1f%n", media);
            System.out.print("Aluno reprovado.");
        }

        else if(media >= 5.0 && media <= 6.9){
            System.out.printf("Media: %.1f%n", media);
            System.out.print("Aluno em exame.");

            Scanner exame = new Scanner(System.in);

            float notaExame = exame.nextFloat();
            float mediaExame = (notaExame+media)/2;

            if(mediaExame >= 5.0){
                System.out.printf("Media: %.1f%n", media);
                System.out.println("Aluno em exame.");
                System.out.printf("Nota do exame: %.1f%n", notaExame);
                System.out.println("Aluno aprovado.");
                System.out.printf("Media final: %.1f", mediaExame);

            }

            else if(mediaExame <= 4.9) {
                System.out.printf("Media: %.1f%n", media);
                System.out.println("Aluno em exame.");
                System.out.printf("Nota do exame: %.1f%n", notaExame);
                System.out.println("Aluno reprovado.");
                System.out.printf("Media final: %.1f", mediaExame);

            }

        exame.close();
        }

        calculo.close();
    }
}