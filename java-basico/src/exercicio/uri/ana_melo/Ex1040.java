package exercicio.uri.ana_melo;

import java.util.Locale;
import java.util.Scanner;

public class Ex1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        float nota1, nota2, nota3, nota4, media, exame, mediaFinal;

        nota1 = sc.nextFloat();
        nota2 = sc.nextFloat();
        nota3 = sc.nextFloat();
        nota4 = sc.nextFloat();

        media = (nota1*2 + nota2*3 + nota3*4 + nota4*1)/10;

        if(media >= 7.0){
            System.out.println("Aluno aprovado.");
        } else if(media < 5.0){
            System.out.println("Aluno reprovado.");
        } else{
            System.out.println("Aluno em exame.");
            System.out.print("Nota do exame: ");
            exame = sc.nextFloat();
            mediaFinal = (exame + media)/2;

            if (mediaFinal >= 5.0){
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }

            System.out.printf("Media final: %.1f%n", mediaFinal);
        }

        sc.close();
    }
}
